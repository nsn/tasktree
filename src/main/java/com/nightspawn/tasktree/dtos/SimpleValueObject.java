package com.nightspawn.tasktree.dtos;

import java.io.Serializable;

@SuppressWarnings("serial")
public abstract class SimpleValueObject<T extends Comparable<T>> implements
		Serializable, Comparable<SimpleValueObject<T>> {
	private T value;

	public SimpleValueObject(T value) {
		this.value = value;
	}

	protected T getValue() {
		return value;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;
		SimpleValueObject<?> other = SimpleValueObject.class.cast(o);
		return value.equals(other.value);
	}

	@Override
	public int hashCode() {
		return value.hashCode();
	}

	@Override
	public String toString() {
		if (value == null) {
			return "null";
		} else {
			return value.toString();
		}
	}

	@Override
	public int compareTo(SimpleValueObject<T> other) {
		if (other == null)
			return 1;
		return value.compareTo(other.value);
	}
}
