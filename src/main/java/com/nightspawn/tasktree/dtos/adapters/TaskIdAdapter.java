package com.nightspawn.tasktree.dtos.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.nightspawn.tasktree.dtos.TaskId;

public class TaskIdAdapter extends XmlAdapter<String, TaskId> {

	@Override
	public String marshal(TaskId v) throws Exception {
		return v.getId();
	}

	@Override
	public TaskId unmarshal(String v) throws Exception {
		return new TaskId(v);
	}

}
