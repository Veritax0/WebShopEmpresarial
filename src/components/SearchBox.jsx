import React from "react";
import "../styles/SearchBox.css";

const SearchBox = () => {
    return (

        <div className="Contenedorsb" >
            <div className="box">

                <input className="SearchBox" type="text" placeholder="Buscar" />
            </div>
            <div className="boton">

                <button className="Boton_busqueda">Buscar</button>
            </div>
        </div>
    )
}

export default SearchBox;