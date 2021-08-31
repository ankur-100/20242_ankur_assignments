package com.sonata.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sonata.Model.Task;
import com.sonata.Reposit.TaskRepository;

@RestController
public class TaskController {
	
	
	Optional<Task> t1;
	
	@Autowired
	private TaskRepository task;
	
	@GetMapping("/task")
	public List <Task> getAllTask() {
		return task.findAll();
	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity getTask(@PathVariable (value="id") Long taskid)
	{
		t1 = task.findById(taskid);
		return ResponseEntity.ok(t1);
	}
	
	@PostMapping("/task")
	public Task saveTask(@RequestBody Task tsk)
	{
		return task.save(tsk);
	}
	
	@PutMapping("/task/{id}")
	public ResponseEntity updateTask(@PathVariable (value="id") Long taskid, @Valid @RequestBody Task tsk)
	{
		t1 = task.findById(taskid);
		Task t2 = t1.get();
		
		t2.setTaskid(tsk.getTaskid());
		t2.setOwnerid(tsk.getOwnerid());
		t2.setName(tsk.getName());
		t2.setDescription(tsk.getDescription());
		t2.setPriority(tsk.getPriority());
		t2.setStatus(tsk.getStatus());
		t2.setStatuschangedon(tsk.getStatuschangedon());
		t2.setNotes(tsk.getNotes());
		t2.setIsbookmarked(tsk.getIsbookmarked());
		
		Task updateTask = task.save(t2);
		return ResponseEntity.ok(updateTask);
		
	}
	
	@DeleteMapping("/task/{id}")
	public ResponseEntity deleteTask(@PathVariable (value="id") Long taskid)
	{
		task.deleteById(taskid);
		return ResponseEntity.noContent().build();
	}

}
