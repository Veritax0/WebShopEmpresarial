import './styles/App.css';
import Banner from './components/Banner';
import SearchBox from './components/SearchBox';
import PromoSetion from './components/PromoSection';

const App =()=>{

  return(
      <div className="App">
        <div className="ItenLocation">
           <Banner></Banner> <SearchBox></SearchBox><PromoSetion></PromoSetion>
        
        </div>
    </div>
  )
}

export default App;
