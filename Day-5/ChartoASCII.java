import java.util.Scanner;

public class ChartoASCII 
{
    public static void main(String[] args)
 {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int ascii = (int) ch;
        System.out.println("ASCII Value of " + ch + " is: " + ascii);
 }
}