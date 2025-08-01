import React, { useState } from 'react';

function GuestPage({ onLogin }) {
  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      <h1>Please sign up.</h1>
      <button onClick={onLogin}>Login</button>
    </div>
  );
}

function UserPage({ onLogout }) {
  return (
    <div style={{ textAlign: 'center', marginTop: '100px' }}>
      <h1>Welcome back</h1>
      <button onClick={onLogout}>Logout</button>
    </div>
  );
}


function App() {
  const [loggedIn, setLoggedIn] = useState(false);

  return loggedIn
    ? <UserPage onLogout={() => setLoggedIn(false)} />
    : <GuestPage onLogin={() => setLoggedIn(true)} />;
}

export default App;
