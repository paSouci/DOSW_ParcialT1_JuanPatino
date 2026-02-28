package edu.dosw.parcial;

public class Hackathon extends Evento {
	public boolean confirmed;

	public Hackathon (String t, String ds, boolean confirmed) {
		super(
			240,
			-1,
			t,
			ds,
			"Professors"
		);
		this.confirmed = confirmed;
	}

	public boolean getConfirmed () {
		return this.confirmed;
	}
}
