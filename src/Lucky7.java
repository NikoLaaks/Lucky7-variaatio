import java.util.Random;

public class Lucky7 {

	public static void main(String[] args) {
		Random rand = new Random();
		int nro1 = 0;
		for(int i = 0; i < 3; i++) {
			nro1 = rand.nextInt(7) + 1;
			if(nro1 == 7) {
				System.out.println("Voitit pelin");
			}else {
				System.out.println("Hävisit pelin");
				
			}
		}
	}

}
