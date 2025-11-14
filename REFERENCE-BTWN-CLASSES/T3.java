class	Type3{
	int	area(){
	int	w=10;
	int	h=10;
	int	res=w*h;
	return	res;
	}
}
class	T3{
	public	static	void	main(String[]	args){
	Type3	t3=new	Type3();
	int	x=t3.area();
	System.out.println(x);
	}

}