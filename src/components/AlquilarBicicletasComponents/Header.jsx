import React, { useState, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../../assets/css/Quiz.css';
import {Button, Table} from 'react-bootstrap';
import frontimagees from '../../assets/images/frontbici.jpg';



export default function Header(props) {

  const [alquilado1, setAlquilado1] = useState("false");
  const [estado1, setEstado1] = useState("Libre");
  const [alquilado2, setAlquilado2] = useState("false");
  const [estado2, setEstado2] = useState("Libre");
  const [liberado1, setLiberado1] = useState("true");
  const [liberado2, setLiberado2] = useState("true");
  const [alquilado3, setAlquilado3] = useState("false");
  const [estado3, setEstado3] = useState("Libre");
  const [liberado3, setLiberado3] = useState("true");
  const [alquilado4, setAlquilado4] = useState("false");
  const [estado4, setEstado4] = useState("Libre");
  const [liberado4, setLiberado4] = useState("true");
  const [alquilado5, setAlquilado5] = useState("false");
  const [estado5, setEstado5] = useState("Libre");
  const [liberado5, setLiberado5] = useState("true");
  

  function reservar1(){
    setAlquilado1("true");
    setLiberado1("false");
    setAlquilado2("true");
    setLiberado2("true");
    setAlquilado3("true");
    setLiberado3("true");
    setAlquilado4("true");
    setLiberado4("true");
    setAlquilado5("true");
    setLiberado5("true");
    setEstado1("Ocupado");
  }

  function liberar1(){
    setAlquilado1("false");
    setLiberado1("true");
    setAlquilado2("false");
    setLiberado2("true");
    setAlquilado3("false");
    setLiberado3("true");
    setAlquilado4("false");
    setLiberado4("true");
    setAlquilado5("false");
    setLiberado5("true");
    setEstado1("Libre");
  }

  function reservar2(){
    setAlquilado1("true");
    setLiberado1("true");
    setAlquilado2("true");
    setLiberado2("false");
    setAlquilado3("true");
    setLiberado3("true");
    setAlquilado4("true");
    setLiberado4("true");
    setAlquilado5("true");
    setLiberado5("true");
    setEstado2("Ocupado");
  }

  function liberar2(){
    setAlquilado1("false");
    setLiberado1("true");
    setAlquilado2("false");
    setLiberado2("true");
    setAlquilado3("false");
    setLiberado3("true");
    setAlquilado4("false");
    setLiberado4("true");
    setAlquilado5("false");
    setLiberado5("true");
    setEstado2("Libre");
  }

  function reservar3(){
    setAlquilado1("true");
    setLiberado1("true");
    setAlquilado2("true");
    setLiberado2("true");
    setAlquilado3("true");
    setLiberado3("false");
    setAlquilado4("true");
    setLiberado4("true");
    setAlquilado5("true");
    setLiberado5("true");
    setEstado3("Ocupado");
  }

  function liberar3(){
    setAlquilado1("false");
    setLiberado1("true");
    setAlquilado2("false");
    setLiberado2("true");
    setAlquilado3("false");
    setLiberado3("true");
    setAlquilado4("false");
    setLiberado4("true");
    setAlquilado5("false");
    setLiberado5("true");
    setEstado3("Libre");
  }

  function reservar4(){
    setAlquilado1("true");
    setLiberado1("true");
    setAlquilado2("true");
    setLiberado2("true");
    setAlquilado3("true");
    setLiberado3("true");
    setAlquilado4("true");
    setLiberado4("false");
    setAlquilado5("true");
    setLiberado5("true");
    setEstado4("Ocupado");
  }

  function liberar4(){
    setAlquilado1("false");
    setLiberado1("true");
    setAlquilado2("false");
    setLiberado2("true");
    setAlquilado3("false");
    setLiberado3("true");
    setAlquilado4("false");
    setLiberado4("true");
    setAlquilado5("false");
    setLiberado5("true");
    setEstado4("Libre");
  }

  function reservar5(){
    setAlquilado1("true");
    setLiberado1("true");
    setAlquilado2("true");
    setLiberado2("true");
    setAlquilado3("true");
    setLiberado3("true");
    setAlquilado4("true");
    setLiberado4("true");
    setAlquilado5("true");
    setLiberado5("false");
    setEstado5("Ocupado");
  }

  function liberar5(){
    setAlquilado1("false");
    setLiberado1("true");
    setAlquilado2("false");
    setLiberado2("true");
    setAlquilado3("false");
    setLiberado3("true");
    setAlquilado4("false");
    setLiberado4("true");
    setAlquilado5("false");
    setLiberado5("true");
    setEstado5("Libre");
  }


    return (
      <div><div>
      <h1>{props.titulo1}</h1>
      <p>{props.titulo2}</p>
      <div>
      <img id="frontpage" src={frontimagees} style={{width:500, marginBottom:50}} alt="Frontimage"/>
      </div>
      </div>
        <Table striped bordered hover variant="dark">
        <thead>
          <tr>
            <th>Bicicleta ID</th>
            <th>Localización</th>
            <th>Estado</th>
            <th>Reservar</th>
            <th>Liberar</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>1</td>
            <td>Calle Gran Via Nº12</td>
            <td>{estado1}</td>
            <td><Button variant="light" onClick={reservar1} className={alquilado1 === "true" ? "no-clickable" : "clickable"}>Reservar bicicleta</Button></td>
            <td><Button variant="light" onClick={liberar1} className={liberado1 === "true" ? "no-clickable" : "clickable"}>Liberar bicicleta</Button></td>
          </tr>
          <tr>
            <td>2</td>
            <td>Calle Gran Via Nº5</td>
            <td>{estado2}</td>
            <td><Button variant="light" onClick={reservar2} className={alquilado2 === "true" ? "no-clickable" : "clickable"}>Reservar bicicleta</Button></td>
            <td><Button variant="light" onClick={liberar2} className={liberado2 === "true" ? "no-clickable" : "clickable"}>Liberar bicicleta</Button></td>
          </tr>
          <tr>
            <td>3</td>
            <td>Calle Gran Via Nº18</td>
            <td>{estado3}</td>
            <td><Button variant="light" onClick={reservar3} className={alquilado3 === "true" ? "no-clickable" : "clickable"}>Reservar bicicleta</Button></td>
            <td><Button variant="light" onClick={liberar3} className={liberado3 === "true" ? "no-clickable" : "clickable"}>Liberar bicicleta</Button></td>
          </tr>
          <tr>
          <td>4</td>
            <td>Calle Gran Via Nº26</td>
            <td>{estado4}</td>
            <td><Button variant="light" onClick={reservar4} className={alquilado4 === "true" ? "no-clickable" : "clickable"}>Reservar bicicleta</Button></td>
            <td><Button variant="light" onClick={liberar4} className={liberado4 === "true" ? "no-clickable" : "clickable"}>Liberar bicicleta</Button></td>
          </tr>
          <tr>
          <td>5</td>
            <td>Calle Gran Via Nº8</td>
            <td>{estado5}</td>
            <td><Button variant="light" onClick={reservar5} className={alquilado5 === "true" ? "no-clickable" : "clickable"}>Reservar bicicleta</Button></td>
            <td><Button variant="light" onClick={liberar5} className={liberado5 === "true" ? "no-clickable" : "clickable"}>Liberar bicicleta</Button></td>
          </tr>
        </tbody>
      </Table>
      </div>
    );
    }
