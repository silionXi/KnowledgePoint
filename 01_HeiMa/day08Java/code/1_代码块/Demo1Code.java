class Demo1Code {
	static {
		System.out.println("Demo1Code");
	}
	
	public static void main(String[] args) {
		/*{									//�ֲ������,��������
			int x = 10;						//�޶���������������
			System.out.println(x);
		}*/

		Person p1 = new Person();
		p1.name = "����";
		p1.age = 23;

		System.out.println("-------------------------");
		Person p2 = new Person("����",24);
		
	}

	static {
		System.out.println("Demo1Code222222222222");
	}
}

class Person {
	String name;
	int age;

	public Person(){
		//cry();
		System.out.println("�ղι���");
	}

	public Person(String name,int age) {
		//cry();
		this.name = name;
		this.age = age;
		System.out.println("�вι���");
	}

	{											//��������(��ʼ����),����������
		//System.out.println("��������");		//�������������,������߱���ͬ�����Ի���ͬ����Ϊ
		cry();									//����Ҫ��ÿ�����캯���ж�����ͬ�����Ի���Ϊ,��ô̫�鷳
	}											//���ڹ��������ж��弴��

	static {									//��̬�������������ļ��ض�����,����ִֻ��һ��
		System.out.println("��̬�����");		//��̬�������������������ִ�е�
	}											//��̬����������,���ڼ�������
	public void cry() {
		System.out.println("����!!!");
	}
}
