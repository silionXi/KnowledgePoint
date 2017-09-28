class StudentDemo7 {
	public static void main(String[] args) {
		Student s = new Student();

		System.out.println(s.getName() + "," + s.getAge());

	}
}

class Student {
	private String name;
	private int age;

	public Student() {
		name = "ÕÅÈı";
		age = 23;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
