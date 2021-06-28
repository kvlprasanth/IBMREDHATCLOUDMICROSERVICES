package org.example.spring_annotation.demo.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value = "thePerson")
//@Scope(value = "prototype")
public class Person {
	@Value("101")
	private Integer personId;
	@Value("prasanth")
	private String firstName;
	@Value("kvl")
	private String lastName;
	@Value("prasanth@email.com")
	private String email;
	@Value("${person.team}")
	private String team;
	@Value("${person.country}")
	private String country;
	private Address address;
	public Person() {
		super();
	}
	
	@Autowired
	public Person(Address address) {
		super();
		this.address = address;
	}


	
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", team=" + team + ", country=" + country + ", address=" + address + "]";
	}

	public Integer getPersonId() {
		return personId;
	}
	public void setPersonId(Integer personId) {
		this.personId = personId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	


}
