class Nonstatic7 
{
	void	area(){
		int	r=10;
		double	radian=23.14;
		double	res=0.5*(r*r)*radian;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Nonstatic7().area();
	}
}
