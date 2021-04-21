import SortString.ArraySort;

public class Main {
    public static void main(String[] args) {
        Integer[] array1 = {2,5,6,7,4,1,9,3};
        String[] array2= { "a", "d", "c","e","b"};
        ArraySort testSort1= new ArraySort(array1);
        ArraySort testSort2= new ArraySort(array2);

        System.out.println(testSort1);
//        testSort1.selectionSort();
//        testSort1.bubleSort();
        testSort1.insertSort2();
        System.out.println("Dãy sau khi sort");
        System.out.println(testSort1);


//        System.out.println(testSort2);
//        testSort2.selectionSort();
//        testSort2.bubleSort();
//        System.out.println("Dãy sau khi sort");
//        System.out.println(testSort2);

    }
}
