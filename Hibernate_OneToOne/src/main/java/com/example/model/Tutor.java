package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Component
@Entity
@Data
@Table(name="tutor")
public class Tutor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tutorid")
	private Integer tutorId;
	
	@Column(name = "tutorname")
	private String tutorName;
	
	@Column(name = "subject")
	private String subject;

	public Tutor(String tutorName, String subject) {
		super();
		this.tutorName = tutorName;
		this.subject = subject;
	}
	
	

}
