public class Palindrome {
    public static void main(String[] args) {
        System.out.println(twoPointerSolution("madam"));
    }

    public static boolean twoPointerSolution(String input) {
        for (int i=0; i< (input.length()/2 + input.length()%2); i++) {
            char leftPointer = input.charAt(i);
            char rightPointer = input.charAt(input.length() -1 -i );
            if (leftPointer != rightPointer) {
                return false;
            }
        }
        return true;
    }
}