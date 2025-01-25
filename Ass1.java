public class Ass1 {
    
        public static void main(String[] args) {
            int arr[] = {101, 201, 301, 401, 501};
     
            for (int i = 0; i < arr.length; i++) {
           
                int rev = 0;
                while (arr[i] > 0) {
                    int last = arr[i] % 10;  
                    rev = rev * 10 + last;    
                    arr[i] = arr[i] / 10;     
                }
                arr[i] = rev;  
            }
    
           
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    
    }
    
}
