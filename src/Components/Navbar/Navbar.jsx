
import React from "react";
import { Link } from "react-router-dom";
import './Navbar.css'


export default () => {
    return (
        <nav className="navbar navbar-expand-lg navbar-light">
            <div className="container-fluid">
                <button className="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                    aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                    <span className="navbar-toggler-icon"></span>
                </button>
                <div className="collapse navbar-collapse" id="navbarNav">
                    <div className="nav">
                        <div className="navLeft">
                            <h3>Agenciabluiz</h3>
                        </div>
                        <div className="navRight">
                            <ul>
                                <li>
                                    <Link to="/Navbar">
                                        <a>Inicial</a>
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/Login">
                                        <a>Cadastro</a>
                                    </Link>
                                </li>                                
                                
                                <li><a href="https://api.whatsapp.com/send?phone=5521979009967&text=seja%20muito%20bem%20vindo%20">Contato</a></li>

                                <li><a href="https://forbes.com.br/forbeslife/2022/01/conheca-os-10-lugares-mais-lindos-do-mundo-segundo-a-ciencia/">Conheça os melhores lugares</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>
    );
}