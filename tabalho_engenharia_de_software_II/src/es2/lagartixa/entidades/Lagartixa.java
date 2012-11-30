package es2.lagartixa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Lagartixa {
	private int id;
	private String descricao;
	private String nomePopular;
	private String nomeCientifico;
	private String especie;
	private List lstHabitat;
	private Genero genero;
	private static int cont;

	public Lagartixa() {
		super();
		setId();
		this.lstHabitat = new ArrayList();
	}

	public Lagartixa(String descricao, String nomePopular,
			String nomeCientifico, String especie, Genero genero) {
		super();
		setId();
		setDescricao(descricao);
		setNomePopular(nomePopular);
		setNomeCientifico(nomeCientifico);
		setEspecie(especie);
		setGenero(genero);
		setLstHabitat(new ArrayList());
	}

	public int getId() {
		return id;
	}

	private void setId() {
		this.id = incremento();
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public String getNomeCientifico() {
		return nomeCientifico;
	}

	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}

	public void setLstHabitat(List lstHabitat) {
		this.lstHabitat = lstHabitat;
	}

	public List getLstHabitat() {
		return lstHabitat;
	}

	private static int incremento() {
		cont = cont + 1;
		return cont;
	}

	public void addHabitat(Habitat habitat) {
		lstHabitat.add(habitat);
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void listar() {
		System.out.println("Nome Popular: " + getNomePopular());
		System.out.println("Nome Cientifíco: " + getNomeCientifico());
		System.out.println("Espécie: " + getEspecie());
		System.out.println("Descrição: " + getDescricao());
		if (getGenero() != null) {
			System.out.println("\nGênero :");
			getGenero().listar();
		} else
			System.out.println("\nGênero não informado.");
		if (getLstHabitat().size() > 0 && !getLstHabitat().equals(null)) {
			System.out.println("\nHabitat");
			for (Object o : getLstHabitat()) {
				((Habitat) o).listar();
			}
		} else
			System.out.println("\nHabitat não informado.");

	}
}
