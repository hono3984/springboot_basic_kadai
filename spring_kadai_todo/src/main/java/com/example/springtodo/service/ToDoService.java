package com.example.springtodo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springtodo.entity.ToDo;
import com.example.springtodo.repository.ToDoRepository;

@Service
public class ToDoService {
	private final ToDoRepository todoRepository;
	
	public ToDoService(ToDoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public List<ToDo> getAllToDo(){
		return todoRepository.findAll();
	}
	
	
	

}
