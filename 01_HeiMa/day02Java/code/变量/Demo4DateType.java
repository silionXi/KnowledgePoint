class Demo4DateType {
	public static void main(String[] args) {
		/*int i = 100;
		byte b = 50;
		i = i + b;					//�Զ���������(��ʽת��)

		System.out.println(i);*/

		//00000000 00000000 00000000 10010110   int���͵�150
		//10010110								��byteǿת150��Ľ��

		//0 1101010								106
		//1 1101010								-106��ԭ��
		//1 0010101								-106�ķ���
		//0 0000001                             +1
		//1 0010110								-106�Ĳ���
		int i = 100;
		byte b = 50;
		b = (byte)(i + b);						//ǿ������ת��
		System.out.println(b);

		byte b2 = (byte)300;
		System.out.println(b2);
		//00000000 00000000 00000001 00101100   300�Ķ����Ʊ�����ʽ
		//00101100
	}
}
