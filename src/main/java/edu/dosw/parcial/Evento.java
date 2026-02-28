package edu.dosw.parcial;

import java.util.ArrayList;
import java.util.List;

public class Evento {
	protected int maxTime;
	protected int maxOccup;
	protected String title;
	protected String dateStart;
	protected String createdBy;
	protected int inscritos;

	protected List<Active> miembros;

	public Evento (int mt, int mo, String t, String ds, String cb) {
		this.miembros = new ArrayList<>();
		this.maxTime = mt;
		this.maxOccup = mo;
		this.title = t;
		this.dateStart = ds;
		this.createdBy = cb;
		this.inscritos = 0;
	}

	public int getMaxTime () {
		return this.maxTime;
	}

	public int getMaxOccup () {
		return this.maxOccup;
	}

	public String getTitle () {
		return this.title;
	}

	public String getDateStart () {
		return this.dateStart;
	}

	public String getCreatedBy () {
		return this.createdBy;
	}

	public void addMember (Active p) {
		this.miembros.add(p);
		System.out.println("Inscripcion exitosa de " + p.getName() + " a " + this.title);
	}

	public void modifyTitle (String newt) {
		this.title = newt;
	}
}
