
public class Test {

	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();

		binaryTree.root = new Tree(1);
		binaryTree.root.left = new Tree(2);
		binaryTree.root.right = new Tree(3);
		binaryTree.root.left.left = new Tree(4);
		binaryTree.root.left.right = new Tree(5);

		System.out.println("Preorder");
		binaryTree.preOrder();

		System.out.println("Inorder");
		binaryTree.inOrder();

		System.out.println("Postorder");
		binaryTree.postOrder();

	}

}
