import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Sort {
  
  // I am creating a sorted flag to keep track if the array is sorted
  private static boolean sorted;
  private static int depth;
  
  public static void insertionSort(int[] arr) {
    int length = arr.length;
    for (int i =1; i<length; i++){
      int a = arr[i];
      int j = i;
      
      while(j>0 && a>arr[j-1]){
        arr[j]=arr[j-1];
        j=j-1;
      }
      
      arr[j] = a;
    }
  }
  
  public static void bubbleSort(int[] arr){
    int length = arr.length;
    for(int i=0; i<length-1;i++){
      for(int j=0; j<length-i-1; j++){
        if (arr[j]<arr[j+1]){
          //swap
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
  
  public static void shellSort(int[] arr){
    int incr=1;
    while(2*incr<=arr.length){
      incr= 2*incr;
    }
    incr=incr-1;
    while(incr>=1){
      for (int i = incr; i<arr.length; i++){
        int a = arr[i];
        int j = 0;
        for(j=i; j>incr-1 && a > arr[j-incr]; j= j-incr){
          arr[j]=arr[j-incr];
        }
        arr[j] = a;
      }
      incr=incr/2;
    }
  }
  
  
  
  private static int partition(int[] arr, int first, int last){
    int pivot = arr[(first+last)/2];
    int i = first-1;
    int j = last+1;
    while(true) {
      i=i+1;
      if (arr[i]<=pivot){
        do{
        j=j-1;
        }
        while (arr[j]<pivot);
        if(i>=j){
            break;
          }
            //swap
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
      }
    }
    return j;
  }
  
  private static void quickSortHelper(int[] arr, int first, int last){
    if (first>=last){
      return;
    }
    int pi = partition(arr, first, last);
    quickSortHelper(arr, first, pi-1);
    quickSortHelper(arr, pi+1, last);
  }
  
  public static void quickSort(int[] arr){
    quickSortHelper(arr,0,arr.length-1);
  }
  
  
  private static void merge(int[] arr, int leftBeginning, int leftEnd, int rightBeginning, int rightEnd){
    int[] temp = new int[arr.length];
    int x = leftBeginning;
    int y = rightBeginning;
    int z = leftBeginning;
    
    while(x<=leftEnd){
      if(y>rightEnd) {
        break;
      }
      if(arr[x] >= arr[y]){
        temp[z]=arr[x];
        x++;
      }
      else{
        temp[z]=arr[y];
        y++;
      }
      z++;
    }
    
    while (x <= leftEnd) {
      temp[z] = arr[x];
      x++;
      z++;
    }
    
    while (y <= rightEnd) {
      temp[z] = arr[y];
      y++;
      z++;
    }
    
    for (int index = leftBeginning; index <= rightEnd; index++){
      arr[index]=temp[index];
    }
  }
  
  private static void mergeSortHelper(int[] arr, int left, int right){
    if (left >= right){
      return;
    }
    int middle = (left+right)/2;
    mergeSortHelper(arr, left,middle);
    mergeSortHelper(arr, middle+1, right);
    merge(arr,left,middle,middle+1,right);
  }
  
  public static void mergeSort(int[] arr){
    int[] temp = new int[arr.length];
    mergeSortHelper(arr,0,arr.length-1);
  }
    
    
  /*private void merge(int[] arr, int left, int middle, int right){
    int length1 = middle-left+1;
    int length2 = right - middle;
    
    int[] leftArray = new int[length1];
    int[] rightArray =  new int[length2];
    
    for(int i=0; i<length1; i++){
      leftArray[i]=arr[left+1];
    }
    
    for(int j=0; j<length2; j++){
      rightArray[j]=arr[middle+1+j];
    }
    
    int i =0;
    int j = 0;
    
    int a = left; 
    
    while(i<length1 && j<length2){
      if (leftArray[i] > rightArray[j]) {
        arr[a] = leftArray[i];
        i++;
      }
      else {
        arr[a]=rightArray[j];
        j++;
      }
      a++;
    }
    
    while (i<length1){
      arr[a] = leftArray[i];
      i++;
      a++;
    }
    
    while (j<length2){
      arr[a]=rightArray[j];
      j++;
      a++;
    }
  }
  
  private void mergeSortHelper(int[] arr, int left, int right){
    if (left<right) {
      return;
    }
      int middle = (left+right)/2;
      mergeSortHelper(arr, left, middle);
      mergeSortHelper(arr, middle+1, right);
      merge(arr, left, middle, right);
  }
    
  public void mergeSort(int[] arr){
    int[] temp = new int[arr.length];
    mergeSortHelper(temp,0,arr.length-1);
  }
  */

  private static void upgradedQuickSortHelper(int[] arr, int left, int right, int d, int k) {
    if(sorted){
      return;
    }
    if(left>=right){
      return;
    }
    if (depth >= d){
      mergeSort(arr);
      sorted = true;
      return;
    }
    if (right-left <= k){
      insertionSort(arr);
      sorted = true;
      return;
    }
    int x = partition(arr, right, left);
    depth++;
    upgradedQuickSortHelper(arr,left,x,d,k);
    upgradedQuickSortHelper(arr,x+1,right,d,k);
  }
  
  public static void upgradedQuickSort(int[] arr, int d, int k){
    sorted = false;
    upgradedQuickSortHelper(arr, 0, arr.length-1, d, k);
  }
                            
  
  public int[] generateRandomArray(int n){
    Random random = new Random();
    int[] array = new int[n];
    for (int i=0; i<array.length; i++){
      array[i] = random.nextInt();
    }
    return array;
  }
  
  public int[] reverse(int[] arr){
    int n = arr.length;
    int[] b = new int[n];
    int j = n;
    for (int i=0; i<n; i++){
      b[j-1] = arr[i];
      j=j-1;
    }
    return b;
  }
  
  
  public static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
  
  public static void readCommands(String filePath) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
    String line;
    while ((line= bufferedReader.readLine()) != null) {
      String[] commands = line.split(":");
      String sortType = commands[0];
      if(!sortType.equals("upgradedQuickSort") /**&& commands.length > 0**/) {
        String str = commands[1];
        str = str.substring(2,str.length()-1);
        String[] digits = str.split(",");
        int[] numbers = new int[digits.length];
        for(int i = 0; i < numbers.length; i++) {
          numbers[i] = Integer.parseInt(digits[i]);
        }
      
        System.out.println("Input Array: "+ Arrays.toString(numbers));
      
        if (sortType.equals("insertionSort")){
          insertionSort(numbers);
          System.out.println("insertionSort: " + Arrays.toString(numbers));
        }
        if (sortType.equals("bubbleSort")){
          bubbleSort(numbers);
          System.out.println("bubbleSort: " + Arrays.toString(numbers));
        }
        if (sortType.equals("shellSort")){
          shellSort(numbers);
          System.out.println("shellSort: " + Arrays.toString(numbers));
        }
        if (sortType.equals("mergeSort")){
          mergeSort(numbers);
          System.out.println("mergeSort: " + Arrays.toString(numbers));
        }
        if (sortType.equals("quickSort")){
          quickSort(numbers);
          System.out.println("quickSort: " + Arrays.toString(numbers));
        }
      }
      
      else if (sortType.equals("upgradedQuickSort")) {
        String[] input = commands[1].split("\\[");
        String string = input[1];
        string = string.substring(0,string.length()-1);
        String[] digs = string.split(",");
        int[] nums = new int[digs.length];
        for(int i = 0; i < nums.length; i++) {
          nums[i] = Integer.parseInt(digs[i]);
        }
        String[] newInput = input[0].split(",");
        String forDepth = newInput[0];
        forDepth = forDepth.substring(1,forDepth.length()-1);
        int depthh = Integer.parseInt(forDepth);
        String forK = newInput[1];
        forK = forK.substring(1,forK.length()-1);
        int kk = Integer.parseInt(forK);
        
        upgradedQuickSort(nums, depthh, kk);
        System.out.println("upgradedQuickSort: " + Arrays.toString(nums));
      }
    }
  }
    
    
      
  
  public static void main(String args[]) {
        int[] arr = { 12, 11, 13, 5, 6 };
        int[] arr2 = { 12, 11, 13, 5, 6 };
        int[] arr3 = { 12, 11, 13, 5, 6 };
        int[] arr4 = {12, 11, 13, 5, 6 };
        int[] arr5 = {12, 11, 13, 5, 6 };
        int[] arr6 = {12, 11, 13, 5, 6 };
        int[] arr7 = {12, 11, 13, 5, 6 };
 
        Sort a = new Sort();
        a.insertionSort(arr);
        a.bubbleSort(arr2);
        a.shellSort(arr3);
        a.quickSort(arr4);
        a.mergeSort(arr5);
        a.upgradedQuickSort(arr6,1,7);
        Arrays.sort(arr7);
 
        printArray(arr);
        printArray(arr2);
        printArray(arr3);
        printArray(arr4);
        printArray(arr5);
        printArray(arr6);
        printArray(arr7);
        
        Sort sort = new Sort();
        try{
          sort.readCommands("/Users/zeynepbastas/Downloads/commands.txt");
        } catch (Exception e){
          e.printStackTrace(); 
        }
  }
}
      
      