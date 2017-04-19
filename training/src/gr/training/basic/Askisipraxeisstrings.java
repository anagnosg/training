package gr.training.basic;

public class Askisipraxeisstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Μόνο μία από τις συνολικά έξι σημαίες δεν βρίσκεται πια στη θέση της";

		int thesi1 = s.indexOf("α");
		System.out.println(thesi1);

		int thesi2 = s.lastIndexOf("δεν");
		System.out.println(thesi2);
		int length = 0;
		length = s.length();
		String[] array = new String[length];
		for (int i = 0; i < length; i++) {
			array[i] = s.substring(i, i + 1);

		}
		String s2 = "";
		for (int i = length - 1; i >= 0; i--) {
			s2 = s2 + array[i];

		}
		System.out.println(s2);

	}
}

// 1.na metrisw posa a exei.
// 2.poses fores emfanizete h lexi den.
// 3.na graphw anapoda(apo telos stin arxh.
// 4.na metrisw poses lexeis exei.
// 5.na spasw to keimeno se lexeis kai na to valw se keimeno.
// 6.na graphw to keimeno me anapoda tis lexeis.diladi της θεση στη...
// να γινουν με while
