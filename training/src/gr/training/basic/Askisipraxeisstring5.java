package gr.training.basic;

public class Askisipraxeisstring5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6.na graphw to keimeno me anapoda tis lexeis.diladi της θεση στη...

		String s = "Μόνο μία από τις συνολικά έξι σημαίες δεν βρίσκεται πια στη θέση της";
		String s1 = new String(s);
		boolean b = true;

		// to count periexei to plithos emfaniseon twn kenwn ara twn lexewn. kai
		// to arxikopoioume me 0.
		int count = 0;
		// orizoume mia while pou trexei oso to b einai me true.
		while (b) {
			// vriskoume posa kena exei.
			int index = s1.indexOf(" ");
			// εαν εχουμε βρει το keno.
			if (index != -1) {
				// prosthetoyme 1
				count = count + 1;
				// thetoume to sting s= me to string apo thn thesi pou vrikame
				// to keno και μετα.
				s1 = s1.substring(index + 1, s1.length());
				// System.out.println(count + 1);
			}
			// δεν βρηκαμε αλλο keno.αρα το b=false
			else {
				b = false;

			}
		}
		// System.out.println(count);

		String[] array = new String[count + 1];
		for (int i = 0; i < count; i++) {
			int index = s.indexOf(" ");
			String lexi = s.substring(0, index);
			array[i] = lexi;
			s = s.substring(index + 1, s.length());
			System.out.println(lexi);
		}
		String s2 = "";
		for (int i = count-1; i >= 0; i--) {
			
			s2 = s2 + " " + array[i];

		}
		System.out.println(s2);

	}
}
