package com.nightspawn.tasktree.dtos.adapters;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import com.nightspawn.tasktree.dtos.Title;

public class TitleAdapter extends XmlAdapter<String, Title> {

	@Override
	public String marshal(Title v) throws Exception {
		return v.getTitle();
	}

	@Override
	public Title unmarshal(String v) throws Exception {
		return new Title(v);
	}

}
