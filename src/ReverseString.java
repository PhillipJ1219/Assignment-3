public class ReverseString {
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    public static void main(String[] arge) {
        String original = "Hello, World";
        String reversed = reverseString(original);
        System.out.println("Original Input: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
