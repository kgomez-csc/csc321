//Katherine GOmez
/* Csc-321
 * Lab #4
*/
import java.util.Scanner;

public class kgomez4
{
	public static void main(String[] args)
	{
		 Scanner input = new Scanner(System.in);

		 System.out.println("Choose what you would like:");
		 System.out.println("1. Greet");
		 System.out.println("2. Joke");
		 System.out.println("3. Quote");
		 System.out.println("4. Exit");

		 System.out.print("Enter your choice (1-4): ");
		 int choice = input.nextInt();

		 switch(choice)
		 {
			 case 1:
				 System.out.println("Hello, how are you today?");
				 break;
			 case 2:
				 System.out.println("Why don't skeletons fight each other? They don't have the guts!");
				 break;
			case 3:
				 System.out.println("The only limit to our realization of tomorrow is our doubts of today.");
				 break;
			case 4:
				 System.out.println("Goodbye!");
				 break;
			default:
				 System.out.println("Invalid choice! Please choose between 1 and 4.");
		 }


		 input.close();
	}
}

