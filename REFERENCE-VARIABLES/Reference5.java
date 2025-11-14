class Reference5 
{
	double	area(){
		int a=10;
		int b=10;
		int	h=10;
		double	res=0.5*(a+b)*h;
		return	res;
		}
	public static void main(String[] args) 
	{
		Reference5	r5=new	Reference5();
		double	x=r5.area();
		System.out.println(x);
	}
}
