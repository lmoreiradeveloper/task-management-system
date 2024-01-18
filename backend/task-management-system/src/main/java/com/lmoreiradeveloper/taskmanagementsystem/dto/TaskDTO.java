package com.lmoreiradeveloper.taskmanagementsystem.dto;

import com.lmoreiradeveloper.taskmanagementsystem.enums.TaskStatus;
import com.lmoreiradeveloper.taskmanagementsystem.model.User;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.time.Instant;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 7677426986326178109L;
    private Long id;
    private String title;
    private String description;
    private Instant creationDate;
    private Instant dueDate;
    private String priority;
    private TaskStatus status;
    private User assignee;
    private List<String> comments;
    private List<String> attachments;
}
