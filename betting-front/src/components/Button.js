import PropTypes from 'prop-types'

function Button({text, click}) {
  return (
    <button className="regBtn" onClick={click}>{text}</button>
  )
}

Button.propTypes = {
    text: PropTypes.string
}

Button.defaultProps = {
    text: '-',
    click: null
}

export default Button
