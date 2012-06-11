package com.nightspawn.tasktree.dtos;

import javax.xml.bind.annotation.XmlTransient;

public class Task implements Comparable<Task> {
	private TaskId id;
	private Title title;
	private Description description;
	private Task parent;

	public Task(Title title, Description desc) {
		this(title, desc, TaskId.randomTaskId());
	}

	public Task(Title title, Description desc, TaskId id) {
		setTitle(title);
		setDescription(desc);
		setId(id);
	}

	@Override
	public int compareTo(Task o) {
		return getPath().compareTo(o.getPath());
	}

	public Path getPath() {
		Path rv = new Path();
		if (hasParent()) {
			rv.addAll(getParent().getPath());
		}
		rv.add(getId());
		return rv;
	}

	public boolean hasParent() {
		return parent != null;
	}

	public TaskId getId() {
		return id;
	}

	public void setId(TaskId id) {
		this.id = id;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Description getDescription() {
		return description;
	}

	public void setDescription(Description description) {
		this.description = description;
	}

	@XmlTransient
	public Task getParent() {
		return parent;
	}

	public void setParent(Task parent) {
		this.parent = parent;
	}

}
