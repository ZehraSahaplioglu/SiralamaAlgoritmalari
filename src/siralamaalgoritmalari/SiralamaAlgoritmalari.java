package siralamaalgoritmalari;
import java.util.Random;

public class SiralamaAlgoritmalari {
    
    class Node {

        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;
    
    SiralamaAlgoritmalari() {  //binary search tree için siralama algoritmalari yapılandırıcı
        root = null;
    }

    SiralamaAlgoritmalari(int value) {
        root = new Node(value);
    }

    public void insert(int key) { // bu method insertRec() ara metodunu çağırır
        root = insertRec(root, key);
    }

    Node insertRec(Node root, int key) { // BST'ye yeni bir veri ekler (recursive bir şekilde yazıldı)

        if (root == null) { // eğer BST boş ise yani hiç elemanı yoksa gelen elemanı ekler
            root = new Node(key);
            return root;
        } else if (key < root.key) // ağaçta bulunan eleman, eklenecek elemandan büyük ise
        {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) // ağaçta bulunan eleman, eklenecek elemandan küçük ise
        {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    public void inorder() { // bu method InorderRec() ara metodunu çağırır
        inorderRec(root);
    }

    public void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print("[");
            System.out.print(root.key);
            System.out.print("] ,  ");
            inorderRec(root.right);
        }
    }
    
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
        
        //Seymanur add pull-request
        SiralamaAlgoritmalari tree = new SiralamaAlgoritmalari();

        /* oluşturacağımız BST ağacı:
              50
           /     \
          36      75
         /  \    /  \
       24   43  60   83
      /       \        \
     10       45        99
         */
        
        tree.insert(50);
        tree.insert(36);
        tree.insert(24);
        tree.insert(43);
        tree.insert(75);
        tree.insert(60);
        tree.insert(83);
        tree.insert(99);
        tree.insert(10);
        tree.insert(45);

        tree.inorder();

    }

}
