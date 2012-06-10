package com.nightspawn.tasktree.controllers;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
public class IndexController {

	@PostConstruct
	public void init() {
		System.out.println("test");
	}

}
