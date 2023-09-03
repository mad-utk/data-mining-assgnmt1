document.getElementById('task-form').addEventListener('submit', function(event) {
    event.preventDefault();

    var taskInput = document.getElementById('task-input');
    var taskList = document.getElementById('task-list');

    if (taskInput.value.trim() === '') {
        alert('Please enter a task');
        return;
    }

    var li = document.createElement('li');
    li.textContent = taskInput.value;
    li.addEventListener('click', function() {
        this.classList.toggle('completed');
    });

    var deleteButton = document.createElement('button');
    deleteButton.textContent = 'Delete';
    deleteButton.addEventListener('click', function() {
        taskList.removeChild(li);
    });

    li.appendChild(deleteButton);
    taskList.appendChild(li);

    taskInput.value = '';
});
