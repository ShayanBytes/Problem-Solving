import java.util.Scanner;

class Solution {
    public boolean isPalindrome(String s) {
        // Clean the string: remove non-alphanumeric and convert to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return isPalindromeHelper(s, 0, s.length() - 1);
    }
    
    private boolean isPalindromeHelper(String s, int left, int right) {
        // Base case: if pointers meet or cross, it's a palindrome
        if (left >= right) {
            return true;
        }
        
        // If characters don't match, it's not a palindrome
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        
        // Recursively check the remaining substring
        return isPalindromeHelper(s, left + 1, right - 1);
    }
}

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text:");
        String input = sc.nextLine();
        
        Solution solution = new Solution();
        boolean result = solution.isPalindrome(input);
        
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        
        sc.close();
    }
}