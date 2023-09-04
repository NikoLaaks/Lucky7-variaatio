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
			nro1 = rand.nextInt(7) + 1;
			if(nro1 == 7) {
				money = money + 3;
				System.out.println("Voitit pelin");
			}else {
				System.out.println("Hävisit pelin");
				
			}
		}
	}

}
