import './styles/App.css';
import Banner from './components/Banner';
import SearchBox from './components/SearchBox';

const App =()=>{

  return(
      <div className="App">
        <div className="ItenLocation">
           <Banner></Banner> <SearchBox></SearchBox>
        </div>
    </div>
  )
}

export default App;
