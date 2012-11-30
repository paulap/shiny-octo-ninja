package es2.lagartixa.controladores;

import es2.lagartixa.entidades.Genero;
import es2.lagartixa.entidades.Lagartixa;

public class CadastrarEspecie extends Lagartixa {
	public CadastrarEspecie(String descricao, String nomePopular,
			String nomeCientifico, String especie, Genero genero) {
		super(descricao, nomePopular, nomeCientifico, especie, genero);
	}

	public void ConsultarEspecie() {
		listar();
	}
}
