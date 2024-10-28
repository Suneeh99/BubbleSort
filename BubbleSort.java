package labsheet01;
import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]){
        System.out.print("Ascending Sorted array : { ");

        for (int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
        System.out.print("Descending Sorted array : { ");

        for (int i = 0; i < arr.length - 1; i++){
            for(int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] < arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("}");
        
    }
    
    public static void main(String[] args) {
        int arr[] = new int[8];
        int len = arr.length;
        Scanner in = new Scanner(System.in);
        for(int i = 0; i < len; i++){
           System.out.print("Enter a value : ");
           arr[i] = in.nextInt();
        }
        bubbleSort(arr);
    }
}
