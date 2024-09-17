/*
 * Drew
 * 9/17
 * 3rd
 * convertion program
 */
import java.util.Scanner;
public class HelloWorld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean happening =true;
		int choice;
		while(happening)
		{
			System.out.println("Welcome!  You have the following options:\n1. Binary to Decimal\n2. Decimal to Binary");
			do{
			System.out.println("Which type of conversion would you like to perform? ");
			choice = scan.nextInt();
			}while(!(choice == 1 || choice ==2));
			if(choice ==1)
			{
				scan.nextLine();
				System.out.println("What is the binary number? ");
				String bi = scan.nextLine();
				System.out.println("The decimal equivalent is: "+biToDec(bi));
			}else if (choice ==2)
			{
				scan.nextLine();
				System.out.println("What is the decimal number? ");
				int num =scan.nextInt();
				System.out.println("The binary equivalent is: "+decToBi(num));
				scan.nextLine();
			}
			System.out.println("Do you want to continue - yes or no?");
			String ans = scan.nextLine();
			if(ans.indexOf("no") != -1)
			happening = false;
			
}//end while
scan.close();
}//end main
static String decToBi(int num){
int max = 0;
while(Math.pow(2,max) < num)
max++;

max--;
if(max<=0)
return "0";
char[] thing= new char[max];
for(int i =0;i<max;i++)
{
if(num-Math.pow(2,max-i)>0){
	thing[i] = '1';
num -= Math.pow(2,max-i);}
else
thing[i] ='0';
}//end if 
return new String(thing);
}//end method
static int biToDec(String bi){
int total =0;
for(int i = 1;i<bi.length()+1;i++)
{
total += Integer.parseInt(bi.substring(bi.length()-i,bi.length()-i+1))*Math.pow(2,i-1);
}//end for

return total; 
}//end method 


}//end class
