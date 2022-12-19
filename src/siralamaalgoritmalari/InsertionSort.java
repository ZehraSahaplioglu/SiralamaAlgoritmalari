
package siralamaalgoritmalari;

import java.util.Arrays;


public class InsertionSort {
    
    int[] dizi;
    int n;  //insertion sort için kullandık

    public InsertionSort(int[] d) {
        dizi = d;
        n = d.length;  //insertion sort için kullandık
    }
    
    public void InsertionSort() {
        int t = 0, i = 0, j = 0;
        for (i = 0; i < n; i++) {
            t = dizi[i];
            
            for (j = i; j > 0 && dizi[j - 1] > t; j--) {
                dizi[j] = dizi[j - 1];
            }
            
            dizi[j] = t;
        }
        
    }
    
    public void print() {
        System.out.println(Arrays.toString(dizi));
    }

    
}
