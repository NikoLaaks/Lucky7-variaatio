import java.util.Random;

public class Lucky7 {

	public static void main(String[] args) {
		Random rand = new Random();
		int nro1 = 0;
		int money = 5;
		
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
