package siralamaalgoritmalari;

public class Node {

    private int key;
    private Node right;
    private Node left;

    public Node search(Node root, int key) { // ağaçta belirli bir anahtarı arayan method

        if (root == null || root.key == key) { // ağaç boş ise veya aranan eleman root ise rootu döndürür
            return root;
        }

        if (root.key < key) { // aranan elemanın değeri > root'un değeri ise
            return search(root.right, key);
        }

        return search(root.left, key); // aranan elemanın değeri < root'un değeri ise
    }
}
