package com.springCore.SpringCore;

public class Student {

	private int sudentId;
	private String studentName;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sudentId, String studentName, String studentAddress) {
		super();
		this.sudentId = sudentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	
	public int getSudentId() {
		return sudentId;
	}
	public void setSudentId(int sudentId) {
		this.sudentId = sudentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	private String studentAddress;
	@Override
	public String toString() {
		return "Student [sudentId=" + sudentId + ", studentName=" + studentName + ", studentAddress=" + studentAddress
				+ "]";
	}

	
	
}
