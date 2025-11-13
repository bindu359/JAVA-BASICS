class Parameters3 
{
	void	area(int	a,int	b,int	h){
				double	res=0.5*(a+b)*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Parameters3().area(10,10,10);
	}
}
