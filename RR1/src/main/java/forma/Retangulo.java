package forma;

public class Retangulo implements Forma{
	
	protected double base;
	protected double altura;

	public Retangulo(double base, double altura){
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area(){
		return base * altura;
	}
}