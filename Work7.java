class	Project7{
	static	double	area(){
	final	double	pi=3.142;
	int	a=10;
	int	b=10;
	double	res=pi*a*b;
	return	res;
	}
}
class	Work7{
	public	static	void	main(String[]	args){
	double	x=Project7.area();
	System.out.println(x);
	}

}