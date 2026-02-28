package edu.dosw.parcial;

public class Conferencia extends Evento {
	private String conf; 

	public Conferencia (int mo, String t, String ds, String conf) {
		super(
			180,
			mo,
			t,
			ds,
			"Professors"
		);
		this.conf = conf;
	}

	public String getConf () {
		return this.conf;
	}
}
