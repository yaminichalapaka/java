import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the radius: ");
float radius = sc.nextFloat();
double area = 3.14 * radius * radius;
System.out.println(area);
}
}
