import { useState } from 'react';
import Carousel from 'react-bootstrap/Carousel';
//import Carousel de bootstrap:
//npm install bootstrap
//npm install react-bootstrap bootstrap

import ExampleCarouselImage from '../components/ExampleCarouselImage.avif';

function CarouselComponent() {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex) => {
    setIndex(selectedIndex);
  };

  return (
    <div style={{ alignContent: 'center',alignItems:'center', display: 'block', width: 700, padding: 30 }}>
      <Carousel>
        <Carousel.Item interval={5000} >
          <img src="https://media.geeksforgeeks.org/wp-content/uploads/20210425122739/2-300x115.png"/>
          <Carousel.Caption>
            <h3>Carousel</h3>
            <p>Promo1</p>
          </Carousel.Caption>
          <img  src="https://media.geeksforgeeks.org/wp-content/uploads/20210425122716/1-300x115.png"/>
        </Carousel.Item>
        <Carousel.Item interval={5000}>
          <img src="https://media.geeksforgeeks.org/wp-content/uploads/20210425122739/2-300x115.png"/>
          <Carousel.Caption>
          <h3>Carousel</h3>
            <p>Promo2</p>
          </Carousel.Caption>
          <img  src="https://media.geeksforgeeks.org/wp-content/uploads/20210425122716/1-300x115.png"/>
          
          
        </Carousel.Item>
      </Carousel>
  </div>
  );
}

export default CarouselComponent;