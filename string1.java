public class string1 {
    public static void main(String[] args) {
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = "World!";
        String str = str1 + str2;
        System.err.println("Concatenated String:     " + str);
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
        }
        
       
        System.out.println("compareTo: " + str2.compareTo(str3));
        System.out.println("equals: " + str2.equals(str3));
        System.out.println("substring: " + str.substring(0, 5));
        System.out.println("toUpperCase: " + str.toUpperCase());
        
        
    }
}
