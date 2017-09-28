class Demo8 {
	public static void main(String[] args) {
		Demo d = new Demo();
		int num = d.add(30,40);
		System.out.println(num);
	}
}

class Demo {
	int a;
	int b;

	//方式一求和
	/*public int add() {
		int a = 10;
		int b = 20;
		return a + b;
	}*/
	
	//方式二求和
	/*public int add(int a,int b) {
		return a + b;
	}*/

	//方式三求和

	public int add(int a,int b) {
		this.a = a;
		this.b = b;

		return this.a + this.b;
	}

	/*
	成员变量和局部变量
	成员变量所属于对象,要看是否是对象的特性,比如人,人的姓名,年龄等
	局部变量所属与方法,要看方法执行的时候,是否需要,如果需要就定义,好处是方法运行后就消失
	*/
}
