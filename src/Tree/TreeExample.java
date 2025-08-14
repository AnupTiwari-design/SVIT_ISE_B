package Tree;

public class TreeExample {
	
	public static void inorder(Node root) {
		if(root ==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+ "\n");
		inorder(root.right);
	}

	public static void main(String[] args) {
		
		Node root =new Node(1);
		root.left=new Node(2);
		root.left.left= new Node(4);
		root.right=new Node(10);
		
		root.right.right=new Node(6);
		root.right.left=new Node(7);
		
		inorder(root);

	}

}
