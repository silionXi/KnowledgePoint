class Demo4Static {
	public static void main(String[] args) {
		//ArrayTool at = new ArrayTool();
		int[] arr = {66,44,33,11,22,55,77};

		//int max = at.getMax(arr);
		//System.out.println(max);

		int max = ArrayTool.getMax(arr);	//当一个类中所有的方法都是静态的,需要再多做一步
		System.out.println(max);			//将构造函数私有,目的是不让其他类创建本类对象
	}
}

