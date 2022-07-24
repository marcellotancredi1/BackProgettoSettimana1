package Com.Epicode.Player;

public class Video extends Player implements Volume, Luminosita {
	
	private	int volume;
	private	int durata;
	private int lum;
		public Video(String title, int volume, int durata, int lum) {
			super(title);
			this.volume = volume;
			this.durata = durata;
			this.lum = lum;
		}

		public int getVolume() {
			return volume;
		}

		public void setVolume(int volume) {
			this.volume = volume;
		}

		public int getDurata() {
			return durata;
		}

		public void setDurata(int durata) {
			this.durata = durata;
		}

		@Override
		public void alza_volume() {
			volume++;
			String alzare = "";
			for(int x=0; x < this.volume; x++) {
				 alzare += "!";
			}
			System.out.println(alzare);
		}

		@Override
		public void abbassa_volume() {
			volume--;
			String alzare = "";
			for(int x=0; x < this.volume; x++) {
				 alzare += "!";
			}
			System.out.println(alzare);
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
