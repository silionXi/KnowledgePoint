class Demo8Operator {
	public static void main(String[] args) {
		/*int a = 4;
		//a++;				//a++ 相当于a = a+1
		//int b = a++;		//如果++符号放在变量的后面,是先赋值,再自加
							//无论赋值,还是运算,还是打印都是先将变量里的值拿出来,然后在自身+1
		//System.out.println("b = " + b);
		System.out.println(a++);
		System.out.println(a);*/

		int a = 4;
		++a;				//a++和++a单独写没有区别
		//int b = ++a;		//如果++符号放在变量的前面,是先自加,然后再赋值
		//System.out.println("b = " + b);
		System.out.println(a);
	}
}
