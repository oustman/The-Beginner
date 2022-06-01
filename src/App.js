import React from 'react'
import './App.css'
import {Footer, Blog, Possibilty,Features,WhatGPT3,Header} from './containers';
import{CTA,Brand,Navbar} from './components';

function App() {
  return (
    <div className='App'>
        <div className='gradient__bg'>
          <Navbar />
        </div>
        <Brand />
        <WhatGPT3 />
        <Features />
        <Possibilty />
        <CTA />
        <Blog />
        <Footer />
        <Header />
    </div>
  )
}

export default App

