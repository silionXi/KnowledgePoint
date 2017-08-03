class Demo5Math {
	public static void main(String[] args) {
		//double d = Math.random();		//生成随机数大于等于0.0小于1.0

		//System.out.println(d);

		for (int x = 1;x <= 100 ;x++ ) {
			int num = (int)(Math.random() * 100) + 1;	//在1到100生成随机整数
			System.out.println(num);
		}
	}
}
