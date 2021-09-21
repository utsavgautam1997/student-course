package com.example.student.course;

import com.example.student.course.Dao.StudentDao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StudentCourseApplication {

	public static void main(String[] args) {

		ApplicationContext context =  SpringApplication.run(StudentCourseApplication.class, args);
		StudentDao studentDao = context.getBean(
				StudentDao.class
		);
		System.out.println(studentDao);
	}

}
