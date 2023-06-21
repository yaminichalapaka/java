import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.print("Enter the length and breadth: ");
float height = sc.nextFloat();
float base = sc.nextFloat();
float area = (height*base)/2;
System.out.println(area);
}
}
