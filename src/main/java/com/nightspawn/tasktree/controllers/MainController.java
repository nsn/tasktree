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
	@Inject
	Logger log;
	@Inject
	TaskFinderService finder;
	
	public List<Task> getAllTasks() {
		return finder.getAllTasks();
	}
	

}
