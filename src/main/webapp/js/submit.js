/**
 * 
 */

const btn = document.querySelector('.js-button')
const btnText = btn.textContent
const borderWidth = 4
const width = btn.clientWidth
const height = btn.clientHeight
const svg = Snap(width, height)
const color1 = '#1ECD97'
const color2 = '#FFFFFF'
const transparent = transparentFromColor(color2)

btn.addEventListener('click', () => console.log('click'), false)
btn.replaceWith(svg.node)

const border = svg
  .rect(borderWidth, borderWidth, width - borderWidth * 2, height - borderWidth * 2, (height - borderWidth * 2) / 2, (height - borderWidth * 2) / 2)
  .attr({
    fill: color2,
    stroke: color1,
    strokeWidth: borderWidth
  })

const borderInactive = border
  .clone()
  .attr({
    fill: transparent,
    stroke: '#ccc'
  })

const text = svg
  .text(width / 2, height / 2, btnText)
  .attr({
    'text-anchor': 'middle',
    'dominant-baseline': 'central',
    fill: color1
  })

const check = svg
  .path(`M${width / 2 - 10},${height / 2 + 2.5} l4,5 l16,-20`)
  .attr({
    stroke: color2,
    strokeWidth: borderWidth,
    fill: transparent,
     opacity: 0,
    'stroke-linecap': 'round',
    'stroke-linejoin': 'round'
  })

const button = svg.group(borderInactive, border, text, check)
const circumference = Math.PI * height
bindHover()
bindClick()

function bindHover() {
  svg.hover(
    () => {
      border.stop().animate({ fill: color1 }, 225, mina.easein)
      text.stop().animate({ fill: color2 }, 225, mina.easein)
    },
    () => {
      border.stop().animate({ fill: transparent }, 175, mina.easeout)
      text.stop().animate({ fill: color1 }, 175, mina.easeout)
    }
  )
}

function bindClick() {
  svg.click(
    () => {
      btn.click()
      svg.unclick()
      svg.unhover()
      textBounce()
    }
  )
}

function textBounce() {
  text.stop().animate({ transform: 's1.1,0.95' }, 60, mina.easein, () => {
    text.stop().animate({ transform: 's1,1' }, 40, mina.easeout, toCircle)
  })
}

function toCircle() {
  text.stop().animate({ opacity: 0 }, 225, mina.easein)
  borderInactive.animate({
    width: height - borderWidth * 2,
    x: (width / 2) - ((height - borderWidth * 2) / 2) },
    225, mina.easein
  )
  border.animate({
    fill: transparent,
    stroke: transparent,
    width: height - borderWidth * 2,
    x: (width / 2) - ((height - borderWidth * 2) / 2)
  }, 225, mina.easein, countDown )
}

function countDown() {
  border.attr({
    strokeDasharray: `${circumference}`,
    strokeDashoffset: circumference,
    stroke: color1
  })
  Snap.animate(circumference, 0, v => {
    border.attr({ strokeDashoffset: v })
  }, 1200, mina.easeinout, fillCircle )
}

function fillCircle() {
  border.attr({ fill: color2 })
  border.animate({ fill: color1 }, 225, mina.easein, animateCheck)
}

function animateCheck() {
  const length = Snap.path.getTotalLength(check)
  Snap.animate(0, 0, () => {}, 100, mina.linear, () => {
    check.attr({
      opacity: 1,
      strokeDasharray: `${length}`,
      strokeDashoffset: length
    })
    Snap.animate(length, 0, value => {
      check.attr({ strokeDashoffset: value })
    }, 500, mina.bounce, reset() )
  })
}

function reset() {
  Snap.animate(0, 0, () => {}, 3000, mina.linear, () => {
    check.animate({ opacity: 0 }, 255, mina.easein).attr({
      strokeDasharray: '',
      strokeDashoffset: ''
    })
    border.animate({
      fill: transparent,
      stroke: color1,
      width: width - borderWidth * 2,
      x: borderWidth
    }, 255, mina.easein)
    .attr({
      strokeDasharray: '',
      strokeDashoffset: ''
    })
    borderInactive.animate({
      width: width - borderWidth * 2,
      x: borderWidth
    }, 255, mina.easein)
    text.stop().animate({
      opacity: 1,
      fill: color1
    }, 225, mina.easein, () => {
      bindHover()
      bindClick()
    })
  })
}

function transparentFromColor(c) {
  const {r, g, b} = Snap.color(c)
  return `rgba(${r}, ${g}, ${b}, 0)`
}