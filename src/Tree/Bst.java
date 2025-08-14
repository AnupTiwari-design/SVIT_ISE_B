package Tree;

public class Bst {

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // Search a node in BST
    public static boolean search(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;
        if (key < root.data) return search(root.left, key);
        return search(root.right, key);
    }

    // Inorder traversal (LNR)
    public static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public Node minValueNode(Node root) {
        Node current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }

    // Delete a node
    public Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // CASE 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }
            // CASE 2: One child
            else if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }
            // CASE 3: Two children
            Node successor = minValueNode(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

   
    public static void main(String[] args) {
        Node root = null;
        Bst ob = new Bst();

        // Inserting elements
        root = ob.insert(root, 8);
        root = ob.insert(root, 3);
        root = ob.insert(root, 10);
        root = ob.insert(root, 1);
        root = ob.insert(root, 6);
        root = ob.insert(root, 14);
        root = ob.insert(root, 4);
        root = ob.insert(root, 7);
        root = ob.insert(root, 13);

        // Inorder Traversal
        System.out.println("Inorder Traversal:");
        ob.inorder(root);
        System.out.println();

        // Searching
        int searchKey = 7;
        System.out.println("Searching for " + searchKey + ": " + (search(root, searchKey) ? "Found" : "Not Found"));

        // Deleting leaf node (Case 1)
        System.out.println("\nDeleting leaf node 1:");
        root = ob.delete(root, 1);
        ob.inorder(root);
        System.out.println();

        // Deleting node with one child (Case 2)
        System.out.println("\nDeleting node 14 (one child):");
        root = ob.delete(root, 14);
        ob.inorder(root);
        System.out.println();

        // Deleting node with two children (Case 3)
        System.out.println("\nDeleting node 3 (two children):");
        root = ob.delete(root, 3);
        ob.inorder(root);
        System.out.println();
    }
}