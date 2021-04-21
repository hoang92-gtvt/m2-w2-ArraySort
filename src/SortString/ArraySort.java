package SortString;

import java.util.Arrays;

public class ArraySort<T> {
    public T [] array ;

    public ArraySort(T[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "ArraySort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public void bubleSort(){
        int start= 0;
        int end = array.length;
        for (int i = 0; i < end; i++) {
            if(array[i] instanceof Integer) {
                for (int j = end - 1; j > i; j--) {
                    if ((Integer) array[j] < (Integer) array[j - 1]) {
                        T temp = array[j];
                        array[j] = array[j - 1];
                        array[j - 1] = temp;
                    }
                }
            }else if (array[i] instanceof String)  {

                for (int j = 0; j <end-1 ; j++) {// lưu ý ( nếu để j=i khi start thì những giá trị ban đâu ko đc xét nữa)
                    String str1= array[j].toString();
                    String str2= array[j+1].toString();
//                    if(str1.charAt(0)>str2.charAt(0)){
                    if(str1.compareToIgnoreCase(str2)>0){
                        T temp = array[j];
                        array[j]= array[j+1];
                        array[j+1]= temp;
                    }
                }
            }
        }
    }


    public void selectionSort() {
        for (int i = 0; i < array.length; i++) {
            T min = array[i];
            int indexMin = i;
            if(array[0] instanceof Integer){
                for (int j = i; j < array.length; j++) {
                    if ((Integer)array[j] < (Integer) min) {
                        indexMin = j;
                        min = array[j];
                    }
                }
                if(indexMin != i) {// them điều kiện để bỏ qua trường hợp số thứ 0 là min
                    T temp = array[i];
                    array[i] = min;
                    array[indexMin] = temp;
                }
            }else if (array[0] instanceof String){
                for (int j = i; j < array.length; j++) {
                    String str1= array[j].toString();
                    String str2= min.toString();
                    if (str1.compareToIgnoreCase(str2)<0) {
                        indexMin = j;
                        min = array[j];
                    }
                }
                if(indexMin != i) {// them điều kiện để bỏ qua trường hợp phần tử đang là min
                    T temp = array[i];
                    array[i] = min;
                    array[indexMin] = temp;
                }

            }
        }
    }

}
