class Demo1 {
	public static void main(String[] args) {
		//整数类型byte,short,int,long
		/*
		byte占的是1个字节  = 8个bit   0 1111111 = 1 + 2 + 4 + 8 + 16 + 32 + 64 = 127
									  1 1111111 = -127
									  1 0000000 取反
									  1 0000001 -127的补码
									  1 0000000 -128的补码
									  0 0000001 减去1
									 -------------
									  1 1111111 
									  1 0000000  -128的原码

		byte取值范围是-128到127      -128到-1 0到127  256个数
		short占的2个字节 = 16个bit
		int 占的4个字节 = 32个bit	//int是整数类型的默认类型
		long占的8个字节 = 64个bit
		*/
		//浮点类型 float和double
		/*
		float占的是4个字节			单精度
		double占的是8个字节			双精度 double是浮点数的默认类型
		*/
		//字符类型
		/*
		char占的两个字节            0到65535之间
		*/
		//布尔类型
		/*
		布尔类型占几个字节?
		按照bit位算的话,应该占的是八分之一个字节

		*/

	}
}
