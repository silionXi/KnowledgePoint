class Demo2Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		//System.out.println(Inter.num);
	}
}

interface Inter {
	 public static final int num = 10;				//接口中所有的变量都是常量

	 public abstract void print();					//接口中所有的方法都是抽象的
}

class Demo implements Inter {
	public void print() {							//重写接口中的方法,权限必须是public
		System.out.println("1111111111111");
	}
}
