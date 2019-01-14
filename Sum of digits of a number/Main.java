import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     
Scanner in = new Scanner(System.in);
   int n = in.nextInt(); 
   int c =0,s;
   while(n!= 0)
   {
     s=n%10;
     c=c+s;
     n=n/10;
   }
    System.out.println(c);
	}
}