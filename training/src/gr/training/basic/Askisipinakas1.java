package gr.training.basic;

public class Askisipinakas1 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//na oristei enas pinakas integer me 10 stoixeia.
//na gemisoume ton pinaka me ena for loop
//oi times na einai ta tetragona twn thesewn.diladi sth thsi 0 tha valoume 0*0
//sth thesi 1 tha valoume 1*1,sth thesi 2  2*2 ...
		int[] pinakas1=new int[10];
		
		for(int i= 0; i<10; i++){
		pinakas1[i]= i*i;	
		}
		 
		for(int i= 0; i<10; i++){
		}
			for(int i=0; i<pinakas1.length ; i++){

			System.out.println(pinakas1[i]);
		
			}
	}
}	
			
			//το εκανα με δυο τροπους.
			//πολλαπλασιάζοντας τον ακαιρεο της θεσης του πινακα με τον εαυτο του.δηλαδη
			//6*6=36.
			//(int)Math.pow(5,2); όπου 5 ο ακεραιο της τεταρτης θεσης του πινακα,
			//οπου 2 η δυναμη.
			
		
		

