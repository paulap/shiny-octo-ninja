package es2.lagartixa.entidades;

import java.util.ArrayList;
import java.util.List;

public class Habitat {
	private int id;
	private String descricao;
	private String nome;

	private static int cont;

	public Habitat() {
		super();
		setId();
	}

	public Habitat(String descricao, String nome) {
		super();
		setId();
		setDescricao(descricao);
		setNome(nome);
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

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	private static int incremento() {
		cont = cont + 1;
		return cont;
	}

	public void listar() {
		System.out.println("Nome Cientifíco: " + getNome());
		System.out.println("Descrição: " + getDescricao());
	}
}
