class Nonstatic1 
{
	void	area(){
		int w=10;
		int	h=10;
		int	res=w*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Nonstatic1().area();
	}
}
