package pl.kobietydokodu.koty.domain;

public class Pies {
	
	private String dogName;
	private String dogOwner;
	private int dogAge;
	public String getDogName() {
		return dogName;
	}
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	public String getDogOwner() {
		return dogOwner;
	}
	public void setDogOwner(String dogOwner) {
		this.dogOwner = dogOwner;
	}
	public int getDogAge() {
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	
	@Override
	public String toString() {
		return "Pies [Psie imię =" + dogName + ", psi właściciel =" + dogOwner + ", psi wiek =" + dogAge + "]";
	}
	
	
}
