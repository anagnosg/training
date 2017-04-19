package gr.training.basic;

public class Askisi7 {
 public String evdomiAskisi(){
  String s = "Ag";
  System.out.println("evdomi");
  return s;
 }

 public static int commaSeparated(int a){
 int output= 0 ;
 output= (a*a) ;
 return output ;
 }
 
  public static void main(String[] args) {
  // TODO Auto-generated method stub
//tha ftiaxw mia synartisi h opoia tha onomazete power kai h opoia tha pernei ena integer san orisma kai tha epistrefei auto to integer sto tetragono.
  //px 6*6=36
  //na ftiaxw episis kai mia synartisi h opoia tha dhmiourgei ena alfarithmitiko commaSeparated me tis dunameis
  //diladi na dinw start en kai vima px.start 1  end 10 vima 1 kai na mou ftiaxnei to string me tis dinameis.
  
  int a=6 ;
  int result =0;
  result = commaSeparated(a);
  System.out.println(result);
  System.out.println("dinameis");
  for (int i= 6 ; i<=1296; i=i*6){
		System.out.println(i);
  
		  }
  
  }
}