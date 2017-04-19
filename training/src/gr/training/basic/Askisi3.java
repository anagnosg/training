package gr.training.basic;

public class Askisi3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// na dhmiourgithei alfarithmitiko me tous peritous arithmous apo to 1
		// ews to 100 , (saperated)diaxorizomenos me komma xwris komma sto
		// teleutaio arithmo.

		String s = "";
		for (int i = 1; i < 100; i = i + 2) {
			if (i < 99) {
				s = s + i + ",";
			} else {
				s = s + i;
			}
		}
		System.out.println(s);
	}
}

// for i na xekinaei apo 1
// i na einai mikrotero tou 100
// i na auxanete kata 2 opote na exoume mona apotelesmata
// ean i<99 tote s=s+i+",";
// tote s=s+i;
// ara kovete to , sto 99 pou einai o teleuteos peritos prin to 100.
