package com.nightspawn.tasktree.controllers;

import java.util.List;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.nightspawn.tasktree.business.tasks.TaskFinderService;
import com.nightspawn.tasktree.dtos.Task;

@RequestScoped
@Named
public class MainController {
	public static final String CHILD_OF_CLASS_PREFIX = "child-of-";
	public static final String NODE_ID_PREFIX = "node-";
	@Inject
	Logger log;
	@Inject
	TaskFinderService finder;
	
	public List<Task> getAllTasks() {
		return finder.getAllTasks();
	}
	
	public String getChildOfClass(Task task) {
		if (task.hasParent()) {
			StringBuilder sb = new StringBuilder(CHILD_OF_CLASS_PREFIX);
			sb.append(NODE_ID_PREFIX);
			sb.append(task.getParent().getId().getId());
			return sb.toString();
		} else {
			return "";
		}
	}
	
	public String  getNodeId(Task task) {
		return NODE_ID_PREFIX.concat(task.getId().getId());
	}
	

}
