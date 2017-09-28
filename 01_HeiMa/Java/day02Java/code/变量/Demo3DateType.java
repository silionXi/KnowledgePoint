class Demo3DateType {
	public static void main(String[] args) {		//作用域
		int x = 10;
		x = 20;										//赋值将原来10覆盖掉
		
		//System.out.println(x);

		int y;										//变量在使用之前必须赋值
		y = 30;
		//System.out.println(y);

		int a,b,c;									//一条语句可以声明多个变量
		a = 10;
		b = 20;
		c = 30;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
