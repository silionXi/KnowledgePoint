//面试题(数据类型转换)
class Demo5DateType {
	public static void main(String[] args) {
		byte b,b1,b2;
		b1 = 3;
		b2 = 4;
		//b = b1 + b2;					//b1和b2是两个byte类型的变量,
										//在进行运算的会自动类型提升为int类型
										//b1和b2是两个变量,jvm无法判断里面具体的值
		b = 3 + 4;						//3和4是两个常量,java有一个常量优化机制,在编译直接讲常量相加的结果算出并赋值

		//这两种哪种会报错,为什么
		System.out.println(b);

		byte x = 100;
	}
}
