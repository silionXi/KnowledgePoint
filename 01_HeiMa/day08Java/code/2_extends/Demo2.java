class Demo2 {
	public static void main(String[] args) {
		DemoC d = new DemoC();
		d.show1();
		d.show2();
	}
}

class DemoA {
	public void show1() {
		System.out.println("DemoA");
	}
}

class DemoB extends DemoA {
	public void show2() {
		System.out.println("DemoB");
	}
}

class DemoC extends DemoB {	//java只支持单继承,java支持的多层继承
	public void show3() {
		System.out.println("DemoC");
	}
}
