import './App.css';

const offices = [
  {
    id: 1,
    name: "Downtown View",
    rent: 55000,
    address: "101 Main St, Downtown",
    image: "https://images.unsplash.com/photo-1506744038136-46273834b3fb?auto=format&fit=crop&w=500&q=80"
  },
  {
    id: 2,
    name: "Uptown Plaza",
    rent: 75000,
    address: "202 Uptown Rd, City Center",
    image: "https://images.unsplash.com/photo-1464983953574-0892a716854b?auto=format&fit=crop&w=500&q=80"
  },
  {
    id: 3,
    name: "Central Hub",
    rent: 65000,
    address: "303 Central Blvd, Midtown",
    image: "https://images.unsplash.com/photo-1515378791036-0648a3ef77b2?auto=format&fit=crop&w=500&q=80"
  },
  {
    id: 4,
    name: "Budget Space",
    rent: 40000,
    address: "404 Low St, Suburbia",
    image: "https://images.unsplash.com/photo-1470770841072-f978cf4d019e?auto=format&fit=crop&w=500&q=80"
  }
];

const getRentColor = (rent) => (rent < 60000 ? 'red' : 'green');

function App() {
  return (
    <div className="App">
      <h1>Office Space Rental App</h1>
      <div className="office-list">
        {offices.map(office => (
          <div className="office-card" key={office.id}>
            <img src={office.image} alt={office.name} className="office-img" />
            <h2>{office.name}</h2>
            <p><strong>Address:</strong> {office.address}</p>
            <p>
              <strong>Rent:</strong>{' '}
              <span style={{ color: getRentColor(office.rent) }}>
                ₹{office.rent}
              </span>
            </p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
