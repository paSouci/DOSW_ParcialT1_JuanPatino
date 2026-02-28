package edu.dosw.parcial;

public class App {
	private static void test () {
		Taller t = new Taller(
			30,
			"Clean Code Avanzado",
			"2026-03-20 10:00",
			true
		);

		t.addMember(new Student("juan diego",      "juan.patino-m@mail.escuelaing.edu.co"));
		t.addMember(new Student("tomas diaz",      "tomas-olaya-d@mail.escuelaing.edu.co"));
		t.addMember(new Student("camilo lizarazo", "camilo-lizarazo@mail.escuelaing.edu.co"));

		t.modifyTitle("holaa");
	}

	public static void main(String[] args) {
		test();
	}
}
