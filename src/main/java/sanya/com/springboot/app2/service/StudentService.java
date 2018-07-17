/**
 * 
 */
package sanya.com.springboot.app2.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import sanya.com.springboot.app2.model.Course;
import sanya.com.springboot.app2.model.Student;

/**
 * @author Sanya_s
 *
 */
@Component
public class StudentService {
	
	private static List<Course> courses1;
	
	private static List<Course> courses2;
	
	private static List<Student> students;
	
	static{
		List<String> steps1 = new ArrayList<>();
		steps1.add("registration");
		steps1.add("training");
		
		List<String> steps2 = new ArrayList<>();
		steps2.add("registration");
		steps2.add("training");
		steps2.add("feildwork");
		
		courses1 = new ArrayList<>();
		courses1.add(new Course(1,"Bio","Biology",steps1));
		courses1.add(new Course(2,"IT","Information technology",steps1));
		courses1.add(new Course(3,"Mech","Mechanical",steps2));
		courses1.add(new Course(4,"Civ","Civil",steps2));
		
		courses2 = new ArrayList<>();
		courses2.add(new Course(1,"Food","Foo Processing",steps1));
		courses2.add(new Course(2,"Chemi","Chemical engineering",steps1));
		courses2.add(new Course(3,"Mech","Mechanical",steps2));
		courses2.add(new Course(4,"Civ","Civil",steps2));
		
		students = new ArrayList<>();
		students.add(new Student(1,"Christy","Student 1",courses1));
		students.add(new Student(2,"Jessy","Student 2",courses2));
		students.add(new Student(3,"Ruth","Student 3",courses2));
		
	}

	public List<Student> retrieveAllStudents(){
		return students;		
	}
	
	public Student retrieveStudent(int studentId){
		return (Student) students.stream().filter(student -> student.getId() == studentId).findAny().orElse(null);
	}
	
	public List<Course> retrieveAllCoursesForStudent(int studentId){
		return students.stream().filter(s -> s.getId() == studentId).findAny().get().getCourses();
		
		/*Student student = students.stream().filter(s -> s.getId() == studentId).findAny().orElse(null);
		if(student != null){
			return student.getCourses();
		}
		return null;*/
	}
	
	public Course retrieveCourseForStudent(int studentId, int courseId){
		return (Course) students.stream().filter(s -> s.getId() == studentId).findAny().get().getCourses().stream().filter(course -> course.getId() == courseId).findAny().orElse(null);
	}
	
	public Course addCourseForStudent(int studentId, Course newCourse){
		List<Course> myCourses = students.stream().filter(s -> s.getId() == studentId).findAny().get().getCourses();
		myCourses.add(newCourse);
		return (Course) myCourses.stream().filter(course -> course.getId() == newCourse.getId()).findAny().orElse(null);
	}
}
