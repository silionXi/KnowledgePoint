class Demo2DateType {
	public static void main(String[] args) {
		//整数类型
		byte b = 100;
		short s = 1000;
		int i = 10000;
		long l = 123456789012345678L;
		//System.out.println(12345+5432l);切记 如果想标识long类型的数,超过了int的取值范围,需要在末尾
		//加上L,最好是大写,因为小写的太像1这个数字;
		//浮点类型
		float f = 12.3f;
		double d = 13.4d;		//13.4后面的d可以省略,d可以是大写也可以是小写
		//字符类型
		char c1 = 'a';
		char c2 = '0';
		char c3 = '中';			
		//字符是否可以存储中文?
		//可以,java是unicode编码,char类型占的两个字节,而一个中文占的也是两个字节
		//System.out.println(c3);
		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
	}
}
