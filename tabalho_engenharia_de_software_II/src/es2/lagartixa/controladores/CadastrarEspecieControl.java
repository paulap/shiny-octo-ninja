package es2.lagartixa.controladores;

import es2.lagartixa.entidades.Genero;
import es2.lagartixa.entidades.Lagartixa;

public class CadastrarEspecieControl {
	public void CadastrarEspecie(String descricao, String nomePopular,
			String nomeCientifico, String especie, Genero genero) {
		new Lagartixa(descricao, nomePopular, nomeCientifico, especie);
		//TODO gravar no bd
	}

	public void ConsultarEspecie() {
		Lagartixa.listar();
	}
}
