public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,1};
        bubbleSort(arr);
    }

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
