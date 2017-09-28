interface Inter { 
	abstract void show(); 
}
class Outer { 
	//补齐代码
	public static Inter method() {		//Inter i = Inter的子类对象
		return new Inter(){
			public void show() {
				System.out.println("1111111111");
			}
		};
	}
}
class OuterDemo {
	public static void main(String[] args) {
		Outer.method().show();					//链式编程:调用方法返回的是对象,还可以继续调用方法
	}
}
