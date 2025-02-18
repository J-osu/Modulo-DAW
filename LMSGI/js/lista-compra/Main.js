//Creamos 2 eventos que permanecerán a la espera
// hasta que se presione la tecla enter o se haga un click.
document.getElementById('add').addEventListener('click', addItem);
document.getElementById('item').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
        addItem();
    }
});

//cunado hagamos click en el boton de borrar lo que pasará es que
//eliminará todos los elementos de la lista.
document.getElementById('borrar-todo').addEventListener('click', function () {
    document.getElementById('lista-compra').innerHTML = '';
});

function addItem() {
    const itemTex = document.getElementById('item').value.trim();
    if (itemTex !== '') {
        // creamos un elemento li que se añadirá a la lista.
        const li = document.createElement('li');
        //crea una checkbox a lado de cada elemnto de la lista.
        const checkbox = document.createElement('input');
        checkbox.type = 'checkbox';
        // creamos un evento de escuvha que reaccionará cada que hagamos click en el checkbox.
        checkbox.addEventListener('change', function () {
            if (checkbox.checked) {
                span.style.textDecoration = 'line-through';
                span.style.color = '#777';
            } else {
                span.style.textDecoration = 'none';
                span.style.color = '#333';
            }
        });
        // creamos el span que contendá el texto de los items.
        const span = document.createElement('span');
        span.textContent = itemTex;
        // añade un icono de edicion que funcionará cunado hagamos click.
        const editButton = document.createElement('button');
        editButton.innerHTML = '<i class="fas fa-pen"></i>';
        editButton.classList.add('edit-button');
        editButton.addEventListener('click', function () {
            editItem(li, span);
        });
        // añade un icono de borrado individual que funcionará cunado hagamos click.
        const deleteButton = document.createElement('button');
        deleteButton.innerHTML = '<i class="fas fa-trash"></i>';
        deleteButton.className = 'delete-button';
        deleteButton.addEventListener('click', function () {
            li.remove();
        });
        li.appendChild(checkbox);
        li.appendChild(span);
        li.appendChild(editButton);
        li.appendChild(deleteButton);
        // busca el id lista-compra y le asigna el hijo li.
        document.getElementById('lista-compra').appendChild(li);
        document.getElementById('item').value = '';
        document.getElementById('item').focus();
    }
}

function editItem(li, span) {
    // cuando vayamos a editar un elemnto creara un input de tipo text.
    const input = document.createElement('input');
    input.type = 'text';
    input.value = span.textContent;
    input.classList.add('edit-input');
    // a su vez añadirá un evento de escucha a la espera de presionar la tecla enter.
    input.addEventListener('keypress', function (e) {
        if (e.key === 'Enter') {
            if (input.value.trim() !== '') {
                // compara y cambia el valor.
                span.textContent = input.value;
                li.replaceChild(span, input);
            } else {
                // en caso contrario vuelve a su valor anterior
                li.replaceChild(span, input);
            }
        }
    });
    input.addEventListener('blur', function () {
        if (input.value.trim() !== '') {
            span.textContent = input.value;
        }
        li.replaceChild(span, input);
    });
    li.replaceChild(input, span);
    input.focus();
}