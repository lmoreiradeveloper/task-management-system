package com.lmoreiradeveloper.taskmanagementsystem.model;

import com.lmoreiradeveloper.taskmanagementsystem.enums.TaskStatus;
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
public class Task implements Serializable {
    @Serial
    private static final long serialVersionUID = -1834397679328154883L;
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
