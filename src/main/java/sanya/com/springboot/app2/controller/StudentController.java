/**
 * 
 */
package sanya.com.springboot.app2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sanya.com.springboot.app2.model.Course;
import sanya.com.springboot.app2.model.Student;
import sanya.com.springboot.app2.service.StudentService;

/**
 * @author Sanya_s
 *
 */
@RestController
public class StudentController {

	/**
	 * The StudentService
	 */
	@Autowired
	private StudentService studentService;
	
	/**
	 * Retrieve all student detail
	 * 
	 * @return List<Student>
	 */
	@GetMapping(value="/students")
	public List<Student> retrieveStudents(){
		return studentService.retrieveAllStudents();
	}
	
	@GetMapping(value="/login")
	public String login(){
		return "Login";
	}
	
	@GetMapping(value="/error")
	public String error(){
		return "Error Page";
	}
	
	/**
	 * retrieve the detail for a student
	 * 
	 * @param studentId
	 * @return Student
	 */
	@GetMapping(value="/students/{studentId}")
	public Student retrieveStudent(@PathVariable int studentId){
		return studentService.retrieveStudent(studentId);
	}
	
	/**
	 * Retrieve the courses for a student
	 * 
	 * @param studentId
	 * @return List<Course>
	 */
	@GetMapping(value="/students/{studentId}/courses")
	public List<Course> retrieveCoursesForStudent(@PathVariable int studentId){
		return studentService.retrieveAllCoursesForStudent(studentId);
	}
	
	/**
	 * Retrieve the courses for a particular student
	 * 
	 * @param studentId
	 * @param courseId
	 * @return Course
	 */
	@GetMapping(value="/students/{studentId}/courses/{courseId}")
	public Course retrieveCourseForStudent(@PathVariable int studentId, @PathVariable int courseId){
		return studentService.retrieveCourseForStudent(studentId, courseId);
	}
	
	/**
	 * Add a course for a student
	 * 
	 * @param studentId
	 * @param newCourse
	 * @return Course
	 */
	@PostMapping(value="/students/{studentId}/courses")
	public Course addCourseForStudent(@PathVariable int studentId ,@RequestBody Course newCourse){
		return studentService.addCourseForStudent(studentId, newCourse);
	}
}

