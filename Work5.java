class	Project5{
	static	double	area(){
	int	a=10;
	int	b=10;
	int	h=10;
	double	res=0.5*(a+b)*h;
	return	res;
	}
}
class	Work5{
	public	static	void	main(String[]	args){
	double	x=Project5.area();
	System.out.println(x);
	}

}