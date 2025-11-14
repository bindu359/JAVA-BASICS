class Reference8 
{
	double	area(){
		int	r=10;
		double	radian=23.14;
		double	res=0.5*(r*r)*radian;
		return	res;
	}
	public static void main(String[] args) 
	{
		Reference8	r8=new	Reference8();
		double	x=r8.area();
		System.out.println(x);
	}
}
