package com.bw.mapper;

import java.util.List;

import com.bw.bean.Meeting;

public interface MeetingMapper {

	public List<Meeting> selAll();
	
	public void add(Meeting m);
	
	public Meeting selOne(Integer mid);
	
	public void update(Meeting m);
}
