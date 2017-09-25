package com.geekykids.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.geekykids.model.Course;
import com.geekykids.repository.CourseRepository;

@Controller
@CrossOrigin(origins = "http://localhost:8080")
@RequestMapping(path="/course")
public class CourseController extends AbstractController {
	
	@Autowired
	@Qualifier("courseRepository")
    private CourseRepository courseRepository;
	
    @GetMapping(path="/all")
    public @ResponseBody Iterable<Course> getAll() {
    	return courseRepository.findAll();
    }

    
    @GetMapping(path="/createTestData")
    public  @ResponseBody String createTestData() {
    	
    	courseRepository.save(new Course("Up & Comin", "", 185.00, (short)6, (short)12, ""));
    	courseRepository.save(new Course("Up & Comin", "", 185.00, (short)6, (short)12, ""));
    	courseRepository.save(new Course("Up & Comin", "", 185.00, (short)6, (short)12, ""));
    	courseRepository.save(new Course("Up & Comin", "", 185.00, (short)6, (short)12, ""));
    	
    	return "OK";
    }

}