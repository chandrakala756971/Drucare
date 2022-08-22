package com.studentservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
		@Id
		private Long studentId;
		private String studentName;
		private String studentHobby;
		
		public Student() {
			super();
		}

		public Student(Long studentId, String studentName, String studentHobby) {
			super();
			this.studentId = studentId;
			this.studentName = studentName;
			this.studentHobby = studentHobby;
		}

		public Long getStudentId() {
			return studentId;
		}

		public void setStudentId(Long studentId) {
			this.studentId = studentId;
		}

		public String getStudentName() {
			return studentName;
		}

		public void setStudentName(String studentName) {
			this.studentName = studentName;
		}

		public String getStudentHobby() {
			return studentHobby;
		}

		public void setStudentHobby(String studentHobby) {
			this.studentHobby = studentHobby;
		}
}
