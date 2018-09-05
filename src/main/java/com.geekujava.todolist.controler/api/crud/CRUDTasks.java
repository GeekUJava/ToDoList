package geek.project.tasks.api.crud;

import geek.project.tasks.repository.BaseUserRepository;
import geek.project.tasks.repository.TaskListRepository;
import geek.project.tasks.repository.TaskRepository;

public class CRUDTasks {
    private TaskListRepository taskLists;
    private BaseUserRepository users;
    private TaskRepository tasks;

    public CRUDTasks(BaseUserRepository users, TaskListRepository taskLists, TaskRepository tasks) {
        this.users = users;
        this.taskLists = taskLists;
        this.tasks = tasks;
    }

    // crud methods. See AppController how to insert\delete


}
