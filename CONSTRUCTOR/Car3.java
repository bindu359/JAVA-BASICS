class Car3 
{
		int	Car_cost;
		String	Car_name;
		String	Car_type;
		Car3(int	a,String	b,String	c){
		Car_cost=a;
		Car_name=b;
		Car_type=c;
		}
public static void main(String[] args) 
	{
		Car3	c3=new	Car3(5000000,"BMW X1","Petrol");
		System.out.println(c3.Car_cost);
		System.out.println(c3.Car_name);
		System.out.println(c3.Car_type);
	}
}

	