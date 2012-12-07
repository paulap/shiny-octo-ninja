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
			String nomeCientifico, String especie) {
		super();
		setId();
		setDescricao(descricao);
		setNomePopular(nomePopular);
		setNomeCientifico(nomeCientifico);
		setEspecie(especie);
		setGenero(new Genero());
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

	public static void listar() {
		List<Lagartixa> as = null;
		// TODO consultar lagartixas no bd
		for (Lagartixa a : as) {
			System.out.println("Nome Popular: " + a.getNomePopular());
			System.out.println("Nome Cientifíco: " + a.getNomeCientifico());
			System.out.println("Espécie: " + a.getEspecie());
			System.out.println("Descrição: " + a.getDescricao());
			if (a.getGenero() != null) {
				System.out.println("\nGênero :");
				a.getGenero().listar();
			} else
				System.out.println("\nGênero não informado.");
			if (a.getLstHabitat().size() > 0 && !a.getLstHabitat().equals(null)) {
				System.out.println("\nHabitat");
				for (Object o : a.getLstHabitat()) {
					((Habitat) o).listar();
				}
			} else
				System.out.println("\nHabitat não informado.");
		}
	}
}
