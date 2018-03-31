
public class BinaryTree {

	Tree root;

	public BinaryTree() {

		root = null;

	}

	public void preOrder(Tree tree) {
		if (tree == null)
			return;

		System.out.print(tree.key + " ");

		preOrder(tree.left);

		preOrder(tree.right);

	}

	public void inOrder(Tree tree) {

		if (tree == null)
			return;

		// ilk olarak kök

		inOrder(tree.left);

		System.out.print(tree.key + " ");

		inOrder(tree.right);

	}

	public void postOrder(Tree tree) {
		if (tree == null)
			return;

		postOrder(tree.left);

		postOrder(tree.right);

		System.out.print(tree.key + " ");

	}

	public void preOrder() {
		preOrder(root);
	}

	public void inOrder() {
		inOrder(root);
	}

	public void postOrder() {
		postOrder(root);
	}

}
