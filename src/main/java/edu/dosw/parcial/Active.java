package edu.dosw.parcial;

public class Active {
	protected String name, email;

	public Active (String name, String mail) {
		this.name = name;
		this.email = mail;
	}

	public String getName () {
		return this.name;
	}

	public String getEmail () {
		return this.email;
	}
}
