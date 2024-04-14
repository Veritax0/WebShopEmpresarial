import React from "react";
import "../styles/Registro.css";

const Registro = () => {
    return (

        <div className="registro-container">
            <form className="formulario-registro">
                <label htmlFor="username">Nombre de usuario:</label>
                <input type="text" id="username" name="username" required />

                <label htmlFor="email">Correo electrónico:</label>
                <input type="email" id="email" name="email" required />

                <label htmlFor="password">Contraseña:</label>
                <input type="password" id="password" name="password" required />

                <button type="submit">Registrarse</button>
            </form>
        </div>

    )
}

export default Registro;

