class Refer7 
{
	void	area(int	a,int	b){
		final	double	pi=3.142;
		double	res=pi*a*b;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		Refer7	r7=new	Refer7();
		r7.area(10,10);
	}
}
