document.addEventListener("DOMContentLoaded", () => {
    document.body.classList.add("fade-in");
    const navLinks = document.querySelectorAll("nav a");
    navLinks.forEach(link => {
        link.addEventListener("click", (e) => {
            e.preventDefault();
            const href = link.getAttribute("href");
            if (href) {
                document.body.classList.remove("fade-in");
                document.body.classList.add("fade-out");
                setTimeout(() => {
                    window.location.href = href;
                }, 250);
            }
        });
    });
});