class	Project8{
	static	double	area(){
	int	r=10;
	double	radian=23.14;
	double	res=0.5*(r*r)*radian;
	return	res;
	}
}
class	Work8{
	public	static	void	main(String[]	args){
	double	x=Project8.area();
	System.out.println(x);
	}

}