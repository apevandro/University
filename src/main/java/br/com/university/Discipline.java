package br.com.university;

import java.util.HashSet;
import java.util.Set;

public class Discipline {

    private int discId;
    private String name;
    private int credits;
    private Set<Course> courses = new HashSet<Course>();
    private Set<UniClass> uniClasses = new HashSet<UniClass>();

    public Discipline() {}

    public Discipline(int discId, String name, int credits) {
    	this.discId = discId;
        this.name = name;
        this.credits = credits;
    }

    public int getDiscId() {
        return discId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
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

        Discipline other = (Discipline) obj;

        if (other.getName().equals(name) &&
                other.getCredits() == credits) {
            return true;
        }

        return false;
    }

    public int hashCode() {
    	final int prime = 31;
		int result = 1;
		result = prime * result + (name + credits).hashCode();
		return result;
    }

}