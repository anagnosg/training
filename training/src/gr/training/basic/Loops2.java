package gr.training.basic;

public class Loops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// xekinaei to programma me b= true.
		// orizei mia metavliti i=0.
		// ektelei while loop oso to b einai true.
		// ektyponei to i,auxanei kata 1 to i
		// elenxei an to i einai megalutero apo to 10
		// kai an einai megalutero apo 10
		// kanei to b false
		// epomenos afou kanei false stamataei to while loop

		// while loop
		boolean b = true;
		// oso h ekrasi b einai true ektelese thn loop
		int i = 0;
		while (b) {
			System.out.println(i);

			i = i + 1;
			if (i > 10) {
				b = false;

			}
		}
	}

}
