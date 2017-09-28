class Demo6Abstract {
	public static void main(String[] args) {
		Coder c = new Coder("魏昊","007",7000.00);
		c.work();
		Manager m = new Manager("周怀","9527",5000,20000);
		m.work();
	}
}
/*
* A:案例演示
	* 假如我们在开发一个系统时需要对程序员类进行设计，程序员包含3个属性：姓名、工号以及工资。
	* 经理，除了含有程序员的属性外，另为还有一个奖金属性。
	* 请使用继承的思想设计出程序员类和经理类。要求类中提供必要的方法进行属性访问。
分析:
	共性:
		属性: 姓名,工号,工资
		行为: 工作
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
		System.out.println("我的姓名是:" + getName() + ",我的工号是:" + getId() + ",我的薪资是:" + getPay() + ",我的工作内容是敲代码");
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
		System.out.println("我的姓名是:" + getName() + ",我的工号是:" + 
			getId() + ",我的薪资是:" + getPay() + ",我的奖金是:" + bonus + ",我的工作内容是管理");
	}
}