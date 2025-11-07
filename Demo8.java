class	Class8{
	static	void	area(int	r,double	radian){
		double	res=0.5*(r*r)*radian;
		System.out.println(res);
	}
}
class  Demo8
{
	public static void main(String[] args) 
	{
		Class8.area(10,23.14);
	}
}
