package ComplexFunctionPlotter.Complex;
public interface ComplexMathMethods{
	//add complex number
	public Complex add(Complex z);
	//multiply complex number
	public Complex mult(Complex z);
	//multiply by real value
	public Complex mult(double value);
	//divide complex number
	public Complex div(Complex z);
	//power complex number to real number
	public Complex pow(double val);
	//power complex number to complex number
	public Complex pow(Complex z);
	
	//trigonometric methods
	//get sinus of complex value
	public Complex sin();
	//get cosinus of complex value
	public Complex cos();
	//get secant of complex value
	public Complex sec();
	//get cosecant of complex value
	public Complex csc();
	//get tangent of complex value
	public Complex tan();
	//get cotangent of complex value
	public Complex cot();
	
	//hyperbolic Methods
	//get hyperbolic sinus of Complex value
	public Complex sinh();
	//get hyperbolic cosinus of Complex value
	public Complex cosh();
	//get hyperbolic secant of Complex value
	public Complex sech();
	//get hyperbolic cosecant of Complex value
	public Complex csch();
	//get hyperbolic tangent of Complex value
	public Complex tanh();
	//get hyperbolic cotangent of Complex value
	public Complex coth();
	
	//inverse trigonometric methods
	//get inverse sinus of complex value
	public Complex asin();
	//get inverse cosinus of complex value
	public Complex acos();
	//get inverse secant of complex value
	public Complex asec();
	//get inverse cosecant of complex value
	public Complex acsc();
	//get inverse tangent of complex value
	public Complex atan();
	//get inverse cotangent of complex value
	public Complex acot();
	
	//inverse hyperbolic methods
	//get inverse hyperbolic sinus of complex value
	public Complex arsin();
	//get inverse hyperbolic cosinus of complex value
	public Complex arcos();
	//get inverse hyperbolic secant of complex value
	public Complex arsec();
	//get inverse hyperbolic cosecant of complex value
	public Complex arcsc();
	//get inverse hyperbolic tangent of complex value
	public Complex artan();
	//get inverse hyperbolic cotangent of complex value
	public Complex arcot();
	
	//get ln of Complex
	public Complex log();
	//get module of complex number
	public double module();
	//get main argument of complex number
	public double getArg();
	//get complex conjugate
	public Complex getConjugate();
	//get complex with module 1
	public Complex normalize();
}