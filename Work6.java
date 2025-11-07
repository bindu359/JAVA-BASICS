class	Project6{
	static	double	area(){
	final	double	pi=3.142;
	int	r=10;
	double	res=pi*r*r;
	return	res;
	}
}
class	Work6{
	public	static	void	main(String[]	args){
	double	x=Project6.area();
	System.out.println(x);
	}

}