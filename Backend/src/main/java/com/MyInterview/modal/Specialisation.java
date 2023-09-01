package com.MyInterview.modal;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@Entity
public class Specialisation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String techName;
	private List<Attempt> attempts;
	public Specialisation(String techName, List<Attempt> attempts) {
		super();
		this.techName = techName;
		this.attempts = attempts;
	}
	
	
}