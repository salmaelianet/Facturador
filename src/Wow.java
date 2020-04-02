
public class Wow implements Tarifador{
	
	float tarifaBasica;

	public Wow(float tarifaBasica) {
		this.tarifaBasica=tarifaBasica;
	}
	
	
	@Override
	public float calcularTarifa() {
		
		return this.tarifaBasica;
	}

}
