package com.nightspawn.tasktree.dtos;

import java.util.ArrayList;

public class Path extends ArrayList<TaskId> implements Comparable<Path> {

	@Override
	public int compareTo(Path o) {
		int i = 0;
		while (i < size() && i < o.size()) {
			int c = get(i).compareTo(o.get(i));
			if (c != 0)
				return c;
			i++;
		}
		if (o.size() == size()) {
			return 0;
		} else if (o.size() > size()) {
			return -1;
		} else {
			return 1;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("/");
		for (TaskId i : this) {
			sb.append(i.getId());
			sb.append("/");
		}
		return sb.toString();
	}

}
