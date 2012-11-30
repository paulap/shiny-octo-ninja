package es2.lagartixa.entidades;

public class Familia {
	private int id;
	private String descricao;
	private String nome;

	private static int cont;

	public Familia() {
		super();
		setId();
	}

	public Familia(String descricao, String nome) {
		super();
		setId();
		setDescricao(descricao);
		setNome(nome);
	}

	private void setNome(String nome) {
		this.nome = nome;

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

	private static int incremento() {
		cont = cont + 1;
		return cont;
	}

	private static int getCont() {
		return cont;
	}

	public void listar() {
		System.out.println("Nome Cientifíco: " + getNome());
		System.out.println("Descrição: " + getDescricao());
	}
}
