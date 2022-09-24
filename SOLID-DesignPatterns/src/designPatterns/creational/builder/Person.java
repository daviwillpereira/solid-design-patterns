package designPatterns.creational.builder;

public class Person {

	private String name;
	private String email;
	private String address;
	private String university;
	private int age;

	public Person(Builder builder) {
		this.name = builder.name;
		this.email = builder.email;
		this.address = builder.address;
		this.university = builder.university;
		this.age = builder.age;
	}

	public static class Builder {

		// final for compulsory attributes
		private final String name;
		private final String email;
		// standard declaration for optional attributes
		private String address;
		private String university;
		private int age;

		public Builder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public Builder setAddress(String address) {
			this.address = address;
			// return the actual Builder of the class Person
			return this;
		}

		public Builder setUniversity(String university) {
			this.university = university;
			// return the actual Builder of the class Person
			return this;
		}

		public Builder setAge(int age) {
			this.age = age;
			// return the actual Builder of the class Person
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", address=" + address + ", university=" + university
				+ ", age=" + age + "]";
	}

}
