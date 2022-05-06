import logo from './assets/images/emblem_games.png';
import usuario from './assets/images/useroffline.png';
import './assets/css/App.css';
import 'bootstrap/dist/css/bootstrap.min.css';
import { Route, Routes, useNavigate} from 'react-router-dom';
import {Navbar, Nav} from 'react-bootstrap'
import React, { useState, useEffect } from 'react';
import Home from './components/Home';
import AlquilarBicicletas from './components/AlquilarBicicletas';
import AlquilarPatinetes from './components/AlquilarPatinetes';
import ES from "./assets/json/es.json"
import EN from "./assets/json/en.json"

function App() {
  
  const [lang, setLang] = useState(ES);

let text = lang;

  return (
    <div className="root">
        <Navbar bg="dark" variant="dark">
          <Navbar.Brand>
          <a>
          <img src={logo} style={{width:50, marginLeft: 50}} />
          </a>
          </Navbar.Brand>
          <Nav className="me-auto">
            <Nav.Link href="/">Página Principal</Nav.Link>
            <Nav.Link href="/alquilarbicicletas">Alquilar bicicletas</Nav.Link>
            <Nav.Link href="/alquilarpatinetes">Alquilar patinetes</Nav.Link>
          </Nav>
          <Navbar.Text>
        Daniel Brown <a>
          <img src={usuario} style={{width:50, marginLeft: 25, marginRight: 50}} />
          </a>
      </Navbar.Text>
      <Navbar.Text>
                   
      </Navbar.Text>
        </Navbar>

        

        <Routes>
          <Route path="/" element={<Home text={text}/>}/>
          <Route path="/alquilarbicicletas" element={<AlquilarBicicletas text={text}/>}/>
          <Route path="/alquilarpatinetes" element={<AlquilarPatinetes text={text}/>}/>
        </Routes>
    </div>
  );
}

export default App;
