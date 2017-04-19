package gr.training.basic;

public class Loop3 {
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
//mia synartisi h opoia tha einai public static.
//kai tha epistrefei string kai tha legetai PowercommaSeperatedReverse.
//tha pernei tria orismata (int start,intend,ind step)
//tha epistrefei commaseparated me ta tetragona meadistrofi seira.
		//diladi 81,64...0
	
	String s= "" ;
	int start=0;
	int end=9;
	int step=1;
	
s=powercommaSeparatedReverse(start,end,step);
System.out.println(s);
}
public static int powerInt(int a){
int output=0;
output=a*a;
return output;

}
public static String powercommaSeparatedReverse(int start, int end, int step){
	String output ="";
	
	//THELOUME start 0 kai end 10 kai step 1
	//theloume na mas paraxei to apotelesma 0,1,4,9...81
	for (int i=end; i>start; i=i-step){
		if (i<=start+step){
			output=output+(powerInt(i));
		}
		else {
			output=output+(powerInt(i))+",";
			
		}
	}
	
	return output;
	
}	
}