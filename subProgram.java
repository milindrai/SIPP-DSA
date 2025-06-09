 import java.util.Scanner;
 public class subProgram{
	public static void main(String[] args){
		int x,y,ans;
		Scanner sc=new Scanner(System.in); 
    	System.out.println("Type a number:");
    	x=sc.nextInt();

    	System.out.println("Type another number:");
    	y=sc.nextInt();

    	ans=x-y;
    	System.out.println("Sum is: " + ans);
	}
}

