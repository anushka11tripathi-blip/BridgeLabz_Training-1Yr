public class ArrayExceptionExample {
    public static void main(String[] args) {
        try {
            int arr[] = {10, 20, 30};
            
            // Accessing invalid index
            System.out.println(arr[5]);  
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        } 
        finally {
            System.out.println("Program continues...");
        }
    }
}