package com.bw.controller;

import java.lang.reflect.Parameter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Meeting;
import com.bw.service.MeetingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MeetingController {

	@Autowired
	private MeetingService meetingService;
	
	@RequestMapping("list")
	public String selAll(Model m,
				@RequestParam(defaultValue="1")Integer pageNum){
		
		PageHelper.startPage(pageNum, 2);
		
		List<Meeting> list = meetingService.selAll();
		
		PageInfo<Meeting> glist = new PageInfo<>(list);
		
		m.addAttribute("glist",glist);
		
		return "list";
	}
	@RequestMapping("add")
	public String add(Meeting m){
		
		try {
			meetingService.add(m);
			return "forward:list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "add.jsp";
		}
	}
	
	@RequestMapping("selOne")
	public String selOne(Model m,Integer mid){
		
		Meeting meeting = meetingService.selOne(mid);
		
		m.addAttribute("meeting", meeting);
		
		return "update";
	}
	
	@RequestMapping("update")
	public String update(Meeting m){
		
		try {
			meetingService.update(m);
			return "forward:list";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "update.jsp";
		}
	}
}
