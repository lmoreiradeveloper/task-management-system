package com.lmoreiradeveloper.taskmanagementsystem.model;

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
public class User implements Serializable {
    @Serial
    private static final long serialVersionUID = -5606584463182529165L;
    private long id;
    private String name;
    private String email;
    private String password;
    private Instant registrationDate;
    private List<Task> assignedTasks;

}
