import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the length and breadth: ");
float length = sc.nextFloat();
float breadth = sc.nextFloat();
float area = length*breadth;
System.out.println(area);
}
}
