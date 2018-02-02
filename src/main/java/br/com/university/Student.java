package br.com.university;

import java.util.HashSet;
import java.util.Set;

public class Student {
	
	private int studentId;
	private String name;
	private Address address;
	private Course course;
	private Set<UniClass> uniClasses = new HashSet<UniClass>();

	public Student() {}

	public Student(int studentId, String name, Address address) {
		this.studentId = studentId;
		this.name = name;
		this.address = address;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Set<UniClass> getUniClasses() {
		return uniClasses;
	}

	public void setUniClasses(Set<UniClass> uniClasses) {
		this.uniClasses = uniClasses;
	}
	
	public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if(!obj.getClass().equals(this.getClass())) {
        	return false;
        }

        Student other = (Student) obj;

        if (other.getStudentId() == studentId &&
                other.getName().equals(name) &&
                    other.getAddress().equals(address)) {
            return true;
        }

        return false;
    }

    public int hashCode() {
    	final int prime = 31;
		int result = 1;
		result = prime * result + (studentId + name + address).hashCode();
		return result;
    }

}