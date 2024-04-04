package exercisesPackage;

import java.util.Scanner;

public class ExerciseOne {
	/*
	 	ES.1
		Scrivere un programma che visualizzi sullo schermo del terminale il vostro nome all’interno di un
		rettangolo, come nell’esempio seguente:
		+ - - - +
		| Dario |
		+ - - - +
		*/

	public static void printMyName() 
	{
		String[][] name = new String[3][8]; //Simone
		
		name[0][0] = "+"; // [riga][colonna]
		name[0][7] = "+";
		name[2][0] = "+";
		name[2][7] = "+";
		
		name[1][0] = "|";
	    name[1][7] = "|";
	    
	    name[0][1]= "-";
	    name[0][2]= "-";
	    name[0][3]= "-";
	    name[0][4]= "-";
	    name[0][5]= "-";
	    name[0][6]= "-";
	    
	    name[1][1]= "S";
	    name[1][2]= "I";
	    name[1][3]= "M";
	    name[1][4]= "O";
	    name[1][5]= "N";
	    name[1][6]= "E";
	    
	    name[2][1]= "-";
	    name[2][2]= "-";
	    name[2][3]= "-";
	    name[2][4]= "-";
	    name[2][5]= "-";
	    name[2][6]= "-";

	    
	    for(int i=0;i<name.length;i++) 
	    {
	    	for(int j=0;j<name[i].length;j++) 
	    	{
	    		System.out.print(name[i][j]);
	    	}
	    	System.out.println("");
	    }
	    
	    Scanner input = new Scanner(System.in);
	    String nameVar = input.nextLine();
	    int lengthArrayColumns = nameVar.length()+2;
	    char[] orginalCharArray = nameVar.toCharArray();
	    int position = 0;
	    
	    String[][] nameArray = new String[3][lengthArrayColumns];
	    
	    name[0][0] = "+"; // [riga][colonna]
		name[0][lengthArrayColumns] = "+";
		name[2][0] = "+";
		name[2][lengthArrayColumns] = "+";
		
		/*for(int i=1; i<lengthArrayColumns-1;i++) 
		{
			name[1][i] = orginalCharArray[position];
		}*/
	    
	}
}
