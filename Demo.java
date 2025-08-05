import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
  
  public static void main (String args[]){
    Sort a = new Sort();
    
    System.out.println("-----RANDOM ARRAYS-----");
    //sorting a random array of length 10
    int[] randomArray10 = a.generateRandomArray(10);
    long startTimeInsertion = System.nanoTime();
    a.insertionSort(randomArray10);
    long endTimeInsertion = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 10: " + (endTimeInsertion-startTimeInsertion));
    long startTimeBubble = System.nanoTime();
    a.bubbleSort(randomArray10);
    long endTimeBubble = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 10: " + (endTimeBubble-startTimeBubble));
    long startTimeShell = System.nanoTime();
    a.shellSort(randomArray10);
    long endTimeShell = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 10: " + (endTimeShell-startTimeShell));
    long startTimeQuick = System.nanoTime();
    a.quickSort(randomArray10);
    long endTimeQuick = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 10: " + (endTimeQuick-startTimeQuick));
    long startTimeMerge = System.nanoTime();
    a.mergeSort(randomArray10);
    long endTimeMerge = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 10: " + (endTimeMerge-startTimeMerge));
    long startTimeUpgradedQuick = System.nanoTime();
    a.upgradedQuickSort(randomArray10, 3, 3);
    long endTimeUpgradedQuick = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 10: " + (endTimeUpgradedQuick-startTimeUpgradedQuick));
    long startTimeBuilt = System.nanoTime();
    Arrays.sort(randomArray10);
    long endTimeBuilt = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 10 with Java's in built: " + (endTimeBuilt-startTimeBuilt));
    
    
    // sorting a random array of length 20
    int[] randomArray20 = a.generateRandomArray(20);
    long startTimeInsertion20 = System.nanoTime();
    a.insertionSort(randomArray20);
    long endTimeInsertion20 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 20: " + (endTimeInsertion20-startTimeInsertion20));
    long startTimeBubble20 = System.nanoTime();
    a.bubbleSort(randomArray20);
    long endTimeBubble20 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 20: " + (endTimeBubble20-startTimeBubble20));
    long startTimeShell20 = System.nanoTime();
    a.shellSort(randomArray20);
    long endTimeShell20 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 20: " + (endTimeShell20-startTimeShell20));
    long startTimeQuick20 = System.nanoTime();
    a.quickSort(randomArray20);
    long endTimeQuick20 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 20: " + (endTimeQuick20-startTimeQuick20));
    long startTimeMerge20 = System.nanoTime();
    a.mergeSort(randomArray20);
    long endTimeMerge20 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 20: " + (endTimeMerge20-startTimeMerge20));
    long startTimeUpgradedQuick20 = System.nanoTime();
    a.upgradedQuickSort(randomArray20, 3, 3);
    long endTimeUpgradedQuick20 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 20: " + (endTimeUpgradedQuick20-startTimeUpgradedQuick20));
    long startTimeBuilt20 = System.nanoTime();
    Arrays.sort(randomArray20);
    long endTimeBuilt20 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 20 with Java's in built: " + (endTimeBuilt20-startTimeBuilt20));
    
    //sorting a random array of length 50
    int[] randomArray50 = a.generateRandomArray(50);
    long startTimeInsertion50 = System.nanoTime();
    a.insertionSort(randomArray50);
    long endTimeInsertion50 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 50: " + (endTimeInsertion50-startTimeInsertion50));
    long startTimeBubble50 = System.nanoTime();
    a.bubbleSort(randomArray50);
    long endTimeBubble50 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 50: " + (endTimeBubble50-startTimeBubble50));
    long startTimeShell50 = System.nanoTime();
    a.shellSort(randomArray50);
    long endTimeShell50 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 50: " + (endTimeShell50-startTimeShell50));
    long startTimeQuick50 = System.nanoTime();
    a.quickSort(randomArray50);
    long endTimeQuick50 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 50: " + (endTimeQuick50-startTimeQuick50));
    long startTimeMerge50 = System.nanoTime();
    a.mergeSort(randomArray50);
    long endTimeMerge50 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 50: " + (endTimeMerge50-startTimeMerge50));
    long startTimeUpgradedQuick50 = System.nanoTime();
    a.upgradedQuickSort(randomArray50, 3, 3);
    long endTimeUpgradedQuick50 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 50: " + (endTimeUpgradedQuick50-startTimeUpgradedQuick50));
    long startTimeBuilt50 = System.nanoTime();
    Arrays.sort(randomArray50);
    long endTimeBuilt50 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 50 with Java's in built: " + (endTimeBuilt50-startTimeBuilt50));
    
    //sorting a random array of length 100
    int[] randomArray100 = a.generateRandomArray(100);
    long startTimeInsertion100 = System.nanoTime();
    a.insertionSort(randomArray100);
    long endTimeInsertion100 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 100: " + (endTimeInsertion100-startTimeInsertion100));
    long startTimeBubble100 = System.nanoTime();
    a.bubbleSort(randomArray100);
    long endTimeBubble100 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 100: " + (endTimeBubble100-startTimeBubble100));
    long startTimeShell100 = System.nanoTime();
    a.shellSort(randomArray100);
    long endTimeShell100 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 100: " + (endTimeShell100-startTimeShell100));
    long startTimeQuick100 = System.nanoTime();
    a.quickSort(randomArray100);
    long endTimeQuick100 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 100: " + (endTimeQuick100-startTimeQuick100));
    long startTimeMerge100 = System.nanoTime();
    a.mergeSort(randomArray100);
    long endTimeMerge100 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 100: " + (endTimeMerge100-startTimeMerge100));
    long startTimeUpgradedQuick100 = System.nanoTime();
    a.upgradedQuickSort(randomArray100, 3, 3);
    long endTimeUpgradedQuick100 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 100: " + (endTimeUpgradedQuick100-startTimeUpgradedQuick100));
    long startTimeBuilt100 = System.nanoTime();
    Arrays.sort(randomArray100);
    long endTimeBuilt100 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 100 with Java's in built: " + (endTimeBuilt100-startTimeBuilt100));
    
    
    //sorting a random array of length 200
    int[] randomArray200 = a.generateRandomArray(200);
    long startTimeInsertion200 = System.nanoTime();
    a.insertionSort(randomArray200);
    long endTimeInsertion200 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 200: " + (endTimeInsertion200-startTimeInsertion200));
    long startTimeBubble200 = System.nanoTime();
    a.bubbleSort(randomArray200);
    long endTimeBubble200 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 200: " + (endTimeBubble200-startTimeBubble200));
    long startTimeShell200 = System.nanoTime();
    a.shellSort(randomArray200);
    long endTimeShell200 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 200: " + (endTimeShell200-startTimeShell200));
    long startTimeQuick200 = System.nanoTime();
    a.quickSort(randomArray200);
    long endTimeQuick200 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 200: " + (endTimeQuick200-startTimeQuick200));
    long startTimeMerge200 = System.nanoTime();
    a.mergeSort(randomArray200);
    long endTimeMerge200 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 200: " + (endTimeMerge200-startTimeMerge200));
    long startTimeUpgradedQuick200 = System.nanoTime();
    a.upgradedQuickSort(randomArray200, 3, 3);
    long endTimeUpgradedQuick200 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 200: " + (endTimeUpgradedQuick200-startTimeUpgradedQuick200));
    long startTimeBuilt200 = System.nanoTime();
    Arrays.sort(randomArray200);
    long endTimeBuilt200 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 200 with Java's in built: " + (endTimeBuilt200-startTimeBuilt200));
    
    
    //sorting a random array of length 500
    int[] randomArray500 = a.generateRandomArray(500);
    long startTimeInsertion500 = System.nanoTime();
    a.insertionSort(randomArray500);
    long endTimeInsertion500 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 500: " + (endTimeInsertion500-startTimeInsertion500));
    long startTimeBubble500 = System.nanoTime();
    a.bubbleSort(randomArray500);
    long endTimeBubble500 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 500: " + (endTimeBubble500-startTimeBubble500));
    long startTimeShell500 = System.nanoTime();
    a.shellSort(randomArray500);
    long endTimeShell500 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 500: " + (endTimeShell500-startTimeShell500));
    long startTimeQuick500 = System.nanoTime();
    a.quickSort(randomArray500);
    long endTimeQuick500 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 500: " + (endTimeQuick500-startTimeQuick500));
    long startTimeMerge500 = System.nanoTime();
    a.mergeSort(randomArray500);
    long endTimeMerge500 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 500: " + (endTimeMerge500-startTimeMerge500));
    long startTimeUpgradedQuick500 = System.nanoTime();
    a.upgradedQuickSort(randomArray500, 3, 3);
    long endTimeUpgradedQuick500 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 500: " + (endTimeUpgradedQuick500-startTimeUpgradedQuick500));
    long startTimeBuilt500 = System.nanoTime();
    Arrays.sort(randomArray500);
    long endTimeBuilt500 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 500 with Java's in built: " + (endTimeBuilt500-startTimeBuilt500));
    
    //sorting a random array of length 1000
    int[] randomArray1000 = a.generateRandomArray(1000);
    long startTimeInsertion1000 = System.nanoTime();
    a.insertionSort(randomArray1000);
    long endTimeInsertion1000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 1000: " + (endTimeInsertion1000-startTimeInsertion1000));
    long startTimeBubble1000 = System.nanoTime();
    a.bubbleSort(randomArray1000);
    long endTimeBubble1000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 1000: " + (endTimeBubble1000-startTimeBubble1000));
    long startTimeShell1000 = System.nanoTime();
    a.shellSort(randomArray1000);
    long endTimeShell1000 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 1000: " + (endTimeShell1000-startTimeShell1000));
    long startTimeQuick1000 = System.nanoTime();
    a.quickSort(randomArray1000);
    long endTimeQuick1000 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 1000: " + (endTimeQuick1000-startTimeQuick1000));
    long startTimeMerge1000 = System.nanoTime();
    a.mergeSort(randomArray1000);
    long endTimeMerge1000 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 1000: " + (endTimeMerge1000-startTimeMerge1000));
    long startTimeUpgradedQuick1000 = System.nanoTime();
    a.upgradedQuickSort(randomArray1000, 3, 3);
    long endTimeUpgradedQuick1000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 1000: " + (endTimeUpgradedQuick1000-startTimeUpgradedQuick1000));
    long startTimeBuilt1000 = System.nanoTime();
    Arrays.sort(randomArray1000);
    long endTimeBuilt1000 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 1000 with Java's in built: " + (endTimeBuilt1000-startTimeBuilt1000));
    
    
    
    //sorting a random array of length 2000
    int[] randomArray2000 = a.generateRandomArray(2000);
    long startTimeInsertion2000 = System.nanoTime();
    a.insertionSort(randomArray2000);
    long endTimeInsertion2000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 2000: " + (endTimeInsertion2000-startTimeInsertion2000));
    long startTimeBubble2000 = System.nanoTime();
    a.bubbleSort(randomArray2000);
    long endTimeBubble2000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 2000: " + (endTimeBubble2000-startTimeBubble2000));
    long startTimeShell2000 = System.nanoTime();
    a.shellSort(randomArray2000);
    long endTimeShell2000 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 2000: " + (endTimeShell2000-startTimeShell2000));
    long startTimeQuick2000 = System.nanoTime();
    a.quickSort(randomArray2000);
    long endTimeQuick2000 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 2000: " + (endTimeQuick2000-startTimeQuick2000));
    long startTimeMerge2000 = System.nanoTime();
    a.mergeSort(randomArray2000);
    long endTimeMerge2000 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 2000: " + (endTimeMerge2000-startTimeMerge2000));
    long startTimeUpgradedQuick2000 = System.nanoTime();
    a.upgradedQuickSort(randomArray2000, 3, 3);
    long endTimeUpgradedQuick2000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 2000: " + (endTimeUpgradedQuick2000-startTimeUpgradedQuick2000));
    long startTimeBuilt2000 = System.nanoTime();
    Arrays.sort(randomArray2000);
    long endTimeBuilt2000 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 2000 with Java's in built: " + (endTimeBuilt2000-startTimeBuilt2000));
    
    
    //sorting a random array of length 5000
    int[] randomArray5000 = a.generateRandomArray(5000);
    long startTimeInsertion5000 = System.nanoTime();
    a.insertionSort(randomArray5000);
    long endTimeInsertion5000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a random array of length 5000: " + (endTimeInsertion5000-startTimeInsertion5000));
    long startTimeBubble5000 = System.nanoTime();
    a.bubbleSort(randomArray5000);
    long endTimeBubble5000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a random array of length 5000: " + (endTimeBubble5000-startTimeBubble5000));
    long startTimeShell5000 = System.nanoTime();
    a.shellSort(randomArray5000);
    long endTimeShell5000 = System.nanoTime();
    System.out.println("Time taken to shell sort a random array of length 5000: " + (endTimeShell5000-startTimeShell5000));
    long startTimeQuick5000 = System.nanoTime();
    a.quickSort(randomArray5000);
    long endTimeQuick5000 = System.nanoTime();
    System.out.println("Time taken to quick sort a random array of length 5000: " + (endTimeQuick5000-startTimeQuick5000));
    long startTimeMerge5000 = System.nanoTime();
    a.mergeSort(randomArray5000);
    long endTimeMerge5000 = System.nanoTime();
    System.out.println("Time taken to merge sort a random array of length 5000: " + (endTimeMerge5000-startTimeMerge5000));
    long startTimeUpgradedQuick5000 = System.nanoTime();
    a.upgradedQuickSort(randomArray5000, 3, 3);
    long endTimeUpgradedQuick5000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a random array of length 5000: " + (endTimeUpgradedQuick5000-startTimeUpgradedQuick5000));
    long startTimeBuilt5000 = System.nanoTime();
    Arrays.sort(randomArray5000);
    long endTimeBuilt5000 = System.nanoTime();
    System.out.println("Time taken to sort a random array of length 5000 with Java's in built: " + (endTimeBuilt5000-startTimeBuilt5000));
    
    
    System.out.println("   ");
    System.out.println("-----SORTED ARRAYS-----");
    
    //SORTED
    //sorting a sorted array of length 10
    Arrays.sort(randomArray10); //now becomes a sorted array
    int[] sortedArray10 = randomArray10;
    long startTimeInsertionSorted = System.nanoTime();
    a.insertionSort(sortedArray10);
    long endTimeInsertionSorted = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 10: " + (endTimeInsertionSorted-startTimeInsertionSorted));
    long startTimeBubbleSorted = System.nanoTime();
    a.bubbleSort(sortedArray10);
    long endTimeBubbleSorted = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 10: " + (endTimeBubbleSorted-startTimeBubbleSorted));
    long startTimeShellSorted = System.nanoTime();
    a.shellSort(sortedArray10);
    long endTimeShellSorted = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 10: " + (endTimeShellSorted-startTimeShellSorted));
    long startTimeQuickSorted = System.nanoTime();
    a.quickSort(sortedArray10);
    long endTimeQuickSorted = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 10: " + (endTimeQuickSorted-startTimeQuickSorted));
    long startTimeMergeSorted = System.nanoTime();
    a.mergeSort(sortedArray10);
    long endTimeMergeSorted = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 10: " + (endTimeMergeSorted-startTimeMergeSorted));
    long startTimeUpgradedQuickSorted = System.nanoTime();
    a.upgradedQuickSort(sortedArray10, 3, 3);
    long endTimeUpgradedQuickSorted = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 10: " + (endTimeUpgradedQuickSorted-startTimeUpgradedQuickSorted));
    long startTimeBuiltSorted = System.nanoTime();
    Arrays.sort(sortedArray10);
    long endTimeBuiltSorted = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 10 with Java's in built: " + (endTimeBuiltSorted-startTimeBuiltSorted));
    
    //sorting a sorted array of length 20
    Arrays.sort(randomArray20); //now becomes a sorted array
    int[] sortedArray20 = randomArray20;
    long startTimeInsertionSorted20 = System.nanoTime();
    a.insertionSort(sortedArray20);
    long endTimeInsertionSorted20 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 20: " + (endTimeInsertionSorted20-startTimeInsertionSorted20));
    long startTimeBubbleSorted20 = System.nanoTime();
    a.bubbleSort(sortedArray20);
    long endTimeBubbleSorted20 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 20: " + (endTimeBubbleSorted20-startTimeBubbleSorted20));
    long startTimeShellSorted20 = System.nanoTime();
    a.shellSort(sortedArray20);
    long endTimeShellSorted20 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 20: " + (endTimeShellSorted20-startTimeShellSorted20));
    long startTimeQuickSorted20 = System.nanoTime();
    a.quickSort(sortedArray20);
    long endTimeQuickSorted20 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 20: " + (endTimeQuickSorted20-startTimeQuickSorted20));
    long startTimeMergeSorted20 = System.nanoTime();
    a.mergeSort(sortedArray20);
    long endTimeMergeSorted20 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 20: " + (endTimeMergeSorted20-startTimeMergeSorted20));
    long startTimeUpgradedQuickSorted20 = System.nanoTime();
    a.upgradedQuickSort(sortedArray20, 3, 3);
    long endTimeUpgradedQuickSorted20 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 20: " + (endTimeUpgradedQuickSorted20-startTimeUpgradedQuickSorted20));
    long startTimeBuiltSorted20 = System.nanoTime();
    Arrays.sort(sortedArray20);
    long endTimeBuiltSorted20 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 20 with Java's in built: " + (endTimeBuiltSorted20-startTimeBuiltSorted20));
    
    //sorting a sorted array of length 50
    Arrays.sort(randomArray50); //now becomes a sorted array
    int[] sortedArray50 = randomArray50;
    long startTimeInsertionSorted50 = System.nanoTime();
    a.insertionSort(sortedArray50);
    long endTimeInsertionSorted50 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 50: " + (endTimeInsertionSorted50-startTimeInsertionSorted50));
    long startTimeBubbleSorted50 = System.nanoTime();
    a.bubbleSort(sortedArray50);
    long endTimeBubbleSorted50 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 50: " + (endTimeBubbleSorted50-startTimeBubbleSorted50));
    long startTimeShellSorted50 = System.nanoTime();
    a.shellSort(sortedArray50);
    long endTimeShellSorted50 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 50: " + (endTimeShellSorted50-startTimeShellSorted50));
    long startTimeQuickSorted50 = System.nanoTime();
    a.quickSort(sortedArray50);
    long endTimeQuickSorted50 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 50: " + (endTimeQuickSorted50-startTimeQuickSorted50));
    long startTimeMergeSorted50 = System.nanoTime();
    a.mergeSort(sortedArray50);
    long endTimeMergeSorted50 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 50: " + (endTimeMergeSorted50-startTimeMergeSorted50));
    long startTimeUpgradedQuickSorted50 = System.nanoTime();
    a.upgradedQuickSort(sortedArray50, 3, 3);
    long endTimeUpgradedQuickSorted50 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 50: " + (endTimeUpgradedQuickSorted50-startTimeUpgradedQuickSorted50));
    long startTimeBuiltSorted50 = System.nanoTime();
    Arrays.sort(sortedArray50);
    long endTimeBuiltSorted50 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 50 with Java's in built: " + (endTimeBuiltSorted50-startTimeBuiltSorted50));
    
    
    //sorting a sorted array of length 100
    Arrays.sort(randomArray100); //now becomes a sorted array
    int[] sortedArray100 = randomArray100;
    long startTimeInsertionSorted100 = System.nanoTime();
    a.insertionSort(sortedArray100);
    long endTimeInsertionSorted100 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 100: " + (endTimeInsertionSorted100-startTimeInsertionSorted100));
    long startTimeBubbleSorted100 = System.nanoTime();
    a.bubbleSort(sortedArray100);
    long endTimeBubbleSorted100 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 100: " + (endTimeBubbleSorted100-startTimeBubbleSorted100));
    long startTimeShellSorted100 = System.nanoTime();
    a.shellSort(sortedArray100);
    long endTimeShellSorted100 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 100: " + (endTimeShellSorted100-startTimeShellSorted100));
    long startTimeQuickSorted100 = System.nanoTime();
    a.quickSort(sortedArray100);
    long endTimeQuickSorted100 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 100: " + (endTimeQuickSorted100-startTimeQuickSorted100));
    long startTimeMergeSorted100 = System.nanoTime();
    a.mergeSort(sortedArray100);
    long endTimeMergeSorted100 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 100: " + (endTimeMergeSorted100-startTimeMergeSorted100));
    long startTimeUpgradedQuickSorted100 = System.nanoTime();
    a.upgradedQuickSort(sortedArray100, 3, 3);
    long endTimeUpgradedQuickSorted100 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 100: " + (endTimeUpgradedQuickSorted100-startTimeUpgradedQuickSorted100));
    long startTimeBuiltSorted100 = System.nanoTime();
    Arrays.sort(sortedArray100);
    long endTimeBuiltSorted100 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 100 with Java's in built: " + (endTimeBuiltSorted100-startTimeBuiltSorted100));
    
    //sorting a sorted array of length 200
    Arrays.sort(randomArray200); //now becomes a sorted array
    int[] sortedArray200 = randomArray200;
    long startTimeInsertionSorted200 = System.nanoTime();
    a.insertionSort(sortedArray200);
    long endTimeInsertionSorted200 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 200: " + (endTimeInsertionSorted200-startTimeInsertionSorted200));
    long startTimeBubbleSorted200 = System.nanoTime();
    a.bubbleSort(sortedArray200);
    long endTimeBubbleSorted200 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 200: " + (endTimeBubbleSorted200-startTimeBubbleSorted200));
    long startTimeShellSorted200 = System.nanoTime();
    a.shellSort(sortedArray200);
    long endTimeShellSorted200 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 200: " + (endTimeShellSorted200-startTimeShellSorted200));
    long startTimeQuickSorted200 = System.nanoTime();
    a.quickSort(sortedArray200);
    long endTimeQuickSorted200 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 200: " + (endTimeQuickSorted200-startTimeQuickSorted200));
    long startTimeMergeSorted200 = System.nanoTime();
    a.mergeSort(sortedArray200);
    long endTimeMergeSorted200 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 200: " + (endTimeMergeSorted200-startTimeMergeSorted200));
    long startTimeUpgradedQuickSorted200 = System.nanoTime();
    a.upgradedQuickSort(sortedArray200, 3, 3);
    long endTimeUpgradedQuickSorted200 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 200: " + (endTimeUpgradedQuickSorted200-startTimeUpgradedQuickSorted200));
    long startTimeBuiltSorted200 = System.nanoTime();
    Arrays.sort(sortedArray200);
    long endTimeBuiltSorted200 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 200 with Java's in built: " + (endTimeBuiltSorted200-startTimeBuiltSorted200));
    
    
    //sorting a sorted array of length 500
    Arrays.sort(randomArray500); //now becomes a sorted array
    int[] sortedArray500 = randomArray500;
    long startTimeInsertionSorted500 = System.nanoTime();
    a.insertionSort(sortedArray500);
    long endTimeInsertionSorted500 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 500: " + (endTimeInsertionSorted500-startTimeInsertionSorted500));
    long startTimeBubbleSorted500 = System.nanoTime();
    a.bubbleSort(sortedArray500);
    long endTimeBubbleSorted500 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 500: " + (endTimeBubbleSorted500-startTimeBubbleSorted500));
    long startTimeShellSorted500 = System.nanoTime();
    a.shellSort(sortedArray500);
    long endTimeShellSorted500 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 500: " + (endTimeShellSorted500-startTimeShellSorted500));
    long startTimeQuickSorted500 = System.nanoTime();
    a.quickSort(sortedArray500);
    long endTimeQuickSorted500 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 500: " + (endTimeQuickSorted500-startTimeQuickSorted500));
    long startTimeMergeSorted500 = System.nanoTime();
    a.mergeSort(sortedArray500);
    long endTimeMergeSorted500 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 500: " + (endTimeMergeSorted500-startTimeMergeSorted500));
    long startTimeUpgradedQuickSorted500 = System.nanoTime();
    a.upgradedQuickSort(sortedArray500, 3, 3);
    long endTimeUpgradedQuickSorted500 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 500: " + (endTimeUpgradedQuickSorted500-startTimeUpgradedQuickSorted500));
    long startTimeBuiltSorted500 = System.nanoTime();
    Arrays.sort(sortedArray500);
    long endTimeBuiltSorted500 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 500 with Java's in built: " + (endTimeBuiltSorted500-startTimeBuiltSorted500));
    
    
    
    //sorting a sorted array of length 1000
    Arrays.sort(randomArray1000); //now becomes a sorted array
    int[] sortedArray1000 = randomArray1000;
    long startTimeInsertionSorted1000 = System.nanoTime();
    a.insertionSort(sortedArray1000);
    long endTimeInsertionSorted1000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 1000: " + (endTimeInsertionSorted1000-startTimeInsertionSorted1000));
    long startTimeBubbleSorted1000 = System.nanoTime();
    a.bubbleSort(sortedArray1000);
    long endTimeBubbleSorted1000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 1000: " + (endTimeBubbleSorted1000-startTimeBubbleSorted1000));
    long startTimeShellSorted1000 = System.nanoTime();
    a.shellSort(sortedArray1000);
    long endTimeShellSorted1000 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 1000: " + (endTimeShellSorted1000-startTimeShellSorted1000));
    long startTimeQuickSorted1000 = System.nanoTime();
    a.quickSort(sortedArray1000);
    long endTimeQuickSorted1000 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 1000: " + (endTimeQuickSorted1000-startTimeQuickSorted1000));
    long startTimeMergeSorted1000 = System.nanoTime();
    a.mergeSort(sortedArray1000);
    long endTimeMergeSorted1000 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 1000: " + (endTimeMergeSorted1000-startTimeMergeSorted1000));
    long startTimeUpgradedQuickSorted1000 = System.nanoTime();
    a.upgradedQuickSort(sortedArray1000, 3, 3);
    long endTimeUpgradedQuickSorted1000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 1000: " + (endTimeUpgradedQuickSorted1000-startTimeUpgradedQuickSorted1000));
    long startTimeBuiltSorted1000 = System.nanoTime();
    Arrays.sort(sortedArray1000);
    long endTimeBuiltSorted1000 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 1000 with Java's in built: " + (endTimeBuiltSorted1000-startTimeBuiltSorted1000));
    
    
    //sorting a sorted array of length 2000
    Arrays.sort(randomArray2000); //now becomes a sorted array
    int[] sortedArray2000 = randomArray2000;
    long startTimeInsertionSorted2000 = System.nanoTime();
    a.insertionSort(sortedArray2000);
    long endTimeInsertionSorted2000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 2000: " + (endTimeInsertionSorted2000-startTimeInsertionSorted2000));
    long startTimeBubbleSorted2000 = System.nanoTime();
    a.bubbleSort(sortedArray2000);
    long endTimeBubbleSorted2000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 2000: " + (endTimeBubbleSorted2000-startTimeBubbleSorted2000));
    long startTimeShellSorted2000 = System.nanoTime();
    a.shellSort(sortedArray2000);
    long endTimeShellSorted2000 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 2000: " + (endTimeShellSorted2000-startTimeShellSorted2000));
    long startTimeQuickSorted2000 = System.nanoTime();
    a.quickSort(sortedArray2000);
    long endTimeQuickSorted2000 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 2000: " + (endTimeQuickSorted2000-startTimeQuickSorted2000));
    long startTimeMergeSorted2000 = System.nanoTime();
    a.mergeSort(sortedArray2000);
    long endTimeMergeSorted2000 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 2000: " + (endTimeMergeSorted2000-startTimeMergeSorted2000));
    long startTimeUpgradedQuickSorted2000 = System.nanoTime();
    a.upgradedQuickSort(sortedArray2000, 3, 3);
    long endTimeUpgradedQuickSorted2000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 2000: " + (endTimeUpgradedQuickSorted2000-startTimeUpgradedQuickSorted2000));
    long startTimeBuiltSorted2000 = System.nanoTime();
    Arrays.sort(sortedArray2000);
    long endTimeBuiltSorted2000 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 2000 with Java's in built: " + (endTimeBuiltSorted2000-startTimeBuiltSorted2000));
    
    
    //sorting a sorted array of length 5000
    Arrays.sort(randomArray5000); //now becomes a sorted array
    int[] sortedArray5000 = randomArray5000;
    long startTimeInsertionSorted5000 = System.nanoTime();
    a.insertionSort(sortedArray5000);
    long endTimeInsertionSorted5000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a sorted array of length 5000: " + (endTimeInsertionSorted5000-startTimeInsertionSorted5000));
    long startTimeBubbleSorted5000 = System.nanoTime();
    a.bubbleSort(sortedArray5000);
    long endTimeBubbleSorted5000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a sorted array of length 5000: " + (endTimeBubbleSorted5000-startTimeBubbleSorted5000));
    long startTimeShellSorted5000 = System.nanoTime();
    a.shellSort(sortedArray5000);
    long endTimeShellSorted5000 = System.nanoTime();
    System.out.println("Time taken to shell sort a sorted array of length 5000: " + (endTimeShellSorted5000-startTimeShellSorted5000));
    long startTimeQuickSorted5000 = System.nanoTime();
    a.quickSort(sortedArray5000);
    long endTimeQuickSorted5000 = System.nanoTime();
    System.out.println("Time taken to quick sort a sorted array of length 5000: " + (endTimeQuickSorted5000-startTimeQuickSorted5000));
    long startTimeMergeSorted5000 = System.nanoTime();
    a.mergeSort(sortedArray5000);
    long endTimeMergeSorted5000 = System.nanoTime();
    System.out.println("Time taken to merge sort a sorted array of length 5000: " + (endTimeMergeSorted5000-startTimeMergeSorted5000));
    long startTimeUpgradedQuickSorted5000 = System.nanoTime();
    a.upgradedQuickSort(sortedArray5000, 3, 3);
    long endTimeUpgradedQuickSorted5000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a sorted array of length 5000: " + (endTimeUpgradedQuickSorted5000-startTimeUpgradedQuickSorted5000));
    long startTimeBuiltSorted5000 = System.nanoTime();
    Arrays.sort(sortedArray5000);
    long endTimeBuiltSorted5000 = System.nanoTime();
    System.out.println("Time taken to sort a sorted array of length 5000 with Java's in built: " + (endTimeBuiltSorted5000-startTimeBuiltSorted5000));
    
    System.out.println("   ");
    System.out.println("-----REVERSE SORTED ARRAYS-----");
    
    //REVERSE SORTED
    
    //sorting a reverse sorted array of length 10
    Arrays.sort(randomArray10); //now becomes a sorted array
    int[] reversedArray10 = a.reverse(randomArray10);
    long startTimeInsertionReversed = System.nanoTime();
    a.insertionSort(reversedArray10);
    long endTimeInsertionReversed = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 10: " + (endTimeInsertionReversed-startTimeInsertionReversed));
    long startTimeBubbleReversed = System.nanoTime();
    a.bubbleSort(reversedArray10);
    long endTimeBubbleReversed = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 10: " + (endTimeBubbleReversed-startTimeBubbleReversed));
    long startTimeShellReversed = System.nanoTime();
    a.shellSort(reversedArray10);
    long endTimeShellReversed = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 10: " + (endTimeShellReversed-startTimeShellReversed));
    long startTimeQuickReversed = System.nanoTime();
    a.quickSort(reversedArray10);
    long endTimeQuickReversed = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 10: " + (endTimeQuickReversed-startTimeQuickReversed));
    long startTimeMergeReversed = System.nanoTime();
    a.mergeSort(reversedArray10);
    long endTimeMergeReversed = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 10: " + (endTimeMergeReversed-startTimeMergeReversed));
    long startTimeUpgradedQuickReversed = System.nanoTime();
    a.upgradedQuickSort(reversedArray10, 3, 3);
    long endTimeUpgradedQuickReversed = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 10: " + (endTimeUpgradedQuickReversed-startTimeUpgradedQuickReversed));
    long startTimeBuiltReversed = System.nanoTime();
    Arrays.sort(reversedArray10);
    long endTimeBuiltReversed = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 10 with Java's in built: " + (endTimeBuiltReversed-startTimeBuiltReversed));
    
    
     //sorting a reverse sorted array of length 20
    Arrays.sort(randomArray20); //now becomes a sorted array
    int[] reversedArray20 = a.reverse(randomArray20);
    long startTimeInsertionReversed20 = System.nanoTime();
    a.insertionSort(reversedArray20);
    long endTimeInsertionReversed20 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 20: " + (endTimeInsertionReversed20-startTimeInsertionReversed20));
    long startTimeBubbleReversed20 = System.nanoTime();
    a.bubbleSort(reversedArray20);
    long endTimeBubbleReversed20 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 20: " + (endTimeBubbleReversed20-startTimeBubbleReversed20));
    long startTimeShellReversed20 = System.nanoTime();
    a.shellSort(reversedArray20);
    long endTimeShellReversed20 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 20: " + (endTimeShellReversed20-startTimeShellReversed20));
    long startTimeQuickReversed20 = System.nanoTime();
    a.quickSort(reversedArray20);
    long endTimeQuickReversed20 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 20: " + (endTimeQuickReversed20-startTimeQuickReversed20));
    long startTimeMergeReversed20 = System.nanoTime();
    a.mergeSort(reversedArray20);
    long endTimeMergeReversed20 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 20: " + (endTimeMergeReversed20-startTimeMergeReversed20));
    long startTimeUpgradedQuickReversed20 = System.nanoTime();
    a.upgradedQuickSort(reversedArray20, 3, 3);
    long endTimeUpgradedQuickReversed20 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 20: " + (endTimeUpgradedQuickReversed20-startTimeUpgradedQuickReversed20));
    long startTimeBuiltReversed20 = System.nanoTime();
    Arrays.sort(reversedArray20);
    long endTimeBuiltReversed20 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 20 with Java's in built: " + (endTimeBuiltReversed20-startTimeBuiltReversed20));
    
    
    //sorting a reverse sorted array of length 50
    Arrays.sort(randomArray50); //now becomes a sorted array
    int[] reversedArray50 = a.reverse(randomArray50);
    long startTimeInsertionReversed50 = System.nanoTime();
    a.insertionSort(reversedArray50);
    long endTimeInsertionReversed50 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 50: " + (endTimeInsertionReversed50-startTimeInsertionReversed50));
    long startTimeBubbleReversed50 = System.nanoTime();
    a.bubbleSort(reversedArray50);
    long endTimeBubbleReversed50 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 50: " + (endTimeBubbleReversed50-startTimeBubbleReversed50));
    long startTimeShellReversed50 = System.nanoTime();
    a.shellSort(reversedArray50);
    long endTimeShellReversed50 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 50: " + (endTimeShellReversed50-startTimeShellReversed50));
    long startTimeQuickReversed50 = System.nanoTime();
    a.quickSort(reversedArray50);
    long endTimeQuickReversed50 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 50: " + (endTimeQuickReversed50-startTimeQuickReversed50));
    long startTimeMergeReversed50 = System.nanoTime();
    a.mergeSort(reversedArray50);
    long endTimeMergeReversed50 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 50: " + (endTimeMergeReversed50-startTimeMergeReversed50));
    long startTimeUpgradedQuickReversed50 = System.nanoTime();
    a.upgradedQuickSort(reversedArray50, 3, 3);
    long endTimeUpgradedQuickReversed50 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 50: " + (endTimeUpgradedQuickReversed50-startTimeUpgradedQuickReversed50));
    long startTimeBuiltReversed50 = System.nanoTime();
    Arrays.sort(reversedArray50);
    long endTimeBuiltReversed50 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 50 with Java's in built: " + (endTimeBuiltReversed50-startTimeBuiltReversed50));
    
    
    
    
    //sorting a reverse sorted array of length 100
    Arrays.sort(randomArray100); //now becomes a sorted array
    int[] reversedArray100 = a.reverse(randomArray100);
    long startTimeInsertionReversed100 = System.nanoTime();
    a.insertionSort(reversedArray100);
    long endTimeInsertionReversed100 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 100: " + (endTimeInsertionReversed100-startTimeInsertionReversed100));
    long startTimeBubbleReversed100 = System.nanoTime();
    a.bubbleSort(reversedArray100);
    long endTimeBubbleReversed100 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 100: " + (endTimeBubbleReversed100-startTimeBubbleReversed100));
    long startTimeShellReversed100 = System.nanoTime();
    a.shellSort(reversedArray100);
    long endTimeShellReversed100 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 100: " + (endTimeShellReversed100-startTimeShellReversed100));
    long startTimeQuickReversed100 = System.nanoTime();
    a.quickSort(reversedArray100);
    long endTimeQuickReversed100 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 100: " + (endTimeQuickReversed100-startTimeQuickReversed100));
    long startTimeMergeReversed100 = System.nanoTime();
    a.mergeSort(reversedArray100);
    long endTimeMergeReversed100 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 100: " + (endTimeMergeReversed100-startTimeMergeReversed100));
    long startTimeUpgradedQuickReversed100 = System.nanoTime();
    a.upgradedQuickSort(reversedArray100, 3, 3);
    long endTimeUpgradedQuickReversed100 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 100: " + (endTimeUpgradedQuickReversed100-startTimeUpgradedQuickReversed100));
    long startTimeBuiltReversed100 = System.nanoTime();
    Arrays.sort(reversedArray100);
    long endTimeBuiltReversed100 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 100 with Java's in built: " + (endTimeBuiltReversed100-startTimeBuiltReversed100));
    
    
    //sorting a reverse sorted array of length 200
    Arrays.sort(randomArray200); //now becomes a sorted array
    int[] reversedArray200 = a.reverse(randomArray200);
    long startTimeInsertionReversed200 = System.nanoTime();
    a.insertionSort(reversedArray200);
    long endTimeInsertionReversed200 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 200: " + (endTimeInsertionReversed200-startTimeInsertionReversed200));
    long startTimeBubbleReversed200 = System.nanoTime();
    a.bubbleSort(reversedArray200);
    long endTimeBubbleReversed200 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 200: " + (endTimeBubbleReversed200-startTimeBubbleReversed200));
    long startTimeShellReversed200 = System.nanoTime();
    a.shellSort(reversedArray200);
    long endTimeShellReversed200 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 200: " + (endTimeShellReversed200-startTimeShellReversed200));
    long startTimeQuickReversed200 = System.nanoTime();
    a.quickSort(reversedArray200);
    long endTimeQuickReversed200 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 200: " + (endTimeQuickReversed200-startTimeQuickReversed200));
    long startTimeMergeReversed200 = System.nanoTime();
    a.mergeSort(reversedArray200);
    long endTimeMergeReversed200 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 200: " + (endTimeMergeReversed200-startTimeMergeReversed200));
    long startTimeUpgradedQuickReversed200 = System.nanoTime();
    a.upgradedQuickSort(reversedArray200, 3, 3);
    long endTimeUpgradedQuickReversed200 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 200: " + (endTimeUpgradedQuickReversed200-startTimeUpgradedQuickReversed200));
    long startTimeBuiltReversed200 = System.nanoTime();
    Arrays.sort(reversedArray200);
    long endTimeBuiltReversed200 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 200 with Java's in built: " + (endTimeBuiltReversed200-startTimeBuiltReversed200));
    
    
    //sorting a reverse sorted array of length 500
    Arrays.sort(randomArray500); //now becomes a sorted array
    int[] reversedArray500 = a.reverse(randomArray500);
    long startTimeInsertionReversed500 = System.nanoTime();
    a.insertionSort(reversedArray500);
    long endTimeInsertionReversed500 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 500: " + (endTimeInsertionReversed500-startTimeInsertionReversed500));
    long startTimeBubbleReversed500 = System.nanoTime();
    a.bubbleSort(reversedArray500);
    long endTimeBubbleReversed500 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 500: " + (endTimeBubbleReversed500-startTimeBubbleReversed500));
    long startTimeShellReversed500 = System.nanoTime();
    a.shellSort(reversedArray500);
    long endTimeShellReversed500 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 500: " + (endTimeShellReversed500-startTimeShellReversed500));
    long startTimeQuickReversed500 = System.nanoTime();
    a.quickSort(reversedArray500);
    long endTimeQuickReversed500 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 500: " + (endTimeQuickReversed500-startTimeQuickReversed500));
    long startTimeMergeReversed500 = System.nanoTime();
    a.mergeSort(reversedArray500);
    long endTimeMergeReversed500 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 500: " + (endTimeMergeReversed500-startTimeMergeReversed500));
    long startTimeUpgradedQuickReversed500 = System.nanoTime();
    a.upgradedQuickSort(reversedArray500, 3, 3);
    long endTimeUpgradedQuickReversed500 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 500: " + (endTimeUpgradedQuickReversed500-startTimeUpgradedQuickReversed500));
    long startTimeBuiltReversed500 = System.nanoTime();
    Arrays.sort(reversedArray500);
    long endTimeBuiltReversed500 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 500 with Java's in built: " + (endTimeBuiltReversed500-startTimeBuiltReversed500));
    
    //sorting a reverse sorted array of length 1000
    Arrays.sort(randomArray1000); //now becomes a sorted array
    int[] reversedArray1000 = a.reverse(randomArray1000);
    long startTimeInsertionReversed1000 = System.nanoTime();
    a.insertionSort(reversedArray1000);
    long endTimeInsertionReversed1000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 1000: " + (endTimeInsertionReversed1000-startTimeInsertionReversed1000));
    long startTimeBubbleReversed1000 = System.nanoTime();
    a.bubbleSort(reversedArray1000);
    long endTimeBubbleReversed1000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 1000: " + (endTimeBubbleReversed1000-startTimeBubbleReversed1000));
    long startTimeShellReversed1000 = System.nanoTime();
    a.shellSort(reversedArray1000);
    long endTimeShellReversed1000 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 1000: " + (endTimeShellReversed1000-startTimeShellReversed1000));
    long startTimeQuickReversed1000 = System.nanoTime();
    a.quickSort(reversedArray1000);
    long endTimeQuickReversed1000 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 1000: " + (endTimeQuickReversed1000-startTimeQuickReversed1000));
    long startTimeMergeReversed1000 = System.nanoTime();
    a.mergeSort(reversedArray1000);
    long endTimeMergeReversed1000 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 1000: " + (endTimeMergeReversed1000-startTimeMergeReversed1000));
    long startTimeUpgradedQuickReversed1000 = System.nanoTime();
    a.upgradedQuickSort(reversedArray1000, 3, 3);
    long endTimeUpgradedQuickReversed1000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 1000: " + (endTimeUpgradedQuickReversed1000-startTimeUpgradedQuickReversed1000));
    long startTimeBuiltReversed1000 = System.nanoTime();
    Arrays.sort(reversedArray1000);
    long endTimeBuiltReversed1000 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 1000 with Java's in built: " + (endTimeBuiltReversed1000-startTimeBuiltReversed1000));
    
    //sorting a reverse sorted array of length 2000
    Arrays.sort(randomArray2000); //now becomes a sorted array
    int[] reversedArray2000 = a.reverse(randomArray2000);
    long startTimeInsertionReversed2000 = System.nanoTime();
    a.insertionSort(reversedArray2000);
    long endTimeInsertionReversed2000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 2000: " + (endTimeInsertionReversed2000-startTimeInsertionReversed2000));
    long startTimeBubbleReversed2000 = System.nanoTime();
    a.bubbleSort(reversedArray2000);
    long endTimeBubbleReversed2000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 2000: " + (endTimeBubbleReversed2000-startTimeBubbleReversed2000));
    long startTimeShellReversed2000 = System.nanoTime();
    a.shellSort(reversedArray2000);
    long endTimeShellReversed2000 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 2000: " + (endTimeShellReversed2000-startTimeShellReversed2000));
    long startTimeQuickReversed2000 = System.nanoTime();
    a.quickSort(reversedArray2000);
    long endTimeQuickReversed2000 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 2000: " + (endTimeQuickReversed2000-startTimeQuickReversed2000));
    long startTimeMergeReversed2000 = System.nanoTime();
    a.mergeSort(reversedArray2000);
    long endTimeMergeReversed2000 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 2000: " + (endTimeMergeReversed2000-startTimeMergeReversed2000));
    long startTimeUpgradedQuickReversed2000 = System.nanoTime();
    a.upgradedQuickSort(reversedArray2000, 3, 3);
    long endTimeUpgradedQuickReversed2000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 2000: " + (endTimeUpgradedQuickReversed2000-startTimeUpgradedQuickReversed2000));
    long startTimeBuiltReversed2000 = System.nanoTime();
    Arrays.sort(reversedArray2000);
    long endTimeBuiltReversed2000 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 2000 with Java's in built: " + (endTimeBuiltReversed2000-startTimeBuiltReversed2000));
    
    
    //sorting a reverse sorted array of length 5000
    Arrays.sort(randomArray5000); //now becomes a sorted array
    int[] reversedArray5000 = a.reverse(randomArray5000);
    long startTimeInsertionReversed5000 = System.nanoTime();
    a.insertionSort(reversedArray5000);
    long endTimeInsertionReversed5000 = System.nanoTime();
    System.out.println("Time taken to insertion sort a reversed array of length 5000: " + (endTimeInsertionReversed5000-startTimeInsertionReversed5000));
    long startTimeBubbleReversed5000 = System.nanoTime();
    a.bubbleSort(reversedArray5000);
    long endTimeBubbleReversed5000 = System.nanoTime();
    System.out.println("Time taken to bubble sort a reversed array of length 5000: " + (endTimeBubbleReversed5000-startTimeBubbleReversed5000));
    long startTimeShellReversed5000 = System.nanoTime();
    a.shellSort(reversedArray5000);
    long endTimeShellReversed5000 = System.nanoTime();
    System.out.println("Time taken to shell sort a reversed array of length 5000: " + (endTimeShellReversed5000-startTimeShellReversed5000));
    long startTimeQuickReversed5000 = System.nanoTime();
    a.quickSort(reversedArray5000);
    long endTimeQuickReversed5000 = System.nanoTime();
    System.out.println("Time taken to quick sort a reversed array of length 5000: " + (endTimeQuickReversed5000-startTimeQuickReversed5000));
    long startTimeMergeReversed5000 = System.nanoTime();
    a.mergeSort(reversedArray5000);
    long endTimeMergeReversed5000 = System.nanoTime();
    System.out.println("Time taken to merge sort a reversed array of length 5000: " + (endTimeMergeReversed5000-startTimeMergeReversed5000));
    long startTimeUpgradedQuickReversed5000 = System.nanoTime();
    a.upgradedQuickSort(reversedArray5000, 3, 3);
    long endTimeUpgradedQuickReversed5000 = System.nanoTime();
    System.out.println("Time taken to upgraded quick sort a reversed array of length 5000: " + (endTimeUpgradedQuickReversed5000-startTimeUpgradedQuickReversed5000));
    long startTimeBuiltReversed5000 = System.nanoTime();
    Arrays.sort(reversedArray5000);
    long endTimeBuiltReversed5000 = System.nanoTime();
    System.out.println("Time taken to sort a reversed array of length 5000 with Java's in built: " + (endTimeBuiltReversed5000-startTimeBuiltReversed5000));
  }

}
    
    
  
    