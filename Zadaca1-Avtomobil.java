package zadaca1;

public class Avtomobil {
	public String marka;
	public String model;
	public String boja;
	public double pominatiKm;
	public int godinaNaProizvodsvo;
	public String registracija;
	
	public Avtomobil(String marka, String model, String boja, double pominatiKm, int godinaNaProizvodsvo, String registracija) {
		this.marka = marka;
		this.model = model;
		this.boja = boja;
		this.pominatiKm = pominatiKm;
		this.godinaNaProizvodsvo = godinaNaProizvodsvo;
		this.registracija = registracija;
	}
	
	public void prvMetod() {
		System.out.println(this.marka + ", " + this.model + ", " + this.boja + ", " + this.registracija);
	}
	
	public double vtorMetod() {
		double pKm;
		pKm = this.pominatiKm + 1520.25;
		return pKm;
	}
	
	
	
	

}
