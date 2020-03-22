package springdemo.mvc;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Student {

	private String firstName;
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="Only 5 Characters or digit")
	private String postalCode;
	private String country;
	private String language;
	private LinkedHashMap<String,String> countryoptions;
	private String[] operatingsystems;
	@Min(value=0,message="value must be greater than or equal to 0")
	@Max(value=10,message="value must be less than or equal to 10")
	private int freepasses;
	
	
	public Student()
	{
		countryoptions=new LinkedHashMap<>();
		countryoptions.put("BR", "Brazil");
		countryoptions.put("IN","India");
	}

	public int getFreepasses() {
		return freepasses;
	}

	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
	
	
}

