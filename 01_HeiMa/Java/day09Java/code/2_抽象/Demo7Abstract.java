class Demo7Abstract {
	public static void main(String[] args) {
		//Zi z = new Zi();
		//z.print();
	}
}

abstract class Fu {
	//private abstract void print();		//Demo7Abstract.java:9: 错误: 非法的修饰符组合: abstract和private
										//private是私有不让子类看到,abstract是抽象就是为了让子类重写,他俩矛盾的
	//static abstract void print();		//Demo7Abstract.java:11: 错误: 非法的修饰符组合: abstract和static
										//静态修饰的方法,可以直接类名.调用,而类名.调用抽象方法是没有意义的

	final abstract void print();		//Demo7Abstract.java:14: 错误: 非法的修饰符组合: abstract和final
										//final是最终的,修饰的方法不让子类重写,而abstract修饰的方法就是为了让子类重写

}

class Zi extends Fu {
	public void print() {
		System.out.println("Hello World!");
	}
}