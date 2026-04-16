class RotateArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;

        int k = 2;          
        char dir = 'L';     

        k = k % n;

        if (dir == 'L' || dir == 'l') {
            
            for (int j = 0; j < k; j++) {
                int first = arr[0];
                for (int i = 0; i < n - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = first;
            }
        } 
        else if (dir == 'R' || dir == 'r') {
            
            for (int j = 0; j < k; j++) {
                int last = arr[n - 1];
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = last;
            }
        }

        
        System.out.print("Rotated Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}