import PropTypes from 'prop-types'

function Horse({name, color}) {
  return (
    <div className="horse">
      <span className="horseSpan" id='horseName'>{name}</span>
      <span>:</span>
      <span className="horseSpan">{color}</span>
      <input type="checkbox"></input>
      <input type="radio"></input>
    </div>
  )
}

Horse.defaultProps = {
    name: 'Undefined',
    color: 'Undefined'
}

Horse.propTypes = {
    name: PropTypes.string,
    color: PropTypes.string,
}

export default Horse
