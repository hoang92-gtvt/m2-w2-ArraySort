package SortString;

import java.util.Arrays;

public class QuickSort {
    int[] array ;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void quickSort(int low, int height){
        if( low>height) return ;
        int i=low;
        int j= height;
//        int X = array[(low+height)/2];
        int X = array[i];
        while(i<j){
            while (array[i]<X) i++;
            while (array[j]>X) j--;
            if(i<=j){
                int temp= array[i];
                array[i]= array[j];
                array[j]= temp;
                i++;
                j--;
            }
            quickSort(low,j);
            quickSort(i,height);
        }

    }

    @Override
    public String toString() {
        return "QuickSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
