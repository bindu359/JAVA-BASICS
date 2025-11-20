class Car3 
{
		int	Car_cost;
		String	Car_name;
		String	Car_type;
		Car3(int	Car_cost,String	Car_name,String	Car_type){
		this.Car_cost=Car_cost;
		this.Car_name=Car_name;
		this.Car_type=Car_type;
		}
public static void main(String[] args) 
	{
		Car3	c3=new	Car3(5000000,"BMW X1","Petrol");
		System.out.println(c3.Car_cost);
		System.out.println(c3.Car_name);
		System.out.println(c3.Car_type);
	}
}

	