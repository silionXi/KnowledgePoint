class Demo3Final {
	public static void main(String[] args) {
		Demo d = new Demo();
		//System.out.println(d.NUM);
		d.show();
	}
}
/*
final修饰的变量
	1,第一种赋值,定义时就直接赋值
	2,第二种赋值,构造函数赋值
*/
class Demo {
	final int NUM;						
	
	public Demo() {
		NUM = 10;
	}
	public void show() {
		//NUM = 10;
		System.out.println(NUM);
	}
}
