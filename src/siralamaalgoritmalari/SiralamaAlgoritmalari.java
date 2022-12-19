package siralamaalgoritmalari;
import java.util.Random;

public class SiralamaAlgoritmalari {

    public static void main(String[] args) {
        
        int[] d = new int[10];

        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            d[i] = r.nextInt(100); // 100 den küçük  sayılar verir
        }

        BubbleSort b = new BubbleSort(d);
        
        b.print();
        b.BubbleSort();
        b.print();
        
        SelectionSort s = new SelectionSort(d);
        
        s.print();
        s.SelectionSort();
        s.print();
        
        InsertionSort i = new InsertionSort(d);
        
        s.print();
        s.SelectionSort();
        s.print();
        

    }

}
