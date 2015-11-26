package pac1;

public class Areasfined {
	public void triangle(){
		int h=12;
		int b=24;
		System.out.println("Area of Triangle A="+((h*b)/2));
	}
	public void squear(){
		 int a=9;
	        System.out.println("Arwa of Square A="+(a*a));
		
	}
	public void rectangle(){
		int l=15;
	    int w=10;
	    System.out.println("Arwa of Rectangle A="+(w*l));	
	}
    public void Circle(){
    	int r=9;
        System.out.println("Arwa of Circle A="+(3.14*r*r));
    }
    public void tripezoid(){
    	 int a1=7;
         int b1=13;
         int h1=17;
         System.out.println("Arwa of Tripezoid A="+((a1+b1)/2)*h1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Areasfined area=new Areasfined();
		area.triangle();
		area.Circle();
		area.squear();
		area.tripezoid();
		area.rectangle();

	}

}
