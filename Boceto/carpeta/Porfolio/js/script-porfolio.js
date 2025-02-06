document.querySelectorAll('.cuadro').forEach(cuadro => {
    const thumbnailUrl = cuadro.getAttribute('thumbnail');
    const altText = cuadro.getAttribute('alt');
    if (thumbnailUrl) {
        cuadro.style.backgroundImage = `url(${thumbnailUrl})`;
    } else if (altText) {
        cuadro.textContent = altText;
    } else {
        console.warn('No se encontró ni miniatura ni texto alternativo.');
    }
});

document.querySelectorAll('.view-btn').forEach(button => {
    button.addEventListener('click', () => {
        const cuadro = button.previousElementSibling;
        const imageUrl = cuadro.getAttribute('imagen');
        if (imageUrl) {
            window.open(imageUrl, '_blank');
        } else {
            alert('No se encontró la URL de la imagen.');
        }
    });
});