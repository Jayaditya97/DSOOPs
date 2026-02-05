package Sorting;

public class quick_sort {
    static void qs(int[] arr, int low, int high){
        if(low<high){
            int p = partition(arr,low,high);
            qs(arr,low,p-1);
            qs(arr,p+1,high);
        }
    }
    static int partition(int [] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;

        for(int j = low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args) {

    }
}