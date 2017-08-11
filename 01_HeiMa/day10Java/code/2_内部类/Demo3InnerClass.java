class Demo3InnerClass {
	public static void main(String[] args) {
		//Outer o = new Outer();
		//o.method();

		Outer o = new Outer();
		o.method();
	}
}

class Outer {										//外部类
	public void method() {							//外部类的成员方法
		final int num = 10;
		class Inner {								//局部内部类
			public void show() {					//局部内部类中的成员方法
				System.out.println(num);
			}
		}

		Inner i = new Inner();
		i.show();
	}

}
