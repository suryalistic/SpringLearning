package com.spv.springmvc001.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spv.springmvc001.data.ToDoDao;
import com.spv.springmvc001.model.ToDo;

@Service
public class ToDoService {
	public List<ToDo> getAllToDoForUser(String userName){
		List<ToDo> allToDos = new ArrayList<ToDo>();
		ToDoDao tdDao = new ToDoDao();
		allToDos = tdDao.getAllToDoForUser(userName);
		return allToDos;
	}
	
	public void addToDo(ToDo todo){
		ToDoDao tdDao = new ToDoDao();
		tdDao.addToDo(todo);
	}
	
	public void deleteToDo(String id){
		ToDoDao tdDao = new ToDoDao();
		tdDao.deleteToDo(id);
	}
	
	public ToDo retrieveToDo(String id){
		ToDoDao tdDao = new ToDoDao();
		ToDo td = tdDao.retrieveToDO(id);
		return td;
	}
	
	public void updateToDO(ToDo todo){
		ToDoDao tdDao = new ToDoDao();
		tdDao.updateToDo(todo);
	}
}
