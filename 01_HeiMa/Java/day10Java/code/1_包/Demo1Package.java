class Demo1Package {
	public static void main(String[] args) {
		Inter i = new Demo();
		i.print();
	}
}

interface Inter {
	public void print();
}

class Demo implements Inter {
	public void print() {
		System.out.println("Hello World!");
	}
}
