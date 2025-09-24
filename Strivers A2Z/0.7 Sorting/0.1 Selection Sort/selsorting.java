import java.util.Scanner;
import java.util.Arrays;

class Solution {

   public int[] sortArray(int[] nums) {
        // Validate constraints
        if (nums.length < 1 || nums.length > 5 * 10000) {
            throw new IllegalArgumentException("Array length must be between 1 and 50000");
        }
        
        for (int num : nums) {
            if (num < -5 * 10000 || num > 5 * 10000) {
                throw new IllegalArgumentException("Array elements must be between -50000 and 50000");
            }
        }
        
        mergeSort(nums, 0, nums.length - 1);
        return nums;
    }
    
    private void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            
            merge(arr, left, mid, right);
        }
    }
    
    private void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = left;
        
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
       int[] arr = new int[k];
       for(int i = 0;i<k;i++){
        arr[i] =sc.nextInt();
       } 

       Solution sorter = new Solution();
       int[] sortedArr = sorter.sortArray(arr);
       System.out.println(Arrays.toString(sortedArr));
    }
}