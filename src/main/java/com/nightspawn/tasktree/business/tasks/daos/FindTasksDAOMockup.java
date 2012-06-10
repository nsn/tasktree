package com.nightspawn.tasktree.business.tasks.daos;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;
import javax.inject.Inject;

import com.nightspawn.tasktree.business.utility.MockupData;
import com.nightspawn.tasktree.dtos.Task;

@Alternative
@Stateless
@LocalBean
public class FindTasksDAOMockup implements FindTasksDAO {
	@Inject
	MockupData data;

	@Override
	public List<Task> getAllTasks() {
		return data.getAllTasks();
	}

}
