package com.nightspawn.tasktree.business.utility;

import java.util.ArrayList;

import javax.enterprise.context.ApplicationScoped;

import com.nightspawn.tasktree.dtos.Description;
import com.nightspawn.tasktree.dtos.Task;
import com.nightspawn.tasktree.dtos.Title;

@ApplicationScoped
public class MockupData {
	private ArrayList<Task> allTasks;

	public MockupData() {
		super();

		initTasks();
	}

	public void initTasks() {
		allTasks = new ArrayList<Task>();

		Task AionTask = makeTask("AION", "The AION project");
		allTasks.add(AionTask);

		Task InfraTask = makeTask("Infrastructure", "Infrastruktur Metaprojekt");
		allTasks.add(InfraTask);

		Task InGameAggregateTask = makeTask("InGameAggregate",
				"Sicherstellen dass InGameAggregate Events verschickt werden");
		InGameAggregateTask.setParent(AionTask);
		allTasks.add(InGameAggregateTask);
	}

	private Task makeTask(String title, String desc) {
		return new Task(new Title(title), new Description(desc));
	}

	public ArrayList<Task> getAllTasks() {
		return allTasks;
	}

	public void setAllTasks(ArrayList<Task> allTasks) {
		this.allTasks = allTasks;
	}

}
