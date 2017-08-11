class Demo4InnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

interface Inter {
	public void print();
}

class Outer {
	/*class Inner implements Inter {					//有名字的内部类实现外部接口
		public void print() {
			System.out.println("Hello World!");
		}
	}

	public void method() {
		//Inner i = new Inner();
		//i.print();
		new Inner().print();
	}*/
	/*
	new 接口或类名(){
		需要重写的方法
	}
	*/
	public void method() {
		new Inter(){
			public void print() {
				System.out.println("print");
			}
		}.print();
	}
}
