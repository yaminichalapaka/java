import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter the value for x and y: ");
int x = sc.nextInt();
int y = sc.nextInt();
if (x > 0 && y > 0)
        System.out.println("This point lies in the first quadrant.");
      else if (x < 0 && y > 0)
      System.out.println("This point lies in the second quadrant.");
      else if (x < 0 && y < 0)
      System.out.println("This point lies in the third quadrant.");
      else if (x > 0 && y < 0)
     System.out.println("This point lies in the fourth quadrant.");
     else if (x == 0 && y == 0)
     System.out.println("This point lies in the orgin.");
}
}
