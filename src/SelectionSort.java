import java.util.Arrays;
import java.util.Comparator;

public class SelectionSort<T>  {
    T[] arr;

    public SelectionSort(T[] arr1) {
        this.arr = arr1;
    }

    public void sort() {
        for (int i = 0; i < arr.length; i++) {
            T min = arr[i];
            int indexMin = i;
            if(arr[0] instanceof Integer){
                for (int j = i; j < arr.length; j++) {
                    if ((Integer)arr[j] < (Integer) min) {
                        indexMin = j;
                        min = arr[j];
                    }
                }
                if(indexMin != i) {// them điều kiện để bỏ qua trường hợp số thứ 0 là min
                    T temp = arr[i];
                    arr[i] = min;
                    arr[indexMin] = temp;
                }
            }else if (arr[0] instanceof String){
                for (int j = i; j < arr.length; j++) {
                    String str1= arr[j].toString();
                    String str2= min.toString();
                    if (str1.compareToIgnoreCase(str2)<0) {
                        indexMin = j;
                        min = arr[j];
                    }
                }
                if(indexMin != i) {// them điều kiện để bỏ qua trường hợp phần tử đang là min
                    T temp = arr[i];
                    arr[i] = min;
                    arr[indexMin] = temp;
                }

            }
        }
    }

    @Override
    public String toString() {
        return "SelectionSort{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
