class Demo7Operator {
	public static void main(String[] args) {
		//System.out.println(12 % 5);				//取模运算就是取余数
		//System.out.println(-3 % 5);				//如果左边绝对值小于右边就是本身
		//System.out.println(-10 % 5);			//如果左边绝对值是右边的倍数时,结果为0
		//System.out.println(13 % -5);			//如果左边的绝对值大于右边,结果是余数,符号取决于左边,右边忽略不计
		//System.out.println(3 % 2);				//一个数模与2结果要么是0,要么是1,可以用来切换条件
		int a = 100;
		int b = 30;
		System.out.println(a / b);				//整数与整数运算结果肯定是整数,不能是小数
	}
}
