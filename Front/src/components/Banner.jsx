import React from "react";
import "../styles/Banner.css";

const Banner =({children})=>{

    return(
<div className="Banner">
    {children || <p></p>}
</div>
    )
}


export default Banner;