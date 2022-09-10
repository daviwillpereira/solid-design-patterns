package interfaceSegregation;

public class App {

	public static void main(String[] args) {
		Tree tree = new BinarySearchTree();
		System.out.println("BST:");
		tree.insert();
		tree.delete();
		tree.traverse();
		//BST doesn't need left and right rotation of the interface! - Design Smell!! -
		
		
		RotationTree tree2 = new BalancedTree();
		System.out.println("\nBalancedTree:");
		tree2.insert();
		tree2.delete();
		tree2.traverse();
		tree2.leftRotation();
		tree2.rightRotation();
	}
}
