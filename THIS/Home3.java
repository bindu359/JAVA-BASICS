class Home3 
{
		String home_name;
		int home_cost;
		String home_color;
		Home3(String	home_name,int	home_cost,String	home_color){
		this.home_name=home_name;
		this.home_cost=home_cost;
		this.home_color=home_color;
		}
	public static void main(String[] args) 
	{
		Home3	h3=new	Home3("Home",7500000,"Pink");
		System.out.println(h3.home_name);
		System.out.println(h3.home_cost);
		System.out.println(h3.home_color);
	}
}
