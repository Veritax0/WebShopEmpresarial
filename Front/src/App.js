import './App.css';
import CarouselComponent from './components/Carrousel';

function App() {
  return (
    <div className="App">
      <div className="banner"> 
        <div className='banner2'>
          <div  className='columna'></div>
          <div className='columna2'><div className="banner_item_location">
            <input type="text" placeholder="Buscar" />
            <button className="boton_busqueda">Buscar</button>
          </div></div>
          <div  className='columna'><button className="carrito"></button> </div>
        </div>
        <nav>
                <ul>
                  <li><a href="/">Inicio</a></li>
                  <li><a href="/nosotros">Nosotros</a></li>
                  <li><a href="/servicios">Servicios</a></li>
                </ul>
          </nav>
        
      </div>
      <div className="banner3">
        <CarouselComponent></CarouselComponent>
        <div>
          <img src='https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRAPCOj9Mg9sDlaVQki34-XMKq9KFs8PJSOeA&usqp=CAU'></img>
        </div>
      </div>
    </div>
    
  );
}

export default App;
