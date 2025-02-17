document.getElementById('add').addEventListener('click', addItem);
document.getElementById('item').addEventListener('keypress', function (e) {
    if (e.key === 'Enter') {
        addItem();
    }
});

document.getElementById('borrar-todo').addEventListener('click', function () {
    document.getElementById('lista-compra').innerHTML = '';
});

function addItem() {
    const itemTex = document.getElementById('item').value.trim();
    if (itemTex !== '') {
        const li = document.createElement('li');

        const checkbox = document.createElement('input');
        checkbox.type = 'checkbox';
        checkbox.addEventListener('change', function () {
            if (checkbox.checked) {
                span.style.textDecoration = 'line-through';
                span.style.color = '#777';
            } else {
                span.style.textDecoration = 'none';
                span.style.color = '#333';
            }
        });

        const span = document.createElement('span');
        span.textContent = itemTex;

        const editButton = document.createElement('button');
        editButton.innerHTML = '<i class="fas fa-pen"></i>';
        editButton.classList.add('edit-button');
        editButton.addEventListener('click', function () {
            editItem(li, span);
        });

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

        document.getElementById('lista-compra').appendChild(li);
        document.getElementById('item').value = '';
        document.getElementById('item').focus();
    }
}

function editItem(li, span) {
    const input = document.createElement('input');
    input.type = 'text';
    input.value = span.textContent;
    input.classList.add('edit-input');

    input.addEventListener('keypress', function (e) {
        if (e.key === 'Enter') {
            if (input.value.trim() !== '') {
                span.textContent = input.value;
                li.replaceChild(span, input);
            } else {
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