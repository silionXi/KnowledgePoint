class Demo1Interface {
	public static void main(String[] args) {
		Inter i = new Demo();
		i.print();
	}
}

interface Inter {
	public abstract void print();
	
	/*public void method() {				//错误: 接口方法不能带有主体
		System.out.println("aaa");			//接口中所有的方法都是抽象的
	}*/
}

class Demo implements Inter {
	public void print() {
		System.out.println("print");
	}
}
