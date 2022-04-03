import React, { useState, useEffect } from 'react';
import Header from './AlquilarPatinetesComponents/Header.jsx';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../assets/css/TicTacToe.css';


export default function Home(props) {

  let titulo1 = "Alquilar patinete";
  let titulo2 = "Selecciona tu patinete y comienza tu viaje!";

  return (
    <div>
      <Header titulo1={titulo1} titulo2={titulo2}/>
    </div>
    
  );

}