public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {2,4,5,3,1};
        selectionSort(arr);
    }

    public static void selectionSort(int arr[]){
        int n = arr.length;

        for(int i=0; i<n; i++){
            int maxIdx = i;

            for(int j=i; j<n; j++){
                if(arr[j] > arr[maxIdx]){
                    maxIdx = j;
                }
            }

            // now swap the numbers
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
        }

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

