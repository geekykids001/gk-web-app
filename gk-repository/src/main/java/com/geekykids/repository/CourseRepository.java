package com.geekykids.repository;

import org.springframework.data.repository.CrudRepository;
import com.geekykids.model.Course;

public interface CourseRepository extends CrudRepository<Course, Long>  {

}
