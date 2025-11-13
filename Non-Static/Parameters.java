class Parameters 
{
	void	area(int	b,int	h){
		double	res=0.5*b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Parameters().area(10,10);
	}
}
