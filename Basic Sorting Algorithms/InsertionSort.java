public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,1,4,3,5};
        insertionSort(arr);
    }

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1; i<n; i++){
            int temp = arr[i];
            int preIdx = i-1;

            while(preIdx >= 0 && arr[preIdx] < temp){
                arr[preIdx+1] = arr[preIdx];
                preIdx--;
            }
            arr[preIdx+1] = temp;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

