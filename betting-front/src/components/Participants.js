import Horse from "./Horse"

const Participants = ({horses}) => {
  return (
    <div>
        <h3>Registered horses:</h3>
      {horses.map((horse) => (<Horse key={horse.id} name={horse.name} color={horse.color}/>))}
    </div>
  )
}

export default Participants
