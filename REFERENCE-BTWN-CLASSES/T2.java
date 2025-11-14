class	Type2{
	int	area(){
	int	b=10;
	int	h=10;
	int	res=b*h;
	return	res;
	}
}
class	T2{
	public	static	void	main(String[]	args){
	Type2	t2=new	Type2();
	int	x=t2.area();
	System.out.println(x);
	}

}