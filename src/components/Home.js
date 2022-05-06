import React, { useState, useEffect } from 'react';
import Header from '../components/HomeComponents/Header.jsx';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../assets/css/TicTacToe.css';


export default function Home(props) {

  let titulo1 = "Bienvenido a la aplicación de MovilidadResponsable";
  let titulo2 = "Selecciona tu MVP y comienza tu viaje!";

  return (
    <div>
      <Header titulo1={titulo1} titulo2={titulo2} />
    </div>
    
  );

}