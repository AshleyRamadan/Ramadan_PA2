package p3;

import java.util.Scanner;
public class p3 {

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int z = 1;
		int i;
		int j;
		int option;
		// initialize arrays
		String[] topics = new String[5];
		int[][] responses = new int[5][11];

		int flag = 0;
		
		// How many people
		System.out.println("How many people will be polled?");		
		
		int folks = scan.nextInt();
		if (folks <= 0)
		{
			System.out.println("Um, no. Bye.");
			return;
		}
		
		System.out.println("Please rate the following issues on a scale of 1 (least important) to 10 (most important)");
		
		
		// initialize responses to 0
		for (i = 0; i < 4; i++)
		{
			for (j = 0; j <= 10; j++)
			{
				responses[i][j] = 0;
			}
		}
		
		// add topics
		topics[0] = "How important is pizza in your life?";
		topics[1] = "How important is Blue Bell ice cream out of all ice creams?";
		topics[2] = "How important is someone's political alignment to you?";
		topics[3] = "How important is climate change to you?";
		topics[4] = "How important are other's perceptions of you?";
		
		// poll the people;
		for(z = 1; z <= folks; z++)
		{
			for (i = 0; i < 5; i++)
			{
				System.out.println(topics[i]);
				option = scan.nextInt();
				if ((option < 1) || (option > 10))
				{
					System.out.println("I said vote 1 - 10. " + option + " is not between 1 and 10.");
					option = 0;
				}
				else
				{
					responses[i][option] = responses[i][option] + 1;
				}
			}
			System.out.println();
		}
		scan.close();
		String centerAlignFormat = "\t| %-15s | %-2d | %-3d | %-3d | %-3d | %-3d | %-3d | %-3d | %-3d | %-3d | %-3d | %.2f       |%n";

		// now the complicated part
		int space1 = 0, space2 = 0, space3 = 0, space4 = 0, space5 = 0, space6 = 0, space7 = 0, space8 = 0, space9 = 0, space10 = 0, space11 = 0;
		
		int totals = 0;
		int tallied = 0;
		int max_val = 0;
		int max_index = 0;
		int min_val = 0;
		int min_index = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 1; j <= 10; j++)
			{
				totals = totals + (j * responses[i][j]);
				tallied = tallied + responses[i][j]; 
			}
			if (max_val < totals)
			{
				max_val = totals;
				max_index = i;
			}
			
			if (min_val > totals)
			{
				max_index = i;
				min_val = totals;
			}
			
			double divided = ((double) totals / tallied);
			space1 = (int)divided;
			
			if (space1 == 1)
				space2 = 1;
			else if (space1 == 2)
				space3 = 1;
			else if (space1 == 3)
				space4 = 1;
			else if (space1 == 4)
				space5 = 1;
			else if (space1 == 5)
				space6 = 1;
			else if (space1 == 6)
				space7 = 1;
			else if (space1 == 7)
				space8 = 1;
			else if (space1 == 8)
				space9 = 1;
			else if (space1 == 9)
				space10 = 1;
			else if (space1 == 10)
				space11 = 1;
		

			System.out.format(centerAlignFormat, topics[i] , space2 , space3 , space4 , space5 , space6 , space7 , space8 , space9 , space10 , space11, divided);
			   System.out.format("\t+------------+----------------------------------------------------------------------+%n");
		}
		
		
		
		
		// formatting to show max and min data
		
		System.out.println("\t\t MAXIMUM AND MINIMUM");
		   System.out.format("\t\t______________________%n");
		   
		   System.out.println("\tTopic with Most Points " + "Total Rating");
		   
		   System.out.println("\t" + topics[max_index] + " " + max_val);
		   
		   System.out.println("\tTopic with Least Points " + "Total Rating");
		   
		   System.out.println("\t" + topics[min_index] + " " + min_val);
	}
	
	
}
