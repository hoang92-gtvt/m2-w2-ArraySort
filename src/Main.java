import SortString.ArraySort;
import SortString.QuickSort;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {2,5,6,7,4,1,9,3};
        String[] array2= { "ac", "db", "ce","eg","bh"};
        ArraySort testSort1= new ArraySort(array1);
        ArraySort testSort2= new ArraySort(array2);

//        System.out.println(testSort1);
//        testSort1.selectionSort();
//        testSort1.bubleSort();
//        testSort1.insertSort2();
//        System.out.println("Dãy sau khi sort");
//        System.out.println(testSort1);


        System.out.println(testSort2);
//        testSort2.selectionSort();
//        testSort2.bubleSort();
        testSort2.insertSort2();
        System.out.println("Dãy sau khi sort");
        System.out.println(testSort2);

        System.out.println("---------------------");

        int[] arr3= {2,5,19,6,4,0};
        QuickSort testSort3 = new QuickSort(arr3);
        System.out.println(testSort3);

        testSort3.quickSort(0, arr3.length-1);
        System.out.println("Dãy sau khi sort");
        System.out.println(testSort3);

    }
}
