import './styles/App.css';
import Banner from './components/Banner';
import SearchBox from './components/SearchBox';
import PromoSetion from './components/PromoSection';

const App =()=>{

  return(
      <div className="App">
        <div className="ItenLocation">
        <Banner>
              <SearchBox></SearchBox>
         </Banner>
         <PromoSetion></PromoSetion>
        </div>
    </div>
  )
}

export default App;
