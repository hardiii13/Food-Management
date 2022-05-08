package hardiii;
import java.util.Scanner;
public class project {
	public static void main(String[] args) {
		System.out.println("Hello welcome to the food app");
		System.out.println("Please create a password");
		Scanner scan = new Scanner(System.in);
		String pass1= scan.next();
		System.out.println("Your password is now:"+ pass1);
		
		
		System.out.println("Please enter your password:  ");
		String pass = scan.next();
		
		while(!pass.equals("pass1")) {
			System.out.println("This is not the right password please try again!!");
			pass = scan.next();
		}
		
		System.out.println("Access Granted");
		System.out.println("Are you hungry? yes or no: ");
		String ans1 = scan.next();
		
		
		if(ans1.equals("yes")) {
			System.out.println("Choose what you want to eat between pizza,Burger or Fish");
			String ans2 = scan.next();
			
			
			while(!ans2.equals("pizza")&& !ans2.equals("Burger")&& !ans2.equals("Fish")) {
				System.out.println("Sorry we do not have it what would you like between pizza,burger and fish");
			    ans2 = scan.next();
			}
			if(ans2.equals("pizza")||ans2.equals("Burger")||ans2.equals("Fish")) {
				
				System.out.println("Do you want something to Drink? Yes or NO");
				String ans3 = scan.next();
				while(!ans3.equals("yes")&&!ans3.equals("no")) {
					
					System.out.println("Wrong command please try again");
					ans3 = scan.next();
					
				}
				
				if(ans3.equals("Yes")) {
					System.out.println("What would you like to drink Coke or Juice");
					String ans4 = scan.next();
					
					while(!ans4.equals("coke")&&!ans4.equals("juice")) {
						
						System.out.println("Sorry we dont have it What would you like between coke and juice");
						ans4 = scan.next();
					
				}
					
					if(ans4.equals("Coke")||ans4.equals("Juice"));{
						System.out.println("Great you have ordered" + ans2 + " and " + ans4);
					}
					
					System.out.println("Please confirm your password");
					pass = scan.next();
					
					while(!pass.equals("pass1")) {
						System.out.println("This is not the right password please try again!!");
						pass = scan.next();
						}
					System.out.println("Thank you!! Your order is on its way");
					
			}
				else {
					System.out.println("You have ordered"+ ans2);
					
					System.out.println("Please confirm your password");
					pass = scan.next();
					
					while(!pass.equals("pass1")) {
						System.out.println("This is not the right password please try again!!");
						pass = scan.next();
						}
					}
		
		}
	
		else {
			System.out.println("Alright have a good day!!");
		}
		
	}
	}
}
