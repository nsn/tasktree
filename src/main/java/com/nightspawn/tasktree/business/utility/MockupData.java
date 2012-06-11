package com.nightspawn.tasktree.business.utility;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

import com.nightspawn.tasktree.dtos.Description;
import com.nightspawn.tasktree.dtos.Task;
import com.nightspawn.tasktree.dtos.TaskId;
import com.nightspawn.tasktree.dtos.Title;

@ApplicationScoped
public class MockupData {
	private static final int numTestTasks = 10;
	private ArrayList<Task> allTasks;

	public MockupData() {
		super();

		initTasks();
	}

	public void initTasks() {
		allTasks = new ArrayList<Task>();

		Task AionTask = makeTask("AION", "The AION project", allTasks.size());
		allTasks.add(AionTask);

		Task InfraTask = makeTask("Infrastructure",
				"Infrastruktur Metaprojekt", allTasks.size());
		allTasks.add(InfraTask);

		Task InGameAggregateTask = makeTask("InGameAggregate",
				"Sicherstellen dass InGameAggregate Events verschickt werden",
				allTasks.size());
		InGameAggregateTask.setParent(AionTask);
		allTasks.add(InGameAggregateTask);

		String[] verbs = { "Foo", "Bar", "Baz" };
		for (int i = 0; i < verbs.length; i++) {
			StringBuilder sb = new StringBuilder();

		}

	}

	private Task makeTask(String title, String desc, int size) {
		return makeTask(title, desc, Integer.toString(size));
	}

	private Task makeTask(String title, String desc, String id) {
		return new Task(new Title(title), new Description(desc), new TaskId(id));
	}

	public ArrayList<Task> getAllTasks() {
		return allTasks;
	}

	public void setAllTasks(ArrayList<Task> allTasks) {
		this.allTasks = allTasks;
	}

}
