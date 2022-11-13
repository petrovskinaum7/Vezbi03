package zadaca2;

public class Fakultet {
	public String nazivNaFakultet;
	public int brojNaSmerovi;
	public int brojNaStudenti;
	public String dekan;
	public String sediste;
	
	
	
	public void PrvMetod() {
		System.out.println("Brojot na studenti iznesuva: " + (this.brojNaStudenti + 50));
	}
	
	public int vtorMetod(int namali) {
		int namalenaVrednost = this.brojNaStudenti - namali;
		return namalenaVrednost;
	}
	
	public void tretMetod() {
		System.out.println("Naziv na fakultet: " + this.nazivNaFakultet + ", sediste: "+ this.sediste);
		
	}
	
	
	  
	  

}
