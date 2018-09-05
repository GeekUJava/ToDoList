package com.geekujava.todolist.controler;

import com.geekujava.todolist.controler.domain.BaseUser;
import com.geekujava.todolist.controler.domain.Task;
import com.geekujava.todolist.controler.domain.TaskList;
import com.geekujava.todolist.controler.repository.BaseUserRepository;
import com.geekujava.todolist.controler.repository.TaskListRepository;
import com.geekujava.todolist.controler.repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.Map;

@Controller
public class AppController {
    @Autowired
    private TaskListRepository taskLists;

    @Autowired
    private BaseUserRepository users;

    @Autowired
    private TaskRepository tasks;


    @GetMapping
    public String mainPage(Map<String, Object> model) {
        return "main";
    }


    @GetMapping("/users")
    public String showUsers(Map<String, Object> model) {
        Iterable<BaseUser> allUsers = users.findAll();
        model.put("users", allUsers);
        return "users";
    }

    @GetMapping("/tasklists")
    public String showTaskLists(Map<String, Object> model) {
        Iterable<TaskList> allTaskLists = taskLists.findAll();
        model.put("tasklists", allTaskLists);
        return "tasklists";
    }

    @GetMapping("/tasks")
    public String showTasks(Map<String, Object> model) {
        Iterable<Task> allTasks = tasks.findAll();
        model.put("tasks", allTasks);
        return "tasks";
    }

    @PostMapping("addUser")
    public String addUser(@RequestParam String username, @RequestParam String email, @RequestParam String password,
                          Map<String, Object> model) {
        BaseUser newUser = new BaseUser(username, email, password);
        users.save(newUser);
        model.put("users", users.findAll());
        return "users";
    }

    @PostMapping("removeUser")
    public String removeUser(@RequestParam Integer id,
                             Map<String, Object> model) {
        users.deleteById(id);
        model.put("users", users.findAll());
        return "users";
    }

    @PostMapping("addTaskList")
    public String addTaskList(@RequestParam Integer user_id, @RequestParam String name, @RequestParam String description,
                              Map<String, Object> model) {
        TaskList newTaskList = new TaskList(user_id, name, description);
        taskLists.save(newTaskList);
        model.put("tasklists", taskLists.findAll());
        return "tasklists";
    }

    @PostMapping("removeTaskList")
    public String removeTaskList(@RequestParam Integer id,
                                 Map<String, Object> model) {
        taskLists.deleteById(id);
        model.put("tasklists", taskLists.findAll());
        return "tasklists";
    }

    @PostMapping("addTask")
    public String addTask(@RequestParam Integer tasklist_id, @RequestParam String name, @RequestParam String description,
                          @RequestParam Integer priority,
                          Map<String, Object> model) {
        Task newTask = new Task(tasklist_id, name, description, priority);
        tasks.save(newTask);
        model.put("tasks", tasks.findAll());
        return "tasks";
    }

    @PostMapping("removeTask")
    public String removeTask(@RequestParam Integer id,
                             Map<String, Object> model) {
        tasks.deleteById(id);
        model.put("tasks", tasks.findAll());
        return "tasks";
    }

}

/*
@AppController
public class GreetingController {
    @Autowired
    private MessageRepo messageRepo;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Map<String, Object> model
    ) {
        model.put("name", name);
        return "greeting";
    }


    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String text, @RequestParam String tag, Map<String, Object> model) {
        Message message = new Message(text, tag);
        messageRepo.save(message);
        Iterable<Message> messages = messageRepo.findAll();
        model.put("messages", messages);
        return "main";
    }

    @PostMapping("filter")
    public String filter(@RequestParam String filter, Map<String, Object> model) {
        Iterable<Message> messages;
        if (filter != null && !filter.isEmpty()) {
            messages = messageRepo.findByTag(filter);
        }
        else {
            messages = messageRepo.findAll();
        }
        model.put("messages", messages);
        return "main";
    }
}
 */