package com.compare.sample.model;

public class Student implements Comparable<Student> {
	private int stdId;
	private String stdName;
	private int stdTotal;

	public Student(int stdId, String stdName, int stdTotal) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdTotal = stdTotal;
	}

	@Override
	public String toString() {
		return "Student [stdId=" + stdId + ", stdName=" + stdName + ", stdTotal=" + stdTotal + "]";
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	public int getStdTotal() {
		return stdTotal;
	}

	public void setStdTotal(int stdTotal) {
		this.stdTotal = stdTotal;
	}

	@Override
	public int compareTo(Student stud) {
		// this > std2 - +
		// this < std2 - -
		// this = std2 - 0
		if (this.getStdTotal() > stud.getStdTotal())
			return 1;
		else if(this.getStdTotal() < stud.getStdTotal())
			return -1;
		else
			return 0;
	}
}
