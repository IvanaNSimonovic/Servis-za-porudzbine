package domaci2;

import java.util.Scanner;

public class Domaci2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("unesi broj sastojaka:");
		int imaSastojaka = sc.nextInt();
		System.out.println("unesi sastojke");
		int sastojak;
		int i = 0;
		int cenaPice = 200;
		int idPica = 1;
		while (i < imaSastojaka) {
			i=i+1;
			sastojak = sc.nextInt();
			idPica = idPica * sastojak;
		    switch (sastojak) {
		    case 2:cenaPice=cenaPice+50;break;
		    case 3:cenaPice=cenaPice+40;break;
		    case 5:cenaPice=cenaPice+30;break;
		    case 7:cenaPice=cenaPice+40;break;
		    default:System.err.println("Greška, željeni sastojak ne postoji u bazi podataka. Pokušajte ponovo");
		    }

		}
		System.out.print("Narucili ste picu ");
		switch(idPica) {
		case 3*5*7:System.out.println("Vesuvio");break;
		case 2*7:System.out.println("Pepperoni");break;
		case 2*3*5:System.out.println("Capriciosa");break;
		default:System.out.println("Kombinacija!");break;
		}
		System.out.println("Cena pice je "+cenaPice+"din.");
	}

}
