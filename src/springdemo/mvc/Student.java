package springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	private String country;
	private String language;
	private LinkedHashMap<String,String> countryoptions;
	private String[] operatingsystems;
	public Student()
	{
		countryoptions=new LinkedHashMap<>();
		countryoptions.put("BR", "Brazil");
		countryoptions.put("IN","India");
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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountryoptions() {
		return countryoptions;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String[] getOperatingsystems() {
		return operatingsystems;
	}

	public void setOperatingsystems(String[] operatingsystems) {
		this.operatingsystems = operatingsystems;
	}
	
	
	
	
	
}

