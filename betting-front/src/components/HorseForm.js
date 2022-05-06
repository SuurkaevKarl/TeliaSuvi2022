import Button from "./Button"

function HorseForm({click}) {
  return (
    <div>
        <form>
            <label for="regName">Horse name:</label><br/>
            <input type="text" id="regName" name="regName"></input><br/>
            <label for="regColor">Horse color:</label><br/>
            <input type="text" id="regColor" name="regColor"></input><br/>
        </form>
        <Button text="Register Horse" style={{color: "green"}} click={click}/>
    </div>
  )
}

export default HorseForm
