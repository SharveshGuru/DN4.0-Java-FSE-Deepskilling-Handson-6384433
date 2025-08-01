function IndianPlayers() {
  const indianPlayers = ['Sachin', 'Dhoni', 'Virat', 'Rohit', 'Yuvraj', 'Raina'];
  const [firstPlayer, secondPlayer] = indianPlayers;
  console.log('Demonstrating Destructuring:', firstPlayer, secondPlayer);

  const oddPlayers = indianPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = indianPlayers.filter((_, index) => index % 2 !== 0);

  const positionWords = ['First', 'Second', 'Third', 'Fourth', 'Fifth', 'Sixth'];

  const T20players = ['First Player', 'Second Player', 'Third Player'];
  const RanjiTrophy = ['Fourth Player', 'Fifth Player', 'Sixth Player'];

  const mergedPlayers = [...T20players, ...RanjiTrophy];

  return (
    <>
      <h1>Odd Players</h1>
      <ul>
        {oddPlayers.map((player, index) => (
          <li key={index}>
            {positionWords[index * 2]} : {player}{(index * 2) + 1}
          </li>
        ))}
      </ul>

      <h1>Even Players</h1>
      <ul>
        {evenPlayers.map((player, index) => (
          <li key={index}>
            {positionWords[(index * 2) + 1]} : {player}{(index * 2) + 2}
          </li>
        ))}
      </ul>

      <h1>List of Indian Players Merged:</h1>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>
            Mr. {player}
          </li>
        ))}
      </ul>
    </>
  );
}

export default IndianPlayers;
