import React, { useState } from 'react'; 

function Formulario(props) {

  const [formData, setFormData] = useState({
    nome: '',
    email: '',
    senha: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setFormData({
      ...formData,
      [name]: value
    });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    let valid = true;

    if (!formData.nome) {
      valid = false;
    }

    if (!formData.email) {
      valid = false;

    }

    if (!formData.senha) {
      valid = false;

    }

    if (valid) {
      alert('Cadastro realizado com sucesso!');
      alert(formData);
    }
  };

  const styles = {
    input: {
      width: '60%',
      height:'1%',
      padding: "4px",
      border: "1px solid gray",
    },
    form: {
      display: "flex",
      flexDirection: props.login ? "row" : "column",
      alignItems: "center",
      justifyContent: "center",
      backgroundColor: "white",
      height: "100%",
      padding: "10px",
      borderRadius: "4px 0px 0px 4px"
    } 
  }

  return (
    <div>
      <form onSubmit={handleSubmit} style={styles.form}>
        <div>
          { props.cadastro ?
            <>
              <label htmlFor="nome">Nome:</label>
              <input
                type="text"
                id="nome"
                name="nome"
                value={formData.nome}
                onChange={handleChange}
                style={styles.input}
              />
            </>
          : null}
        </div>
        
        <div>
          <label htmlFor="email">E-mail:</label>
          <input
            type="email"
            id="email"
            name="email"
            value={formData.email}
            onChange={handleChange}
            style={styles.input}
          />
        </div>

        <div>
          <label htmlFor="senha">Senha:</label>
          <input
            type="password"
            id="senha"
            name="senha"
            value={formData.senha}
            onChange={handleChange}
            style={styles.input}
          />
        </div>

        <button type="submit">{props.login ? "Login" : "Cadastrar"}</button>
      </form>
    </div>
  );
};

export default Formulario