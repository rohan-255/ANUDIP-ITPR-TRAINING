public class palindrome {
    public static void main(String[] args) {
        String str = "madam"; // Example string
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }

    public static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match
            }
            left++;
            right--;
        }
        return true; // All characters matched
    }
}
