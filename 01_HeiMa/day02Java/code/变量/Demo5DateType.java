//������(��������ת��)
class Demo5DateType {
	public static void main(String[] args) {
		byte b,b1,b2;
		b1 = 3;
		b2 = 4;
		//b = b1 + b2;					//b1��b2������byte���͵ı���,
										//�ڽ�������Ļ��Զ���������Ϊint����
										//b1��b2����������,jvm�޷��ж���������ֵ
		b = 3 + 4;						//3��4����������,java��һ�������Ż�����,�ڱ���ֱ�ӽ�������ӵĽ���������ֵ

		//���������ֻᱨ��,Ϊʲô
		System.out.println(b);

		byte x = 100;
	}
}
