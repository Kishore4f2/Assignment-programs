public class Removespaces 
{
    public static void main(String[] args)
 {
        String str = "I want to learn Java Full Stack";
        String nospaces = str.replaceAll(" ", "");
        System.out.println("String without spaces: " + nospaces);
 }
}