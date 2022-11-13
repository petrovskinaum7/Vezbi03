package zadaca2;

public class MainClass {

	public static void main(String[] args) {
		
		Fakultet f1 = new Fakultet();
		f1.nazivNaFakultet = "FIKT";
		f1.brojNaSmerovi = 5;
		f1.brojNaStudenti = 250;
		f1.dekan = "Petre Kostadinov";
		f1.sediste = "Bitola";
		
		f1.PrvMetod();
		System.out.println("Namalen broj na studenti: " + f1.vtorMetod(50));
		f1.tretMetod();
		
		Fakultet f2 = new Fakultet();
		f2.nazivNaFakultet = "VMS";
		f2.brojNaSmerovi = 6;
		f2.brojNaStudenti = 100;
		f2.dekan = "Sonja Kostadinova";
		f2.sediste = "Bitola";
		
		f2.PrvMetod();
		System.out.println("Namalen broj na studenti: " + f2.vtorMetod(50));
		f2.tretMetod();
	}

}
