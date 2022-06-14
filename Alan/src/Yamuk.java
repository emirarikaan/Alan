
public class Yamuk extends Dortgen{

	public Yamuk(Point p1) {
		super(p1);
		// TODO Auto-generated constructor stub
	}
public void AlanHesapla() {
	int a,b,c;
	a=((p1.getA()-p1.getC())*(p1.getA()-p1.getC()))+((p1.getB()-p1.getD())*(p1.getB()-p1.getD()));
	b=((p1.getE()-p1.getG())*(p1.getE()-p1.getG()))+((p1.getF()-p1.getH())*(p1.getF()-p1.getH()));
	a=(int) Math.sqrt(a);
	b=(int) Math.sqrt(b);
	c=p1.getH()-p1.getB();
	System.out.println(((a+b)*c)/2);

}
}
