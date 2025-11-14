class Refer8 
{
	void	area(int	r,double	radian){
		
		double	res=0.5*(r*r)*radian;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Refer8	r8=new	Refer8();
		r8.area(10,23.14);
	}
}
