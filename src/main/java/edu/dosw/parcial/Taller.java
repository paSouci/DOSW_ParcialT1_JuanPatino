package edu.dosw.parcial;

public class Taller extends Evento {
	private boolean needsMaterial;

	public Taller (int mo, String t, String ds, boolean nm) {
		super(
			240,
			mo,
			t,
			ds,
			"Professors or Admins"
		);
		this.needsMaterial = nm;
	}

	public String state () {
		return this.inscritos < 10 ? "POR CONFIRMAR" : "CONFIRMADO";
	}

	public boolean getNeedsMaterial () {
		return this.needsMaterial;
	}
}
