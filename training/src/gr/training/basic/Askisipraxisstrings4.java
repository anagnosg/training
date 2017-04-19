package gr.training.basic;

public class Askisipraxisstrings4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//na metrisw poses lexeis exei
	
		String s = "Μόνο μία από τις συνολικά έξι σημαίες δεν βρίσκεται πια στη θέση της";
		boolean b = true;
		//to count periexei to plithos emfaniseon twn kenwn ara twn lexewn. kai to arxikopoioume me 0.
				int count= 0;
				//orizoume mia while pou trexei oso to b einai me true.
				while (b) {
			//vriskoume posa kena exei.
					int index = s.indexOf(" ");
			//εαν εχουμε βρει το keno.  
					if (index != -1) {
						//prosthetoyme 1
					count=count+1;
			//thetoume to sting s= me to string apo thn thesi pou vrikame to keno και μετα.			
						s=s.substring(index+1,s.length());
						System.out.println(count+1);
					}
					//δεν βρηκαμε αλλο keno.αρα το b=false
					else {
						b=false;
						
					}
				}
		System.out.println(count);
			}
			
		

	}
	


