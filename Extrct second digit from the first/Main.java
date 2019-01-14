import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     
Scanner in = new Scanner(System.in);
   int n = in.nextInt(); 
      int num=n;
   int c =1,s;
   while(n>0)
   {
     s=n%10;
     c=c*10;
     n=n/10;
   }
      int c1=c/10;
      int x=num/c1;
      int c2=c1/10;
      num =num%c1;
     int y=num/c2;
    System.out.println(y);
	}
}