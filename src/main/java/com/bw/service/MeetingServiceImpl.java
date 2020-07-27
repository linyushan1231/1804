package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Meeting;
import com.bw.mapper.MeetingMapper;
@Service
public class MeetingServiceImpl implements MeetingService {

	@Autowired
	private MeetingMapper meetingMapper;
	@Override
	public List<Meeting> selAll() {
		// TODO Auto-generated method stub
		return meetingMapper.selAll();
	}
	@Override
	public void add(Meeting m) {
		// TODO Auto-generated method stub
		meetingMapper.add(m);
	}
	@Override
	public Meeting selOne(Integer mid) {
		// TODO Auto-generated method stub
		return meetingMapper.selOne(mid);
	}
	@Override
	public void update(Meeting m) {
		// TODO Auto-generated method stub
		meetingMapper.update(m);
	}

}
