import Button from "./Button"
import Participants from "./Participants";

function RaceForm({click, horses}) {
  return (
    <div>
        <form>
            <label for="regLocation">Race location:</label><br/>
            <input type="text" id="regLocation" name="regLocation"></input><br/>
            <label for="regDate">Race date:</label><br/>
            <input type="date" id="regDate" name="regDate"></input><br/>
        </form>
        <Participants horses={horses}/>
        <Button text="Register Race" style={{color: "green"}} click={click}/>
    </div>
  )
}

export default RaceForm
