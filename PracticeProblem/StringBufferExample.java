class StringBufferExample {
    public static void main(String[] args) {

        // Creates a StringBuffer object with initial value "Hello"
        StringBuffer sb = new StringBuffer("Hello");

        // append() adds text at the end of the existing string
        sb.append(" World");
        System.out.println("append: " + sb);

        // insert() adds text at a specified index
        sb.insert(5, ",");
        System.out.println("insert: " + sb);

        // replace() replaces characters from start index to end index
        sb.replace(6, 11, "Java");
        System.out.println("replace: " + sb);
		// delete() removes characters from start index to end index
        sb.delete(5, 6);
        System.out.println("delete: " + sb);

        // reverse() reverses the entire string
        sb.reverse();
        System.out.println("reverse: " + sb);

        // length() returns the length of the StringBuffer
        System.out.println("length: " + sb.length());

        // charAt() returns character at a specific index
        System.out.println("charAt(2): " + sb.charAt(2));
		 // substring() extracts a portion of the string
        // (Note: substring() returns a String, not StringBuffer)
        String sub = sb.substring(2, 6);
        System.out.println("substring(2,6): " + sub);
    }
}
    

