package com.spv.springmvc001.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spv.springmvc001.model.ToDo;
import com.spv.springmvc001.service.ToDoService;

@Controller
public class ToDoController {
	Log log = LogFactory.getLog(getClass());
	@Autowired
	ToDoService toDoService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/gettodo",method=RequestMethod.GET)
	public String getToDos(ModelMap model){
		List<ToDo> allToDos = toDoService.getAllToDoForUser("");
		model.put("allToDos", allToDos);
		return "todos";
	}
	
	@RequestMapping(value="/addToDo",method=RequestMethod.GET)
	public String addNewToDo(ModelMap model){
		model.addAttribute("todo", new ToDo());
		return "addtodo";
	}
	
	@RequestMapping(value="/submitAddToDo",method=RequestMethod.POST)
	public String submitAddNewToDo(ModelMap model,@Valid ToDo todo, BindingResult result){
//		ToDo newToDo = (ToDo)model.get("todo");
//		ToDo newToDo = new ToDo("New1213232","userName12" , desc, new Date(), false);
		String now = String.valueOf(DateTime.now().getMillis());
		System.out.println("submitAddNewToDo>>>binding errors>>"+result.hasErrors());
		System.out.println("error>>>"+result.getAllErrors());
		if(!result.hasErrors()){
			ToDo newToDo = new ToDo(now, "surya", todo.getDescription(), todo.getTargetDate(), false);
			System.out.println("ToDoController>>adding new ToDo>>"+newToDo);
			toDoService.addToDo(newToDo);
			return "redirect:/gettodo";
		}
		model.put("todo", todo);
		return "addtodo";
		
	}
	
	@RequestMapping(value="/deleteToDo",method=RequestMethod.GET)
	public String deleteToDo(@RequestParam String id){
		toDoService.deleteToDo(id);
		return "redirect:/gettodo";
	}
	
	@RequestMapping(value="/retrieveToDo",method=RequestMethod.GET)
	public String retrieveToDo(@RequestParam String id,ModelMap model){
		ToDo retToDo = toDoService.retrieveToDo(id);
		model.addAttribute("todo",retToDo);
		System.out.println("retrieveToDo>>>"+retToDo);
		return "updatetodo";
	}
	
	@RequestMapping(value="/updateToDo",method=RequestMethod.POST)
	public String updateToDo(ModelMap model,@Valid ToDo todo,BindingResult result){
		System.out.println("Updating ToDo>>"+todo);
		if(!result.hasErrors()){
			todo.setUserName("surya");
			System.out.println("ToDoController>>updating ToDo>>"+todo);
			
			toDoService.updateToDO(todo);
			return "redirect:/gettodo";
		}
		model.put("todo", todo);
		return "addtodo";
	}
	
	@RequestMapping(value="/handleSpecException",method=RequestMethod.GET)
	public String handleSpecificException(HttpServletRequest request, Exception e){
		log.debug(">>>>handleSpecificException>>>>>");
		log.error(request,e);
		return "specificerror";
	}
	@RequestMapping(value="/handleGeneralException",method=RequestMethod.GET)
	public String handleGeneralException(HttpServletRequest request, Exception e){
		log.debug(">>>>>>handleGeneralException>>>>>");
		log.error(request,e);
		return "error";
	}

}