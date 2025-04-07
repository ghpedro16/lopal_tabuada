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

	
	public String[] calcularTabuada() {
		// Verificar se os valores estão invertidos
		if(minimoMultiplicador > maximoMultiplicador) {
			double temp = minimoMultiplicador;
			minimoMultiplicador = maximoMultiplicador;
			maximoMultiplicador = temp;
		}
		
		// Criar vetor de String que armazenará cada linha da tabuada
		int tamanho = (int) (maximoMultiplicador - minimoMultiplicador + 1);
		String resultado[] = new String[tamanho];
		
		// Calcular e mostrar tabuada
		int contador = 0;
		while (minimoMultiplicador <= maximoMultiplicador){
            double produto = multiplicando * minimoMultiplicador;
            String linha = multiplicando + " X " + minimoMultiplicador + " = " + produto;
            resultado[contador] = linha;
            System.out.println(linha);
            minimoMultiplicador++;
            contador ++;
        }
		
		return resultado;
		
	}
	
}
