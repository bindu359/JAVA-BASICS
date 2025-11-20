class Laptop3 
{
		String laptop_name;
		int laptop_cost;
		String laptop_brand;
		Laptop3(String	a,int	b,String	c){
		laptop_name=a;
		laptop_cost=b;
		laptop_brand=c;
		}
	public static void main(String[] args) 
	{
		Laptop3	l3=new	Laptop3("Victus",50000,"HP");
		System.out.println(l3.laptop_name);
		System.out.println(l3.laptop_cost);
		System.out.println(l3.laptop_brand);
	}
}
