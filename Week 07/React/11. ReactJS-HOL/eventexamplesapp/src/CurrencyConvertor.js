import React, { useState } from 'react';

function CurrencyConvertor() {
  const [amount, setAmount] = useState('');
  const [currency, setCurrency] = useState('');

  // Assuming static conversion rate: 1 Euro = 80 INR
  const rupeeToEuroConversionRate = 80;

  const handleSubmit = (e) => {
    e.preventDefault();

    if (currency.toLowerCase() === "euro") {
      const euroAmount = parseFloat(amount) * rupeeToEuroConversionRate;
      window.alert(`Converting to Euro Amount is ${euroAmount}`);
    } else {
      window.alert('Please enter "Euro" as Currency to convert');
    }
  };

  return (
    <div>
      <h1 style={{ color: 'green', fontWeight: 'bold' }}>Currency Convertor!!!</h1>
      <form onSubmit={handleSubmit}>
        <label>
          Amount: &nbsp;
          <input
            type="text"
            value={amount}
            onChange={e => setAmount(e.target.value)}
          />
        </label>
        <br />
        <label>
          Currency: &nbsp;
          <textarea
            value={currency}
            onChange={e => setCurrency(e.target.value)}
            rows={1}
            cols={20}
          />
        </label>
        <br />
        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default CurrencyConvertor;
