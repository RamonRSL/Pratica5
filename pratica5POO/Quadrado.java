package br.com.newtonpaiva.pratica5POO;

public class Quadrado extends PoligonoRegular {

	public Quadrado(int numLados, float tamLado) {
		super(numLados, tamLado);
	}

	@Override
	public float calcularArea() {
		
		return getNumLados()*getTamLado() ;
	}

}
