package Com.Epicode.Player;

public class Audio extends Player implements Volume{

	private	int volume;
	private	int durata;
	
		public Audio(String title, int volume, int durata) {
			super(title);
			this.volume = volume;
			this.durata = durata;
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
	
}
