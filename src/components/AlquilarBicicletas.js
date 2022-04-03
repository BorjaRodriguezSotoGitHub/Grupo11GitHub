import React, { useState, useEffect } from 'react';
import Header from './AlquilarBicicletasComponents/Header.jsx';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../assets/css/TicTacToe.css';


export default function Home(props) {

  let titulo1 = "Alquilar bicicleta";
  let titulo2 = "Selecciona tu bicicleta y comienza tu viaje!";
  let frontimage = "frontimagees";

  return (
    <div>
      <Header titulo1={titulo1} titulo2={titulo2} frontimage={frontimage}/>
    </div>
    
  );

}