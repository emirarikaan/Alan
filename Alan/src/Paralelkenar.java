public class Paralelkenar extends Dortgen {

	public Paralelkenar(Point p1) {
		super(p1);
		// TODO Auto-generated constructor stub
	}
	public void AlanHesapla() {
		int a;
		a= Math.abs(p1.getC()*p1.getH()-p1.getD()*p1.getG());
		System.out.println("Alan: " +a);
	}

}
