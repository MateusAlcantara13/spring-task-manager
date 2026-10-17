package org.example.taskmanager.service;

import org.example.taskmanager.models.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private static List<Task> TASKS = new ArrayList<>();

    public List<Task> getAllTask() {
        return TASKS;
    }

    public void addTask(Task task) {
        TASKS.add(task);
    }
}
