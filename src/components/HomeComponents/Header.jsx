import React from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import '../../assets/css/TicTacToe.css';
import {Button} from 'react-bootstrap';
import frontimagees from '../../assets/images/gamefrontes.jpg';



export default function Header(props) {

    return (
      <div><div>
      <h1>{props.titulo1}</h1>
      <p>{props.titulo2}</p>
      </div>
      <div>
      <img id="frontpage" src={frontimagees} alt="Frontimage"/>
      </div>
      </div>
    );
    }