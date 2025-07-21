package com.example.jpaentry.jpaentry.repository;

import com.example.jpaentry.jpaentry.controllers.UserControllers;
import com.example.jpaentry.jpaentry.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,Integer> {
}
