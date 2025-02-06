document.addEventListener("DOMContentLoaded", function () {
    fetch("./Header.html")
        .then(response => response.text())
        .then(data => document.getElementById("header").innerHTML = data);

    fetch("./Footer.html")
        .then(response => response.text())
        .then(data => document.getElementById("footer").innerHTML = data);
});