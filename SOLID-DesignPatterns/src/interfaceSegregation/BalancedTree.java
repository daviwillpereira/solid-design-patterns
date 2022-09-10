package interfaceSegregation;

public class BalancedTree implements RotationTree {

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

	@Override
	public void leftRotation() {
		System.out.println("Left Rotation...");
	}

	@Override
	public void rightRotation() {
		System.out.println("Right Rotation...");

	}

}
