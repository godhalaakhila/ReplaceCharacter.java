 public class ReplaceCharacter {
    public static void main(String[] args) {
        // Define the string directly
        String input = "Hello, World!";
        
        // Define the character to be replaced and the new character
        char oldChar = 'o';
        char newChar = 'a';
        
        // Replace the character
        String updatedString = input.replace(oldChar, newChar);
        
        // Display the updated string
        System.out.println("Original string: " + input);
        System.out.println("Updated string: " + updatedString);
    }
}
 
    

