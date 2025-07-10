package com.example.springpractice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springpractice.entity.User;  // ✅ これが正しい！

public interface UserRepository extends JpaRepository<User, Integer> {
    List<User> findByUserName(String userName);
}