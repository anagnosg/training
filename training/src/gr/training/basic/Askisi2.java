package gr.training.basic;

public class Askisi2 {

	public String secondFunction(){
		String s = "akis";
		System.out.println("second");
		return s;
	}
	
	
	public static int refInt(int a, int b){
		// TODO Auto-generated method stub
//tha ftiaxw synartisi afairesiInt, h opoia tha pernei dyo orismata typou int.
		//tha afairei to prwto orisma apo to deutero
		//kai tha to epistrefei.
		//kai sto main tha kaleso ayth thn synartisi me orismata 5 kai 3
		//kai tha ektiponei to apotelesma.
		
		int output= 0;
		output= a-b ;
		return output;
		}
	public static void main(String[] args) {
		
		int i=5;
		int k=3;
		int result =0;
		result = refInt(i,k);
		System.out.println(result);

		
	}
}
