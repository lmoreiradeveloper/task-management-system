package com.lmoreiradeveloper.taskmanagementsystem.mapper;

import com.lmoreiradeveloper.taskmanagementsystem.dto.UserDTO;
import com.lmoreiradeveloper.taskmanagementsystem.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(source = "id", target = "id")
    @Mapping(source = "name", target = "name")
    @Mapping(source = "email", target = "email")
    @Mapping(source = "password", target = "password")
    @Mapping(source = "registrationDate", target = "registrationDate")
    @Mapping(source = "assignedTasks", target = "assignedTasks")
    UserDTO userToUserDTO(User user);

}
