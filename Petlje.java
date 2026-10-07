import java.util.Scanner;
public class petlje {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Napisati program koji učitava cijele brojeve a i b i štampa sve neparne cijele brojeve iz intervala [a,b], od najvećeg ka najmanjem.

//		int a = sc.nextInt();
//		int b = sc.nextInt();

//		int brojac = b;
//		while (brojac >= a) {
//			if (brojac % 2 != 0) {
//				System.out.println(brojac);
//			}
//			brojac--;
//		}

//		Napisati program koji učitava cijele brojeve a i b i štampa sve cijele brojeve iz interval [a,b] koji pri dijeljenju sa 7 daju ostatak 1 ili ostatak 4.

//		for (int i = a; i <= b; i++) {
//			if (i % 7 == 1 || i % 7 == 4) {
//				System.out.println(i);
//			}
//		}

//		11. Napisati program koji učitava prirodan broj n i štampa sve njegove pozitivne djelioce.

//		int n = sc.nextInt();
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				System.out.println(i);
//			}
//		}

//		12. Napisati program koji učitava prirodan broj n i štampa zbir svih pozitivnih djelilaca broja n.
		
//		int suma = 0;
//		for (int i = 1; i <= n; i++) {
//			if (n % i == 0) {
//				suma = suma+i;
//			}
//		}
//		System.out.println(suma);
		
//		13. Prirodan broj n je savršen ako je jednak zbiru svih svojih pozitivnih djelilaca koji su manji
//		od n. Npr. broj 6 je savršen, jer su djelioci broja 6 redom 1, 2 i 3 i važi 1+2+3=6. Napisati
//		program koji učitava prirodan broj n i provjerava da li je savršen, i ako jeste, štampa
//		poruku “Savršen”, a ako nije savršen, štampa “Nije savršen”.
		
//		int suma = 0;
//		for (int i = 1; i < n; i++) {
//			if (n % i == 0) {
//				suma = suma+i;
//			}
//		}
//		if(suma == n) {
//			System.out.println("Savrsen");
//		}else {
//			System.out.println("Nije savrsen");
//		}
		

//		17. Unosi se cio broj n, a zatim n cijelih brojeva, po apsolutnoj vrijednosti manjih od 100000.
//		Štampati njihov zbir.
		
//		int n = sc.nextInt();
//		int suma = 0;
//		for(int i = 1;i<=n;i++) {
//			int br = sc.nextInt();
//			suma = suma+br;
//		}
//		System.out.println(suma);
		
//		18. Unosi se cio broj n, a zatim n cijelih brojeva, po apsolutnoj vrijednosti manjih od 100000.
//		Štampati najmanji od njih.
		
		
//		int n = sc.nextInt();
//		int min = Integer.MAX_VALUE;
//		System.out.println(min);
//		for(int i = 1;i<=n;i++) {
//			int br = sc.nextInt();
//			if(br<min) {
//				min = br;
//			}
//		}
//		System.out.println(min);
		
		
//		19. Unose se cijeli brojevi iz intervala [0,100], sve dok se ne unese broj koji ne priprada tom
//		intervalu. Odrediti prosječnu vrijednost unijetih brojeva.

//		int suma = 0;
//		int brojac = 0;
//		while(true) {
//			int br = sc.nextInt();
//			if(br<0 || br>100) break;
//			
//			suma = suma + br;
//			brojac++;
//		}
//		
//		double prosjek = (double)suma/brojac;
//		
		
//		14. Na parking ulazi 𝑁 automobila. Za svaki auto unosi se broj sati. Cijena je 2€ po satu, ali
//		ako auto ostane duže od 5 sati, od šestog sata cijena je 1€. Program računa ukupnu
//		zaradu.
		
//		int n = sc.nextInt();
//		int zarada = 0;
//		
//		for(int i = 1;i<=n;i++) {
//			int brSati = sc.nextInt();
//			if(brSati<=5)
//				zarada = zarada+2*brSati;
//			else 
//				zarada = zarada + (5*2 + (brSati-5));
//		}
		
		//mravi zadatak
		
/*		int n = sc.nextInt();
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y1 = sc.nextInt();
		int y2 = sc.nextInt();
		
		int br = 0;
		
		for(int i = 1;i<=n;i++) {
			int xmrav = sc.nextInt();
			int ymrav = sc.nextInt();
			
			if(xmrav == x1 || xmrav == x2 || ymrav == y1 || ymrav == y2) {
				br++;
			}
		}
		
		System.out.println(br);
	}

}*/
