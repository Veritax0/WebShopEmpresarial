import React from "react";
import "../styles/SearchBox.css";

const SearchBox =()=>{
    return(

        <div className="Contenedor" >
        <input className= "SearchBox" type="text" placeholder="Buscar" />
        <button className="Boton_busqueda">Buscar</button>
        </div>
    )
}

export default SearchBox;