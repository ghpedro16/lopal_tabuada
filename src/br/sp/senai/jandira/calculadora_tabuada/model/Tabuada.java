package br.sp.senai.jandira.calculadora_tabuada.model;

public class Tabuada {

	private double multiplicando;
	private double minimoMultiplicador;
	private double maximoMultiplicador;
	
	
	public void setMultiplicando(double multiplicando) {
		this.multiplicando = multiplicando;
	}
	
	public double getMultiplicando(){
		return multiplicando;
	}

	public void setMinimoMultiplicador(double minimoMultiplicador) {
		this.minimoMultiplicador = minimoMultiplicador;
	}
	
	public double getMinimoMultiplicador() {
		return minimoMultiplicador;
	}
	
	public void setMaximoMultiplicador(double maximoMultiplicador) {
		this.maximoMultiplicador = maximoMultiplicador;
	}
	
	public double getMaximoMultiplicador() {
		return maximoMultiplicador;
	}

	
	public void calcularTabuada() {
		// Verificar se os valores estão invertidos
		if(minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
		}
		
		while (minimoMultiplicador <= maximoMultiplicador){
            double produto = multiplicando * minimoMultiplicador;
            System.out.printf("%s X %s = %s\n", multiplicando, minimoMultiplicador, produto);
            minimoMultiplicador++;
        }
		
	}
	
}
