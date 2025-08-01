import React, { useState } from 'react';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  const [counter, setCounter] = useState(5);

  const sayHello = () => {
    window.alert('Hello! Member1');
  };

  const increment = () => {
    setCounter(prev => prev + 1);
    sayHello();
  };

  const decrement = () => setCounter(prev => prev - 1);

  const sayWelcome = (msg) => {
    window.alert(msg);
  };

  const handleClick = () => {
    window.alert('I was clicked');
  };

  return (
    <div style={{ margin: '32px' }}>
      <div>{counter}</div>
      <button onClick={increment}>Increment</button>
      <br />
      <button onClick={decrement}>Decrement</button>
      <br />
      <button onClick={() => sayWelcome('welcome')}>Say welcome</button>
      <br />
      <button onClick={handleClick}>Click on me</button>
      <br /><br />
      <CurrencyConvertor />
    </div>
  );
}

export default App;
