import PropTypes from 'prop-types'

function Race({location, time}) {
  return (
    <div>
      <span>{location}</span>
      <span>{time}</span>
      <span>{winner}</span>
    </div>
  )
}

Horse.defaultProps = {
    name: 'Undefined',
    color: 'Undefined',
    winner: 'Undetermined'
}

Horse.propTypes = {
    name: PropTypes.string,
    color: PropTypes.string,
    winner: PropTypes.string
}

export default Horse
