import React,{useState} from 'react';
import {RiMenu3Line, RiCloseLine} from 'react-icons/ri';
import logo from '../../assets/logo.svg'
import './navbar.css';




const Menu = () => (
<>
          <p><a href='#home'> Home</a></p>  
          <p><a href='#wgpt3'> What is GPT?</a></p> 
          <p><a href='#possibilty'> OPen AI</a></p> 
          <p><a href='#features'> Case Studies</a></p> 
          <p><a href='#blog'>blog</a></p> 

</>
)
//BEM -> Block ELement Model  naming convention
function Navbar() {
  //useState is a Hook that lets you add React state to function components
  //When would I use a Hook? If 
  //you write a function component and realize you need to add some state to it
  //, previously you had to convert it to a class.
  const[toggleMenu,setToggleMenu] = useState(false);

//toggleMenu - will let us know that we are currently show the mobileMenu or not
//setToggleMenu - is a function that is going to allow us to change the variable


return (
  <div className="gpt3__navbar">
    <div className="gpt3__navbar-links">
      <div className="gpt3__navbar-links_logo">
        <img src={logo} />
      </div>
      <div className="gpt3__navbar-links_container">
      <Menu/>
      </div>
    </div>
    <div className="gpt3__navbar-sign">
      <p>Sign in</p>
      <button type="button">Sign up</button>
    </div>
    <div className="gpt3__navbar-menu">
      {toggleMenu
        ? <RiCloseLine color="#fff" size={27} onClick={() => setToggleMenu(false)} />
        : <RiMenu3Line color="#fff" size={27} onClick={() => setToggleMenu(true)} />}
      {toggleMenu && (
      <div className="gpt3__navbar-menu_container scale-up-center">
        <div className="gpt3__navbar-menu_container-links">
        <Menu/>
        </div>
        <div className="gpt3__navbar-menu_container-links-sign">
          <p>Sign in</p>
          <button type="button">Sign up</button>
        </div>
      </div>
      )}
    </div>
  </div>
);
};

export default Navbar;