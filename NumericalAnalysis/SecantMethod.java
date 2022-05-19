package NumericalAnalysis;

public class SecantMethod {  
    static float f(float x) {	 
		float f = (float)Math.pow(x, 3) + x - 1;							
		return f;
	}
	
	static void secant(float x1, float x2, float E) {	
		float n = 0, xm, x0, c;
		if (f(x1) * f(x2) < 0)
		{
			do {	 
				x0 = (x1 * f(x2) - x2 * f(x1)) / (f(x2) - f(x1));
		 
				c = f(x1) * f(x0);
		 
				x1 = x2;
				x2 = x0;
		 
				n++;
		 
				if (c == 0)
					break;
				xm = (x1 * f(x2) - x2 * f(x1)) / (f(x2) - f(x1));
			 
			} while (Math.abs(xm - x0) >= E);									
			System.out.println("Root of the" + " given equation=" + x0);		
			System.out.println("No. of " + "iterations = " + n);
		}
		else
			System.out.print("Can not find a" + " root in the given interval");
	} 
	public static void main(String[] args) {
	 
		float x1 = 0, x2 = 1, E = 0.0001f;
		secant(x1, x2, E);
	}
}
 

