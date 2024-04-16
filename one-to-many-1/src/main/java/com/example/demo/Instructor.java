package com.example.demo;

import jakarta.persistence.*;

@Entity
public class Instructor {
			@Id
			@GeneratedValue(strategy=GenerationType.IDENTITY)
			@Column(name="id")
			private Long id;
			
			@Column(name="first_name")
			private String firstname;
			
			@Column(name="last_name")
			private String lastname;
			
			@Column(name="email")
			private String email;
			
			@OneToOne(cascade=CascadeType.ALL)
			@JoinColumn(name="instructor_details_id")
			private InstructorDetail instructorDetail;
			
			public Instructor() {
				
			}
			public Instructor(String firstname,String lastname,String email) {
				this.firstname=firstname;
				this.lastname=lastname;
				this.email=email;
			}
			public Long getId() {
				return id;
			}
			public void setId(Long id) {
				this.id = id;
			}
			public String getFirstname() {
				return firstname;
			}
			public void setFirstname(String firstname) {
				this.firstname = firstname;
			}
			public String getLastname() {
				return lastname;
			}
			public void setLastname(String lastname) {
				this.lastname = lastname;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public InstructorDetail getInstructorDetail() {
				return instructorDetail;
			}
			public void setInstructorDetail(InstructorDetail instructorDetail) {
				this.instructorDetail = instructorDetail;
			}
			
}

