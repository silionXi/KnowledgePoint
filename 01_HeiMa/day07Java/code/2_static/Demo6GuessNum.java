import java.util.Scanner;
class Demo6GuessNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);				//��������¼�����
		int result = (int)(Math.random() * 100) + 1;		//���ɵ������,��1��100��Χ��
		System.out.println("������һ��1��100������:");

		while(true) {										//�������¼���,����������ѭ��
			int guessNum = sc.nextInt();					//��ȡ����¼�������
			if (guessNum > result) {
				System.out.println("����");
			}else if (guessNum < result) {
				System.out.println("С��");
			}else {
				System.out.println("����");
				break;
			}
		}
	}
}
