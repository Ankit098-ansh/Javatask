package Javatask;
public class PangramChecker {
    public static boolean isPangram(String str) {
        // Create a boolean array of size 26 to represent the alphabet letters (a to z)
        boolean[] alphabet = new boolean[26];
        
        // Iterate through the characters of the input string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            // Check if the character is an uppercase or lowercase letter
            if (Character.isLetter(ch)) {
                // Convert the letter to lowercase and calculate its index in the alphabet
                int index = Character.toLowerCase(ch) - 'a';
                
                // Mark the corresponding letter as seen in the boolean array
                alphabet[index] = true;
            }
        }
        
        // Check if all letters in the alphabet have been seen at least once
        for (boolean letter : alphabet) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        
        return true; // All letters are present, it's a pangram
    }

    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog";
        
        if (isPangram(input)) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }
}

