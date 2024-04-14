import React from "react";
import { useNavigate } from 'react-router-dom'; // Importa useNavigate
import "../styles/BotonCarrito.css";
import CarrritoImage from "../images/carrito2.png";

const BotonCarrito = () => {
    const navigate = useNavigate(); // Utiliza el hook useNavigate

    const handleCartClick = () => {
        navigate('/cart'); // Cambia esto a tu ruta del resumen del carrito
    };

    return (
        <div className="Carrito ">
            <button className="Boton" onClick={handleCartClick}>
                <img src={CarrritoImage} alt="Descripción de la imagen" className="Image" />
            </button>
        </div>
    );
};

export default BotonCarrito;