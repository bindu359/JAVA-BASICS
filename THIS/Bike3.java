class Bike3{ 
		int bike_cost;
		String bike_brand;
		String bike_color;
		Bike3(int	bike_cost,String	bike_brand,String	bike_color){
			this.bike_cost=bike_cost;
			this.bike_brand=bike_brand;
			this.bike_color=bike_color;
		}
	public static void main(String[] args) 
	{
		Bike3	b3=new	Bike3(290000,"Royal Enfield","Black");
		System.out.println(b3.bike_cost);
		System.out.println(b3.bike_brand);
		System.out.println(b3.bike_color);
	}
}
