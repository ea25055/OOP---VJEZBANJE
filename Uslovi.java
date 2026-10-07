import java.util.Scanner;

public class Uslovi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		8. Napisati kod koji učitava dva cijela broja m i n štampa poruku „x je djeljiv sa y” ili „x nije
//		djeljiv sa y“. Npr. „15 je djeljiv sa 3“ ili „15 nije djeljiv sa 4“.

//		int m = sc.nextInt();
//		int n = sc.nextInt();
//		
//		if(m%n == 0) {
//			System.out.println(m+" je djeljiv sa "+n);
//		}else {
//			System.out.println(m+" nije djeljiv sa "+n);
//		}

//		9. Napisati kod koji učitava brojeve x, a i b provjerava da li x pripada intervalu [a,b] i štampa
//		odgovarajuću poruku („Pripada“ ili „Ne pripada“).

//		double a = sc.nextDouble();
//		double b = sc.nextDouble();
//		double x = sc.nextDouble();
//		
//		if(x>=a && x<=b) {
//			System.out.println("pripada");
//		}else {
//			System.out.println("ne pripada");
//		}

//		11. Napisati kod koji provjerava da li je zbir cifara datog trocifrenog broj dvocifren broj.

//		int trocifren = 342; 
//		int stotine = trocifren/100;
//		int ostatak = trocifren%100;
//		int desetice = ostatak/10;
//		int jedinice = ostatak%10;
//		
//		int zbir = stotine+desetice+jedinice;
//		if(zbir>=10 && zbir<=99) {
//			System.out.println("jeste dvocifren");
//		}else {
//			System.out.println("nije dvocifren");
//		}

//		13. Dat je četvorocifreni prirodan broj abcd . Štampati poruku „Super“ ako važi a + c = b + d .

//		int cetvorocifren = 1234; 
//		int hiljade = cetvorocifren/1000; 
//		int trocifren = cetvorocifren%1000; //234
//		int stotine = trocifren/100;
//		int ostatak = stotine%100;
//		int desetice = ostatak/10;
//		int jedinice = ostatak%10;
//		
//		if(hiljade+desetice == stotine+jedinice) {
//			System.out.println("Super");
//		}else {
//			System.out.println("nije super");
//		}

//		14. Dat je četvorocifreni prirodan broj. Ako su mu cifra jedinica i cifra hiljada jednake,
//		štampati kvadrat dvocifrenog broja koji se dobije kada se uklone cifra jedinica i cifra
//		hiljada. Ako te dvije cifre nisu jednake, štampati zbir kvadrata svih cifara.

//		if(jedinice == hiljade) {
//			int broj = stotine*10+desetice;
//			System.out.println(broj*broj);
//		}else {
//			int kv = hiljade*hiljade+stotine*stotine+desetice*desetice+jedinice*jedinice;
//			System.out.println(kv);
//		}

//		12. Napisati kod koji za 3 data cijela broja x, y i z štampa najveći od njih.

//		int x = sc.nextInt();
//		int y = sc.nextInt();
//		int z = sc.nextInt();

//		int max;
//		if(x>=y && x>=z) {
//			max = x;
//		}else if(y>=x && y>=z) {
//			max = y;
//		}else {
//			max = z;
//		}

// 		 data su 3 broja. stampati srednji,najmanji,najveci u tom redosljedu

//		int max;
//		int middle;
//		int min;
//		if (x >= y && x >= z) {
//			max = x;
//
//			if (y >= z) {
//				middle = y;
//				min = z;
//			} else {
//				middle = z;
//				min = y;
//			}
//
//		} else if (y >= x && y >= z) {
//			max = y;
//
//			if (x >= z) {
//				middle = x;
//				min = z;
//			} else {
//				middle = x;
//				min = y;
//			}
//
//		} else {
//			max = z;
//
//			if (y >= x) {
//				middle = y;
//				min = x;
//			} else {
//				middle = x;
//				min = y;
//			}
//		}
//		
//		System.out.println(middle+" "+min+" "+max);

	/*	double x = sc.nextDouble();
		double y;

		if (x <= -7) {
			y = -2 * x + (7 / 2);
		} else if (x > -7 && x < 1) {
			y = (Math.pow(x, 2) - 3 * x + 5) / (Math.pow(x, 2) + 2);
		} else if (x >= 1 && x <= 8) {
			y = Math.sqrt(Math.pow(x, 2) + 2 * x + 2) + Math.sqrt(Math.abs((3 / 2) * x - 4 / 7));
		} else {
			y = Math.abs(3 / Math.pow(x, 2) - 11 * x);
		}
		
		System.out.println(y);

	}

}*/
