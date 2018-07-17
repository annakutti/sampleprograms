/**
 * 
 */
package sanya.com.springboot.app2.model;

import java.util.List;

/**
 * @author Sanya_s
 *
 */
public class Course {

	private int id;
	
	private String name;
	
	private String description;
	
	private List<String> steps;

	/**
	 * @param id
	 * @param name
	 * @param description
	 * @param steps
	 */
	public Course(int id, String name, String description, List<String> steps) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.steps = steps;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the steps
	 */
	public List<String> getSteps() {
		return steps;
	}

	/**
	 * @param steps the steps to set
	 */
	public void setSteps(List<String> steps) {
		this.steps = steps;
	}
	
	
}
