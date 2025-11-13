class Nonstatic6 
{
	void	area(){
		final	double	pi=3.142;
		int	a=10;
		int	b=10;
		double	res=pi*a*b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Nonstatic6().area();
	}
}
