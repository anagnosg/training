package gr.training.basic;

public class Pinakes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[]pinakas1 =new String [10];//deka theseis
pinakas1[0] = "arithmos 1"; //ksekinaei apo to 0
pinakas1[1] ="akoma ena"; //stin deuteri grammi tou pinaka valame ton arithmo 7.
pinakas1[9] ="TELOS";

//PAME NA GEMISOUME ENAN PINAKA ME STOIXIA.

for (int i =0; i < pinakas1.length ; i++ ){
pinakas1[i]= "Alfaritmitiko"+i;
}

//for (int i= 0; i<10; i++){
//System.out.print(pinakas1[i]);
for (int i=0; i<pinakas1.length ; i++){
	System.out.println(pinakas1[i]);
}
	
	}
}
