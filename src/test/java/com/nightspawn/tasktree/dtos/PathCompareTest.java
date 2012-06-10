package com.nightspawn.tasktree.dtos;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class PathCompareTest {
	static Path fooBar;
	static Path fooBar2;
	static Path fooBarBaz;
	static Path fooBarArg;
	static Path fooBla;
	static Path fooBlaArg;

	@BeforeClass
	public static void init() {
		fooBar = makePath("foo", "bar");
		fooBar2 = makePath("foo", "bar");
		fooBarBaz = makePath("foo", "bar", "baz");
		fooBarArg = makePath("foo", "bar", "arg");
		fooBla = makePath("foo", "bla");
		fooBlaArg = makePath("foo", "bla", "arg");
	}

	static Path makePath(String... elements) {
		Path rv = new Path();
		for (String e : elements) {
			rv.add(new TaskId(e));
		}
		return rv;
	}

	@Test
	public void testCompare() {
		assertTrue(fooBar.compareTo(fooBar2) == 0);
		assertTrue(fooBar.compareTo(fooBla) < 0);
		assertTrue(fooBar.compareTo(fooBarBaz) < 0);
		assertTrue(fooBarArg.compareTo(fooBar) > 0);
		assertTrue(fooBlaArg.compareTo(fooBarArg) > 0);
	}

}
