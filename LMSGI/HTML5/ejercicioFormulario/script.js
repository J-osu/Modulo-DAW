let singUp = document.getElementById("singUp");
let singIn = document.getElementById("singIn");
let nameInput = document.getElementById("nameInput");
let lastnameInput = document.getElementById("lastnameInput");
let dateInput = document.getElementById("dateInput");
let generoInput = document.getElementById("generoInput");
let correoInput = document.getElementById("correoInput");
let telInput = document.getElementById("telInput");
let direcInput = document.getElementById("direcInput");
let confirmarInput = document.getElementById("confirmarInput");
let selectInput = document.getElementById("selectInput");
let termInput = document.getElementById("termInput");
let title = document.getElementById("title");

singIn.onclick = function() {
    nameInput.style.maxHeight = "0";
    lastnameInput.style.maxHeight = "0";
    dateInput.style.maxHeight = "0";
    generoInput.style.maxHeight = "0";
    correoInput.style.maxHeight = "0";
    telInput.style.maxHeight = "0";
    direcInput.style.maxHeight = "0";
    confirmarInput.style.maxHeight = "0";
    selectInput.style.maxHeight = "0";
    termInput.style.maxHeight = "0";
    title.innerHTML = "Login";
    singUp.classList.add("disable");
    singIn.classList.remove("disable");
}

singUp.onclick = function() {
    nameInput.style.maxHeight = "60px";
    lastnameInput.style.maxHeight = "60px";
    dateInput.style.maxHeight = "60px";
    generoInput.style.maxHeight = "60px";
    correoInput.style.maxHeight = "60px";
    telInput.style.maxHeight = "60px";
    direcInput.style.maxHeight = "60px";
    confirmarInput.style.maxHeight = "60px";
    selectInput.style.maxHeight = "60px";
    termInput.style.maxHeight = "60px";
    title.innerHTML = "Registro";
    singUp.classList.remove("disable");
    singIn.classList.add("disable");
}