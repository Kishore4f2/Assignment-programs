public class Reversestring 
{
    public static void main(String[] args)
 {
        String str = "Kishore";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
        {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
 }
}
