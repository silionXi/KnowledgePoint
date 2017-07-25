class Demo4DateType {
	public static void main(String[] args) {
		/*int i = 100;
		byte b = 50;
		i = i + b;					//自动类型提升(隐式转换)

		System.out.println(i);*/

		//00000000 00000000 00000000 10010110   int类型的150
		//10010110								用byte强转150后的结果

		//0 1101010								106
		//1 1101010								-106的原码
		//1 0010101								-106的反码
		//0 0000001                             +1
		//1 0010110								-106的补码
		int i = 100;
		byte b = 50;
		b = (byte)(i + b);						//强制类型转换
		System.out.println(b);

		byte b2 = (byte)300;
		System.out.println(b2);
		//00000000 00000000 00000001 00101100   300的二进制表现形式
		//00101100
	}
}
