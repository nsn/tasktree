package com.nightspawn.tasktree.dtos;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import com.nightspawn.tasktree.dtos.adapters.DescriptionAdapter;

@XmlJavaTypeAdapter(DescriptionAdapter.class)
public class Description extends SimpleValueObject<String> {

	public Description(String value) {
		super(value);
		// implement checks here

	}

	public String getDescription() {
		return getValue();
	}

}
