package es2.lagartixa.boundary;

import es2.lagartixa.controladores.CadastrarEspecie;

public class BiologoBoundary {
	public static void main(String[] args) {
		CadastrarEspecie lag1 = new CadastrarEspecie("", "", "", "", null);
		lag1.ConsultarEspecie();
	}
}