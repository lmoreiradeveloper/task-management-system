package com.lmoreiradeveloper.taskmanagementsystem.dto;

import com.lmoreiradeveloper.taskmanagementsystem.model.Task;
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
public class UserDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 540293004338841829L;
    private Long id;
    private String name;
    private String email;
    private String password;
    private Instant registrationDate;
    private List<Task> assignedTasks;
}
