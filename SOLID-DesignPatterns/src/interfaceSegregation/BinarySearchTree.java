package interfaceSegregation;

public class BinarySearchTree implements Tree {

	@Override
	public void insert() {
		System.out.println("Inserting new item...");
	}

	@Override
	public void delete() {
		System.out.println("Removing a given item...");

	}

	@Override
	public void traverse() {
		System.out.println("In-order traverse in O(N)...");

	}

//	@Override
//	public void leftRotation() {
//		//There is no left rotation in BST
//	}
//
//	@Override
//	public void rightRotation() {
//		//There is no right rotation in BST
//
//	}

}
