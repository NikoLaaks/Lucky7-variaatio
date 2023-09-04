import java.util.Random;
import java.util.Scanner;

public class Lucky7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		int nro1 = 0;
		System.out.println("Anna rahamäärä");
		int money = Integer.parseInt(scanner.nextLine());
		
		while(money > 0) {
			money--;
			nro1 = rand.nextInt(10) + 1;
			if(nro1 == 7) {
				money = money + 3;
				System.out.println("Sait numeron " + nro1 + ". Voitit pelin");
			}else {
				System.out.println("Sait numeron " + nro1 + ". Hävisit pelin");
				
			}
			System.out.println("Haluatko pelata uudestaan?");
			System.out.println("Jos haluat pelata, paina Enter");
			System.out.println("Jos et halua pelata, kirjoita e ja paina Enter");
			String vastaus = scanner.nextLine();
			if(vastaus.equals("e")){
				System.out.println("Kiitos peleistä. Sinulle jäi rahaa " + money + " euroa");
				break;
			}
		}
	}

}
