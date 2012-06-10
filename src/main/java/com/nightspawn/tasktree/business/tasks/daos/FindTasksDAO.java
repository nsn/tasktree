package com.nightspawn.tasktree.business.tasks.daos;

import java.util.List;

import com.nightspawn.tasktree.dtos.Task;

public interface FindTasksDAO {

	public List<Task> getAllTasks();

}
