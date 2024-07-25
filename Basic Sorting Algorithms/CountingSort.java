public class CountingSort {
    public static void main(String[] args) {
        int arr[] = {2,4,1,5,3,4,2};
        countingSort(arr);
    }

    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }

        int freq[] = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]] ++;
        }

        for(int i=largest; i>=0; i--){
            while(freq[i] > 0){
                System.out.print(i + " ");
                freq[i]--;
            }
        }
    }
}
