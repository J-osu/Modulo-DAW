// script.js
const Mano = document.querySelector('.Mano');

Mano.addEventListener('mouseenter', () => {
  Mano.classList.add('open');
});

Mano.addEventListener('mouseleave', () => {
  Mano.classList.remove('open');
});

const canvas = document.getElementById("particles-canvas");
const ctx = canvas.getContext("2d");

// Ajustar el tamaño del lienzo
canvas.width = window.innerWidth;
canvas.height = window.innerHeight;

// Crear partículas
const particlesArray = [];
const numParticles = 100;

class Particle {
  constructor() {
    this.x = Math.random() * canvas.width;
    this.y = Math.random() * canvas.height;
    this.size = Math.random() * 3 + 1; // Tamaño aleatorio
    this.speedX = Math.random() * 2 - 1; // Velocidad en X
    this.speedY = Math.random() * 2 - 1; // Velocidad en Y
  }

  update() {
    this.x += this.speedX;
    this.y += this.speedY;

    // Reposicionar si salen del lienzo
    if (this.x < 0 || this.x > canvas.width) this.speedX *= -1;
    if (this.y < 0 || this.y > canvas.height) this.speedY *= -1;
  }

  draw() {
    ctx.fillStyle = "orange";
    ctx.beginPath();
    ctx.arc(this.x, this.y, this.size, 0, Math.PI * 2);
    ctx.fill();
  }
}

// Crear partículas iniciales
for (let i = 0; i < numParticles; i++) {
  particlesArray.push(new Particle());
}

// Animar partículas
function animate() {
  ctx.clearRect(0, 0, canvas.width, canvas.height);

  for (let particle of particlesArray) {
    particle.update();
    particle.draw();
  }

  requestAnimationFrame(animate);
}

animate();