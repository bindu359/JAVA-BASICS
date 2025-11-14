class	Sample8{
	void	area(){
	int	r=10;
	double	radian=23.14;
	double	res=0.5*(r*r)*radian;
	System.out.println(res);
	}
}
class	Demo8{
	public	static	void	main(String[]	args){
	Sample8	s8=new	Sample8();
	s8.area();
	}	
}