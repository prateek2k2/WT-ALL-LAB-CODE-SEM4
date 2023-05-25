public class q3 {
    public static void main(String[] args) {
        try {
            // Call a non-existent method to throw NoSuchMethodException
            nonExistentMethod();
        } catch (NoSuchMethodException e) {
            // Display the error message
            System.out.println("Error: " + e.getMessage());
        }
    }
}
