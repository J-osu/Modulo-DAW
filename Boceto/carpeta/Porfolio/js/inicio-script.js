const ojos = document.querySelectorAll(".ojo1, .ojo2");

document.addEventListener("mousemove", (event) => {
  const { clientX: mouseX, clientY: mouseY } = event;

  ojos.forEach((ojo) => {
    const rect = ojo.getBoundingClientRect();
    const eyeX = rect.left + rect.width / 2;
    const eyeY = rect.top + rect.height / 2;

    const angle = Math.atan2(mouseY - eyeY, mouseX - eyeX);

    const maxDistance = 30;
    const pupilaX = Math.cos(angle) * maxDistance;
    const pupilaY = Math.sin(angle) * maxDistance;

    const pupila = ojo.querySelector(".pupila");
    pupila.style.transform = `translate(${pupilaX}px, ${pupilaY}px)`;
  });
});
