import React, { useState } from 'react';
import './App.css'
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Home from './pages/Home';
import Navbar from './components/Navbar';
import Modal from "react-modal";
import Formulario from './components/Formulario'
import Footer from './components/Footer';

Modal.setAppElement("#root");

function App() {

  const [modalAberto, setModalAberto] = useState(false);

  return (
    <Router>
      <div className="app-container">
        <Navbar abrirModal={() => setModalAberto(true)} />

        <Modal
          isOpen={modalAberto}
          onRequestClose={() => setModalAberto(false)}
          style={{
            overlay: {
              backgroundColor: "rgba(0, 0, 0, 0.24)",
              backdropFilter: "blur(3px)"
            },
            content: {
              width: "65%",
              height: "50%",
              margin: "auto",
              textAlign: "center",
              backgroundColor: "white",
              border: '2px solid gray'
            },
          }}
        >
          <Formulario cadastro/>
        </Modal>
        <main className="content">
          <Routes>
            <Route path="/" element={<Home />} />
            
          </Routes>
        </main>
      </div>
      <Footer />
    </Router>
  );
}

export default App;
