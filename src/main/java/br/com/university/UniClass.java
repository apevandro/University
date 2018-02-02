package br.com.university;

import java.io.Serializable;

public class UniClass {  // university class
	
	public static class Id implements Serializable {

		private static final long serialVersionUID = 1L;
		private Integer studentId;
		private Integer discId;
		private Integer profId;
		private String semester;

		public Id() {}

		public Id(int studentId, int discId, int profId) {
			this.studentId = studentId;
			this.discId = discId;
			this.profId = profId;
		}

		public boolean equals(Object obj) {
	        if (obj != null && obj instanceof Id) {
	        	Id other = (Id) obj;
	            return other.studentId.equals(this.studentId) &&
	            	       other.discId.equals(discId) &&
	        	               other.profId.equals(this.profId) &&
	        	                   other.semester.equals(semester);
	        } else {
	        	return false;
	        }
	    }

	    public int hashCode() {
	    	final int prime = 31;
			int result = 1;
			result = prime * result + (studentId + discId + profId + semester).hashCode();
			return result;
	    }
	}

	private Id id = new Id();
	private double grade;
	private Student student;
	private Discipline discipline;
	private Professor professor;
	
	public UniClass() {}
	
	public UniClass(String semester, double grade, Student student, Discipline discipline, Professor professor) {
		this.id.semester = semester;
		this.grade = grade;
		this.student = student;
		this.discipline = discipline;
		this.professor = professor;
		this.id.studentId = this.student.getStudentId();
		this.id.discId = this.discipline.getDiscId();
		this.id.profId = this.professor.getProfId();
		student.getUniClasses().add(this);     // It guarantees referential integrity.
		discipline.getUniClasses().add(this);  // It guarantees referential integrity.
		professor.getUniClasses().add(this);   // It guarantees referential integrity.
	}

	public String getSemester() {
		return this.id.semester;
	}
	
	public Id getId() {
		return id;
	}
	
	public void setId(Id id) {
		this.id = id;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

}