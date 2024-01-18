package com.lmoreiradeveloper.taskmanagementsystem.repository;

import com.lmoreiradeveloper.taskmanagementsystem.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
