public class Plan {

	//public String tipo;
	public Tarifador tarifador;
	
	public Plan(Tarifador tarifador) {
		//this.tipo=tipo;
		this.tarifador=tarifador;
	}
	
	public float calcularTarifaPlan() {
		
		return this.tarifador.calcularTarifa();
	}
	
}
