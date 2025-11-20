class Bike3{ 
		int bike_cost;
		String bike_brand;
		String bike_color;
		Bike3(int	a,String	b,String	c){
			bike_cost=a;
			bike_brand=b;
			bike_color=c;
		}
	public static void main(String[] args) 
	{
		Bike3	b3=new	Bike3(290000,"Royal Enfield","Black");
		System.out.println(b3.bike_cost);
		System.out.println(b3.bike_brand);
		System.out.println(b3.bike_color);
	}
}
