package gr.training.basic;

public class Functions1 {
	//auth h synartisi einai public.borei diladi na klithei kai apo alla adikeimena.
	//epistrefei antikeimeno typou string.
	//onomazetai firstFunction kai den exei kanena orisma.
public String firstFunction(){
	String s = "akis";
	System.out.println("first");
	return s;
	
	
}
public static int addInt(int a, int b){
	//to static kathorizei oti den xreiazete h dimiourgia gia thn klisi tis synartisis
	// auth h synartisi einai public
	//epistrefei int
	//onomazetai addInt
	//pernei 2 orismata
	//to proto einai int me onoma a
	//to deutero einai int me onoma b
	//tha pernei tous duo arithmous a kai b kai tha tous prosthetei kai to apotelesma tha to epistrefei.
	int output= 0;
	output= a+b ;
	return output;
	
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
int i=1;
int k=7;
int result =0;
result = addInt(i,k);
System.out.println(result);

	}
}
