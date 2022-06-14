
public class Dortgen {
  protected Point p1;

public Dortgen(Point p1) {
	this.p1 = p1;
}

public void AlanHesapla() {
	int a,b;
	a=((p1.getA()-p1.getC())*(p1.getA()-p1.getC()))+((p1.getB()-p1.getD())*(p1.getB()-p1.getD()));
	b=((p1.getE()-p1.getC())*(p1.getE()-p1.getC()))+((p1.getF()-p1.getD())*(p1.getF()-p1.getD()));
	a=(int) Math.sqrt(a);
	b=(int) Math.sqrt(b);

    int c=a*b;
   System.out.println("Alan" + c);
}
}
