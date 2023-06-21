import java.util.Scanner;
public class Main
{
public static void main(String[] args) {
char c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Character : "); 
        c = sc.next().charAt(0);
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
System.out.println("Alphabet");
else
System.out.println("Not an alphabet");
}
}
