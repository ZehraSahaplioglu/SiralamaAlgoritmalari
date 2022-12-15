package siralamaalgoritmalari;

import java.util.Arrays;

public class SelectionSort {

    int[] dizi;

    public SelectionSort(int[] d) {
        dizi = d;

    }

    public void SelectionSort() {
        int min = 0;
        int temp = 0;

        for (int i = 0; i < dizi.length; i++) {
            min = i;

            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[min]) {
                    min = j;
                }
            }

            if (min != i) {  // iyileştirme: min eşit değilse i ye swap işlemi yapsın
                temp = dizi[min];
                dizi[min] = dizi[i];
                dizi[i] = temp;
            }
        }
    }
    // her dış döngüde dizideki en küçük bulunur

    public void print() {
        System.out.println(Arrays.toString(dizi));
    }

}

