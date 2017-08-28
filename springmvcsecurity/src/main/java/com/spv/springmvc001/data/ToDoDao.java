package com.spv.springmvc001.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import com.spv.springmvc001.model.ToDo;

public class ToDoDao {
	static List<ToDo> allToDos = new ArrayList<ToDo>();
	static {
		allToDos.add(new ToDo("123445", "surya", "description123", new Date(), false));
		allToDos.add(new ToDo("993445", "surya", "descriptionXXX", new Date(), false));
		allToDos.add(new ToDo("128845", "surya", "YYYYdescription123", new Date(), false));
		allToDos.add(new ToDo("234405", "surya", "ZZZdescription123", new Date(), false));
		allToDos.add(new ToDo("899895", "surya", "ASDSDSdescription123", new Date(), false));
	}
	public List<ToDo> getAllToDoForUser(String user){
		//Test Data
		return allToDos;
	}
	
	public void addToDo(ToDo todo){
		allToDos.add(todo);
	}
	
	public void deleteToDo(String id){
		for(Iterator<ToDo> iter = allToDos.iterator(); iter.hasNext();){
			ToDo td = iter.next();
			if(id.equalsIgnoreCase(td.id)){
				iter.remove();
				break;
			}
		}
	}
	
	public ToDo retrieveToDO(String id){
		for(ToDo td: allToDos){
			if(id.equalsIgnoreCase(td.getId())){
				return td;
			}
		}
		return null;
	}
	
	public void updateToDo(ToDo td){
		for(Iterator<ToDo> tdi = allToDos.iterator();tdi.hasNext();){
			ToDo tdIter = tdi.next();
			System.out.println("updateToDo>>"+tdIter);
			if(td.getId().equalsIgnoreCase(tdIter.getId())){
				System.out.println("removing the updating record>>"+tdIter);
				tdi.remove();
				break;
			}
		}
		allToDos.add(td);
	}
	
//	public void updateToDo(ToDo td){
//		allToDos.remove(td);
//		allToDos.add(td);
//	}
}
