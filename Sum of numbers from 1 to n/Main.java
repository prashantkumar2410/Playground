import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int i=0;
      for(int c=1;c<=n;c++)
      {
             i=i+c;
      }
      System.out.println(i);
	}
}