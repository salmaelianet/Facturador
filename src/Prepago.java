
public class Prepago implements Tarifador{
	public  float horaInicio;
	public  float horaFin;
	
	
	public Prepago(float horaInicio,float horaFin) {
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public float calcularDuracion() {
		return horaFin-horaInicio;
	}

	@Override
	public float calcularTarifa() {
		// TODO Auto-generated method stub
		return (float) (1*calcularDuracion());
	}
	
	
	
	
}
