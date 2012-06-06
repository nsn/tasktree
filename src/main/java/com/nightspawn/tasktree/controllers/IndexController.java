package com.nightspawn.tasktree.controllers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.nightspawn.tasktree.services.TaskListService;

@RequestScoped
@Named
public class IndexController {
	@Inject
	TaskListService listService;

	@PostConstruct
	public void init() {
		System.out.println("test");
	}

	public String hello() {
		return "hello";
		// return listService.hello("test");
	}

}
