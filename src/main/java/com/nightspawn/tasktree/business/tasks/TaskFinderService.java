package com.nightspawn.tasktree.business.tasks;

import java.util.Collections;
import java.util.List;

import javax.inject.Inject;

import com.nightspawn.tasktree.business.tasks.daos.FindTasksDAO;
import com.nightspawn.tasktree.dtos.Task;

public class TaskFinderService {
	@Inject
	FindTasksDAO dao;

	public List<Task> getAllTasks() {
		List<Task> tasks = dao.getAllTasks();
		Collections.sort(tasks);
		return tasks;
	}
}
