class Nonstatic2 
{
	void	area(){
		int a=10;
		
		int	res=a*a;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Nonstatic2().area();
	}
}
