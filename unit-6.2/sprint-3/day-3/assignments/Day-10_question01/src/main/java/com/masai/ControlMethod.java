package com.masai;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class ControlMethod {
	
	@Value("#{'${cities}'.split(',')}")
	public List<String> list1;
	
	@Autowired
	@Qualifier("stud")
	public List<Student> list2 = new ArrayList<>();

}
