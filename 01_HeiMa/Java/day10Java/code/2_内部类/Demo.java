class Demo {
	public static void main(String[] args) {
		StudentDemo sd = new StudentDemo();
		sd.method(new Student());
	}
}

class Student {
	private String name;
	private int age;

	public Student(){}

	public Student(String name,int age) {
		this.name = name;
	}
}

class StudentDemo {
	public Student print() {
		return new Student();
	}

	public void method(Student s) {
		
	}
}