package gr.training.basic;

public class Askisipraxisstring3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Μόνο μία από τις συνολικά έξι σημαίες δεν βρίσκεται πια στη θέση της";
//poses fores vriskete to δεν.
		
//οριζω metavliti Sting s= Μόνο μία από τις συνολικά έξι σημαίες δεν βρίσκεται πια στη θέση της	
	boolean b = true;
	int count=0;
	while (b){
		int index = s.indexOf("δεν");
		if (index!=-1) {
			count=count+1;
			s=s.substring(index+3,s.length());
		}
		else {
			b= false;
		}
	}
			System.out.println(count);
		}
	}
	
	
	


