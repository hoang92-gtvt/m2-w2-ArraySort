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

    public void insertSort(){
        for (int i = 1; i < array.length; i++) {
            int value1 = (Integer) array[i-1];
            int value2 = (Integer) array[i];
            if(value2<value1) {
                 T temp= array[i];
                 array[i]=array[i-1];
                 array[i-1]=temp;
                for (int j = i-1; j>0; j--) {
                    if ((Integer)array[j] < (Integer)array[j-1]) {
                        T temp2= array[j];
                        array[j]=array[j-1];
                        array[j-1]=temp2;
                    }else break;
                }

            }
        }
    }

    public void insertSort2(){
        for (int i = 1; i < array.length; i++) {
//            int value1 = (Integer) array[i-1];
//            int value2 = (Integer) array[i];
//            if(value2<value1) {
                T temp= array[i];
                int j;
                for (j=i-1 ; j>=0; j--) {
                    if ((Integer)temp < (Integer)array[j]) {
                    array[j+1]=array[j];
                    }else break;
                }
                array[j+1]=temp;
//            }
        }
    }

}
