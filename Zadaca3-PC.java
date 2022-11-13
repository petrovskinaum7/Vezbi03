package zadaca3;

public class PC {
	public int memorija;
	public String tipNaMemorija;
	public int hardDisk;
	String golemina = "GB";
	
	public PC() {
		this.memorija = 2;
		this.tipNaMemorija = "DDR4";
		this.hardDisk = 256;
	}
	
	public void prvMetod(int zgolemiMemorija, int novHardDisk) {
		int novaMemorija = this.memorija +  zgolemiMemorija;
		int novHD = this.hardDisk + novHardDisk;
		
		
		System.out.println("Memorijata bese: " + this.memorija + "GB, a sega iznesuva " + novaMemorija + "GB." );
		System.out.println("Tipot na memorijata e: " + this.tipNaMemorija + ".");
		System.out.println("HD ima golemina od: " + novHD + "GB, prethodno iznesuvase: " + this.hardDisk + "GB.");
		
		
		
		
		
	}

}
