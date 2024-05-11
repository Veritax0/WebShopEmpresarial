import React, { useState } from 'react';
import Carousel from 'react-bootstrap/Carousel';
import '../styles/CarouselComponent.css';
import publicidad1 from "../images/1.png";
import publicidad2 from "../images/2.png";
import publicidad3 from "../images/3.png";
import publicidad4 from "../images/4.png";

function CarouselComponent() {
  const [index, setIndex] = useState(0);

  const handleSelect = (selectedIndex) => {
    setIndex(selectedIndex);
  };

  return (
    <div className="carousel-container" >
      <Carousel activeIndex={index} onSelect={handleSelect}>
        <Carousel.Item interval={3000}>
          <img src={publicidad1} alt="Promo Image 1" />
          <Carousel.Caption>

           
          </Carousel.Caption>
        </Carousel.Item>
        
        <Carousel.Item interval={3000}>
          <img src={publicidad2} alt="Promo Image 2" />
          <Carousel.Caption>
          
           
          </Carousel.Caption>
        </Carousel.Item>
        
        <Carousel.Item interval={3000}>
          <img src={publicidad3} alt="Promo Image 3" />
          <Carousel.Caption>
          
          </Carousel.Caption>
        </Carousel.Item>

        
      </Carousel>
    </div>
  );
}

export default CarouselComponent;
