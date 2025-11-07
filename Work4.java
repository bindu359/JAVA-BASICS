class	Project4{
	static	double	area(){
	int	b=10;
	int	h=10;
	double	res=0.5*b*h;
	return	res;
	}
}
class	Work4{
	public	static	void	main(String[]	args){
	double	x=Project4.area();
	System.out.println(x);
	}

}