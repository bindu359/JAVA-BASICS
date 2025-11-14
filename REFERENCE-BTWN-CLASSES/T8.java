class	Type8{
	double	area(){
	int	r=10;
	double	radian=23.14;
	double	res=0.5*(r*r)*radian;
	return	res;
	}
}
class	T8{
	public	static	void	main(String[]	args){
	Type8	t8=new	Type8();
	double	x=t8.area();
	System.out.println(x);
	}

}