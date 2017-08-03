class MethodDemo4 {
	/*
	* A:成员方法分类
	* a:根据返回值
		* 有明确返回值方法
		* 返回void类型的方法
	* b:根据形式参数
		* 无参方法
		* 带参方法
	*/
	public static void main(String[] args) {
		MethodDemo4 md = new MethodDemo4();
		int num = md.sum(20,40);
		System.out.println(num);

		md.add(30,40);
	}

	/*
	求两个数的和(有返回值)
	1,明确返回值类型int
	2,明确参数列表 int a,int b
	*/

	public int sum(int a,int b) {
		return a + b;
	}

	/*
	求两个数的和(无返回值)
	1,明确返回值类型void
	2,明确参数列表 int a,int b
	*/

	public void add(int a,int b) {
		System.out.println(a + b);
	}

	/*
	求两个数的最大值(有参数)
	1,明确返回值类型int
	2,明确参数列表int a,int b
	*/

	public int max(int a,int b) {
		return a > b ? a : b;
	}

	/*
	求两个数的最大值(无参数)
	1,明确返回值类型int
	2,明确参数列表
	*/

	public int getMax() {
		int a = 10;
		int b = 20;
		return a > b ? a : b;
	}
}
