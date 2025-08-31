public class Incdec 
{
    public static void main(String[] args)
 {
        int num = 5;

        System.out.println("Prefix Increment (++num): " + (++num)); // 6
        System.out.println("Postfix Increment (num++): " + (num++)); // 6 → becomes 7
        System.out.println("Prefix Decrement (--num): " + (--num)); // 6
        System.out.println("Postfix Decrement (num--): " + (num--)); // 6 → becomes 5
 }
}
