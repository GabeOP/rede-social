import React, { useState } from 'react';
import { Link } from 'react-router-dom';
import './styles/Navbar.css';
import Formulario from './Formulario';

function Navbar({abrirModal}) {

  return(
    <nav className='wrapNav'>
      <ul className='navbar-list'>
        <ul>
          <li>
            <Link to={"/"}>Home</Link>
          </li>
        </ul>
        <ul>
            <li>
              <Formulario login/>
            </li>
            <button onClick={abrirModal}>Cadastro</button>
        </ul>
      </ul>
    </nav>
  )
}


export default Navbar;