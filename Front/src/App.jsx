import './styles/App.css';
import Banner from './components/Banner';
import SearchBox from './components/SearchBox';

const App =()=>{

  return(
      <div className="App">
        <div className="ItenLocation">
           <Banner>
              <SearchBox></SearchBox>
           </Banner>
        </div>
    </div>
  )
}

export default App;
