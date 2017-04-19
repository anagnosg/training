package gr.training.basic;

public class Askisi5 {
	public static String commaSeparated(int start, int end,int step){
		String output="";
		//theloume akolouthia pou na arxizei apo 10,9,8,...0
		for (int i=start; i<end; i=i+step){
			if (i<end-1){
				output=output+(i)+",";
				
			}
			else {
				output=output+(i);
				
			}
		}
		
		return output;
		
	}
	public static String commaSeparatedReverse(int start, int end,int step){
		String output="";
		//theloume akolouthia pou na arxizei apo 10,9,8,...0
		for (int i=end; i>start; i=i-step){
			if (i>start+1){
				output=output+(i)+",";
				
			}
			else {
				output=output+(i);
				
			}
		}
		
		return output;
		
	}
public static void main(String[] args) {
	// TODO Auto-generated method stub
//tha ftiaxw mia synartisi h opoia tha kanei commaSeparatdReverse
		//tha kanei oti kai commaSeparated alla adistrofa.
	//tha pernei tria orismata tha epistrefei string 
	//prwto orisma tha einai integer:start , to deutero orisma tha einai integer end, kai to trito step.
//tha einai static kai public h synartisi.	
	
	
	String s= "" ;
	int start=0;
	int end=10;
	int step=1;
	
	s=powercommaSeparated(start,end,step);
	
			System.out.println(s);
		String s2="";
		int start2=5;
		int end2=25;
		int step2=2;
		s2=powercommaSeparated2(start2,end2,step2);
		System.out.println(s2);
}
public static int powerInt(int a){
int output=0;
output=a*a;
return output;

}
public static String powercommaSeparated(int start, int end, int step){
	String output ="";
	
	//theloume start 0 kai end 10 kai step 1
	//theloume na mas paraxei to apotelesma 0,1,4,9...81
	for (int i=start; i<end; i=i+step){
		if (i<end-step){
			output=output+(powerInt(i))+",";
			
		}
		else {
			output=output+(powerInt(i));
			
		}
	}
	
	return output;
	
}
public static String powercommaSeparated2(int start, int end, int step){
	String output ="";
	
	//THELOUME start 0 kai end 10 kai step 1
	//theloume na mas paraxei to apotelesma 0,1,4,9...81
	for (int i=start; i<end; i=i+step){
		if (i>=end-step){
			output=output+(powerInt(i));
		}
		else {
			output=output+(powerInt(i))+",";
			
		}
	}
	
	return output;
	
}
}


