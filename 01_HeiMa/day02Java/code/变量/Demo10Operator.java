//面试题
class Demo10Operator {
	public static void main(String[] args) {
		int a = 10;

		//a += 20;			//a = a + 20;相当于将左右两边相加的结果再赋值给左边,
		//20 += a;			//左边一定是变量
		a *= 20;
		//System.out.println(a);

		short s=1;
		
		//s = s+1;			//short类型与int类型进行运算会提升为int类型,结果是int类型,不能赋值给short类型
		s+=1;				// s = (short)(s + 1);+=号是一个赋值运算符,所以为了能够保证赋值成功,会把int类型强转为short类型
		System.out.println(s);
	}
}
