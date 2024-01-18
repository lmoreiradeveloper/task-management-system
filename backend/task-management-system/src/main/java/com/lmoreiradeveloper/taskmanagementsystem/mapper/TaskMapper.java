package com.lmoreiradeveloper.taskmanagementsystem.mapper;

import com.lmoreiradeveloper.taskmanagementsystem.dto.TaskDTO;
import com.lmoreiradeveloper.taskmanagementsystem.model.Task;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TaskMapper {

    TaskMapper INSTANCE = Mappers.getMapper(TaskMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "title", target = "title")
    @Mapping(source = "description", target = "description")
    @Mapping(source = "creationDate", target = "creationDate")
    @Mapping(source = "dueDate", target = "dueDate")
    @Mapping(source = "priority", target = "priority")
    @Mapping(source = "status", target = "status")
    @Mapping(source = "assignee", target = "assignee")
    @Mapping(source = "comments", target = "comments")
    @Mapping(source = "attachments", target = "attachments")
    TaskDTO taskToTaskDTO(Task task);

}
