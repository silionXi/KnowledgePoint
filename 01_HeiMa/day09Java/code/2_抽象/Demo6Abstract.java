class Demo6Abstract {
	public static void main(String[] args) {
		Coder c = new Coder("κ�","007",7000.00);
		c.work();
		Manager m = new Manager("�ܻ�","9527",5000,20000);
		m.work();
	}
}
/*
* A:������ʾ
	* ���������ڿ���һ��ϵͳʱ��Ҫ�Գ���Ա�������ƣ�����Ա����3�����ԣ������������Լ����ʡ�
	* �������˺��г���Ա�������⣬��Ϊ����һ���������ԡ�
	* ��ʹ�ü̳е�˼����Ƴ�����Ա��;����ࡣҪ�������ṩ��Ҫ�ķ����������Է��ʡ�
����:
	����:
		����: ����,����,����
		��Ϊ: ����
*/

abstract class Employee { 
	private String name;
	private String id;
	private double pay;

	public Employee(){}

	public Employee(String name,String id,double pay) {
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public double getPay() {
		return pay;
	}

	public abstract void work();
}

class Coder extends Employee {
	public Coder(){}

	public Coder(String name,String id,double pay) {
		super(name,id,pay);
	}

	public void work() {
		System.out.println("�ҵ�������:" + getName() + ",�ҵĹ�����:" + getId() + ",�ҵ�н����:" + getPay() + ",�ҵĹ����������ô���");
	}
}

class Manager extends Employee  {
	private int bonus;

	public Manager(){}

	public Manager(String name,String id,double pay,int bonus) {
		super(name,id,pay);
		this.bonus = bonus;
	}

	public void work() {
		System.out.println("�ҵ�������:" + getName() + ",�ҵĹ�����:" + 
			getId() + ",�ҵ�н����:" + getPay() + ",�ҵĽ�����:" + bonus + ",�ҵĹ��������ǹ���");
	}
}