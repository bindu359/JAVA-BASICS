class Reference7 
{
	double	area(){
		final	double	pi=3.142;
		int	a=10;
		int	b=10;
		double	res=pi*a*b;
		return	res;
	}
	public static void main(String[] args) 
	{
		Reference7	r7=new	Reference7();
		double	x=r7.area();
		System.out.println(x);
	}
}
