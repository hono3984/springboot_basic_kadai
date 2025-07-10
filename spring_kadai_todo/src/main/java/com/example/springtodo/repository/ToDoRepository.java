package com.example.springtodo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springtodo.entity.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Integer>{
	List<ToDo> findByTitle(String Title);

}
