public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello, ");
        
        
        /*for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            System.out.println("Character at index " + i + ": " + ch);
        }
        sb.setCharAt(0, 'h');
        System.out.println("set charAt: " + sb);
        System.out.println("append: " + sb.append("World!")); 
        System.out.println("insert: " + sb.insert(7, "Beautiful ")); 
        System.out.println("delete: " + sb.delete(0, 5)); */
        reverse(sb);

        
    }
    public static void reverse(StringBuilder sb) {
        int left = 0;
        int right = sb.length() - 1;
        while (left < right) {
            char temp = sb.charAt(left);
            sb.setCharAt(left, sb.charAt(right));
            sb.setCharAt(right, temp);
            left++;
            right--;
        }
        System.out.println("Reversed String: " + sb);
    }
}
