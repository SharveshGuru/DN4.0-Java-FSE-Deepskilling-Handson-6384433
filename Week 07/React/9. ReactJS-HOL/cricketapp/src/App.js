import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';

function App() {
  const flag = false;

  return (
    <div className="App">
      <header className="App-header">
        {flag ? <ListofPlayers /> : <IndianPlayers />}
      </header>
    </div>
  );
}

export default App;
