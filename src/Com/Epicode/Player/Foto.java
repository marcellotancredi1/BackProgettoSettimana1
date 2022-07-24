package Com.Epicode.Player;

public class Foto extends Player implements Luminosita {

	private int lum;
	public Foto(String title, int lum) {
		super(title);

		this.lum = lum;
	}

	








	public int getLum() {
		return lum;
	}








	public void setLum(int lum) {
		this.lum = lum;
	}










	@Override
	public void alza_luminosita() {
		lum++;
		String alzare = "";
		for(int x=0; x < this.lum; x++) {
			 alzare += "!";
		}
		System.out.println(alzare);			
	}

	@Override
	public void abbassa_luminosita() {
		lum--;
		String alzare = "";
		for(int x=0; x < this.lum; x++) {
			 alzare += "!";
		}
		System.out.println(alzare);			
	}	
	
	
}
