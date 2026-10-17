package org.example.taskmanager.controllers;

import jakarta.validation.Valid;
import org.example.taskmanager.models.Task;
import org.example.taskmanager.service.TaskService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/task")
public class TaskController {

    private TaskService taskService = new TaskService();

    @GetMapping("")
    public String index(Model model) {
        var tasks = taskService.getAllTask();

        //Passando o dado para view index
        model.addAttribute("tarefas", tasks);

        return "index";
    }

    @GetMapping("/new")
    public String criarTarefa(Model model) {

        model.addAttribute("tarefa", new Task());

        return "criarTarefa";
    }

    @PostMapping("")
    public String salvarTarefa(@Valid @ModelAttribute("tarefa") Task task, BindingResult result) {

        //Se for formulario tiver dados invalida, mostro o formulario
        if (result.hasErrors()) {
            return "criarTarefa";
        }

        task.setId(new Random().nextInt());
        taskService.addTask(task);

        return "redirect:/task";
    }


}
