package org.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "course")
public class Course {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private Integer courseId;
	@Column(name = "course_name")
	private String courseName;
	@ManyToOne(cascade = {
			CascadeType.DETACH,
			CascadeType.MERGE,
			CascadeType.PERSIST,
			CascadeType.REFRESH
	})
	@JoinColumn(name = "instructor_id")
	private Instructor instructor;
	
	
	/* @OneToMany(cascade = CascadeType.ALL) */
	 
 
	  private List<Review> reviews;
	  
	  public void add(Review tempReview) { if(tempReview==null) { reviews=new
	  ArrayList<Review>();
	  
	  } reviews.add(tempReview); tempReview.setCourse(this); }
	 
	
	
	
	
	
	
	
	
	
	
	

}