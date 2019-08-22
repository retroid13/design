public class Person {

	private final int id;
	private final String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	private Person(Builder builder) {
		id = builder.id;
		name = builder.name;
	}

	public static class Builder {

		private int id;
		private String name;

		public Builder id(int id) {
			this.id = id;
			return this;
		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	public static void main(String[] args) {
		new Person.Builder().id(1).name("John").build();
	}
}

