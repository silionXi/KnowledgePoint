class Demo3Final {
	public static void main(String[] args) {
		Demo d = new Demo();
		//System.out.println(d.NUM);
		d.show();
	}
}
/*
final���εı���
	1,��һ�ָ�ֵ,����ʱ��ֱ�Ӹ�ֵ
	2,�ڶ��ָ�ֵ,���캯����ֵ
*/
class Demo {
	final int NUM;						
	
	public Demo() {
		NUM = 10;
	}
	public void show() {
		//NUM = 10;
		System.out.println(NUM);
	}
}
