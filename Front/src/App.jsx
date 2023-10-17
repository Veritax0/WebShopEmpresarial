import './styles/App.css';
import Banner from './components/Banner';
import SearchBox from './components/SearchBox';
import PromoSetion from './components/PromoSection';
import Carrousel from "./components/Carrousel";
import Carrito from './components/Carrito';
import Itemtext from './components/ItemsText';
import Logo from './components/Logo';
import BotonWhatsap from './components/BotonWhatsap';
import { Component } from 'react';
import { ProductService } from './service/ProductService';

class App extends Component{

  constructor(){
    super();
    this.state = {};
    this.ProductService = new ProductService();
  }

  componentDidMount(){
    this.ProductService.getAll().then(data => this.setState({productos: data}))
  }

  render(){
    return(
      <div className="App">
        <div className="ItenLocation">
        <Banner>
              <SearchBox></SearchBox> <Carrito></Carrito><Itemtext></Itemtext><Logo></Logo><BotonWhatsap></BotonWhatsap>
              
         </Banner>
         <Carrousel></Carrousel>
         <PromoSetion></PromoSetion>
        </div>
    </div>
  )
  }
}

export default App;
