package Com.Epicode.Player;

import java.util.Scanner;

public class Menu {

	private Foto[] arrayMenu = new Foto [5];
    int counter=0;
	public Menu() {
	//	super();
	}

	public Foto [] getArrayMenu() {
		return arrayMenu;
	}

	public void setArrayMenu(Foto[] arrayMenu) {
		this.arrayMenu = arrayMenu;
	}
	public void CreazioneOggetto() {
		if (counter==5) {
			selettore();
		} else {
	System.out.println("Benvenuto"); 
	
	System.out.println("Titolo"); 
	Scanner Scan = new Scanner(System.in);
	String titolo = Scan.nextLine();
	
	System.out.println("Luminosita"); 
	Scanner Scan2 = new Scanner(System.in);
	int lum = Scan2.nextInt();
	
	Foto obj = new Foto(titolo, lum);
	
	arrayMenu[counter] = obj;
	counter ++;
	CreazioneOggetto();

		}
	}
	public void selettore() {
		for (Foto foto : arrayMenu) {
			System.out.println(foto);
		}
		System.out.println("1"+arrayMenu[0].getTitle());
		System.out.println("2"+arrayMenu[1].getTitle());
		System.out.println("3"+arrayMenu[2].getTitle());
		System.out.println("4"+arrayMenu[3].getTitle());
		System.out.println("5"+arrayMenu[4].getTitle());
		Scanner Scan3 = new Scanner(System.in);
		int opzioni = Scan3.nextInt();
		
		switch (opzioni) {
		case 1: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		case 2: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		case 3: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		case 4: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		case 5: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		case 0: {
			System.out.println(arrayMenu[0].getTitle()+"File in esecuzione");
			selettore();
			break;
			}
		default:{
			System.out.println("Errore");
			selettore();
			break;
		}
		
		}
		
	}
	
}
