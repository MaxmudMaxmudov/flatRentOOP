package com.company;

public class Client {
	private String name;
	private String surname;
	private String id;
	private int weeksNumber;

	public Client() {
	}

	public Client(String name, String surname, String id) {
		this.name = name;
		this.surname = surname;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getWeeksNumber() {
		return weeksNumber;
	}



	public void addWeeksNumber(int weeksNumber){
		this.weeksNumber=weeksNumber;

	}
}
