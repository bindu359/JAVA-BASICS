class Nonstatic3 
{
	void	area(){
		int b=10;
		int	h=10;
		int	res=b*h;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		new	Nonstatic3().area();
	}
}
