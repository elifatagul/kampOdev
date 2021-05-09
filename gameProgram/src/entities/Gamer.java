package entities;

import java.time.LocalDate;

public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nationalityId;
	private int dateOfBirth;
	private int password;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, int password, int dateOfBirth, String nationalityId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.nationalityId = nationalityId;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int DateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(int NationalityId) {
		this.nationalityId = nationalityId;
	}
	
	
	

}
