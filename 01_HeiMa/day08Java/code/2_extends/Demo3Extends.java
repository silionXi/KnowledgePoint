class Demo3Extends {
	public static void main(String[] args) {
		Zi z = new Zi();
		z.show();
	}
}

class Fu {
	int num1 = 10;
	int num2 = 30;
}

class Zi extends Fu {
	int num2 = 20;

	public void show() {				//就近原则,自己有就不用父类的
		System.out.println(super.num1);
		System.out.println(this.num2);
		//System.out.println(super.num2);	//super可以调用父类的成员变量
	}
}

/*
this和super的区别
1.this可以访问自己的成员变量,也可以访问父类的成员变量(本类没有这个成员变量)
  super只能访问父类的成员变量
*/
