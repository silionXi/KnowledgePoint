//������
class Demo10Operator {
	public static void main(String[] args) {
		int a = 10;

		//a += 20;			//a = a + 20;�൱�ڽ�����������ӵĽ���ٸ�ֵ�����,
		//20 += a;			//���һ���Ǳ���
		a *= 20;
		//System.out.println(a);

		short s=1;
		
		//s = s+1;			//short������int���ͽ������������Ϊint����,�����int����,���ܸ�ֵ��short����
		s+=1;				// s = (short)(s + 1);+=����һ����ֵ�����,����Ϊ���ܹ���֤��ֵ�ɹ�,���int����ǿתΪshort����
		System.out.println(s);
	}
}
