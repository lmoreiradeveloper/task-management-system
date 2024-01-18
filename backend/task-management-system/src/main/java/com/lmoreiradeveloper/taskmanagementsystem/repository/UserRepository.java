package com.lmoreiradeveloper.taskmanagementsystem.repository;

import com.lmoreiradeveloper.taskmanagementsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
