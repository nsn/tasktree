package com.nightspawn.tasktree.dtos;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.nightspawn.tasktree.dtos.adapters.TitleAdapter;

@XmlJavaTypeAdapter(TitleAdapter.class)
public class Title extends SimpleValueObject<String> {

	public Title(String value) {
		super(value);
	}

	public String getTitle() {
		return getValue();
	}

}
