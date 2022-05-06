import Header from "./components/Header";
import { useState } from "react"
import HorseForm from "./components/HorseForm";
import RaceForm from "./components/RaceForm";

function App() {
  const [horses, setHorses] = useState([
    {
        id: 1,
        name: "El Huervo",
        color: "black"
    },
    {
        id: 2,
        name: "Pedro",
        color: "brown"
    }
  ])

  const regHorse = () => {
    console.log('horse');
  }

  const regRace = () => {
    console.log('race');
  }

  return (
    <div className="container">
      <Header />
      <HorseForm click={regHorse}/>
      <RaceForm click={regRace} horses={horses}/>
    </div>
  );
}

export default App;
