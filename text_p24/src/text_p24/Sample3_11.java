package text_p24;

public class Sample3_11 
{
	public static void main(String[] args)
	{
		Car car1;
		car1 = new Car();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("ֻ׃��܇̖");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("ֻ׃��������");
		car1.setCar(30.5);
		car1.show();
		
	}

}
class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("��܇̖�O��"+num);
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("���������O��"+gas);
	}
	
	public void setCar(int n,double g)
	{
		num = n;
		gas = g;
		System.out.println("��܇̖�O��"+num+"���������O��"+gas);
	}
	
	public void show()
	{
		System.out.println("܇̖��"+num);
		System.out.println("��������"+gas);
	}
}