import './App.css';

function App() {
  return (
    <div className="App">
      <div className="banner"> 
        <button className="carrito"></button> 
        <div className="banner_item_location">
          <input type="text" placeholder="Buscar" />
          <button className="boton_busqueda">Buscar</button>
        </div>
        <nav>
              <ul>
                <li><a href="/">Inicio</a></li>
                <li><a href="/nosotros">Nosotros</a></li>
                <li><a href="/servicios">Servicios</a></li>
              </ul>
        </nav>
      </div>
    </div>
  );
}

export default App;
