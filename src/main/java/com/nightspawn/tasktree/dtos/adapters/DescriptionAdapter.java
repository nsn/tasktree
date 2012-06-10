package com.nightspawn.tasktree.dtos.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.nightspawn.tasktree.dtos.Description;

public class DescriptionAdapter extends XmlAdapter<String, Description> {

	@Override
	public String marshal(Description v) throws Exception {
		return v.getDescription();
	}

	@Override
	public Description unmarshal(String v) throws Exception {
		return new Description(v);
	}

}
