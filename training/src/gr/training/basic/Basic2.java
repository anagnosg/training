package gr.training.basic;

public class Basic2 {
 
 
 //Θα φτειάξουμε μια συνάρτηση η οποία δέχεται σαν ορίσματα την εκκίνηση, το τέλος και το βήμα ενός loop
 //kai ua epistrefei comma separated me tous akeraioys 
 //start , end , bhma  Π.χ 1 ,10, 1 kai 8a epistrefei  String 1,2,3,4... ,10
  public static String commaSeparated(int start,int end,int step){
  String output = "";
  for(int i = start ; i < end ; i= i +step){
   if(i< end -step ){
    output = output + i+","; 
   }
   else{
    output = output + i;
   }
  }
  return output;
	}

 public static void main(String[] args) {
	 String s=("");
	 for (int i=0; i>10; i=1){
 
   System.out.println(s);
	 
	 }
 }
}