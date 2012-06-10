package com.nightspawn.tasktree.dtos;

import java.util.UUID;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.nightspawn.tasktree.dtos.adapters.TaskIdAdapter;

@XmlJavaTypeAdapter(TaskIdAdapter.class)
public class TaskId extends SimpleValueObject<String> {

	public TaskId(String value) {
		super(value);
		// implement checks here

	}

	public static TaskId randomTaskId() {
		return new TaskId(UUID.randomUUID().toString());
	}

	public String getId() {
		return getValue();
	}

}
