package text_p45;

public class Sample3_22 
{
	public static void main(String[] args)
	{
		System.out.println("����car1");
		Car car1;
		car1 = new Car();
		car1.setCar(1234,20.5);
		
		System.out.println("����car2");
		Car car2;
		
		System.out.println("��car1����ocar2");
		car2 = car1;
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
		
		System.out.println("��׃car1�����P�Y��");
		car1.setCar(2345,30.5);
		
		System.out.println("car1��");
		car1.show();
		
		System.out.println("car2��");
		car2.show();
	}
}

class Car
{
	private int num;
	private double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("���a��܇��");
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"����������"+gas);
	}
	
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}