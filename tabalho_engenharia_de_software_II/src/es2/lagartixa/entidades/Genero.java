package es2.lagartixa.entidades;

public class Genero {

	private int id;
	private String descricao;
	private String nome;
	private Familia familia;

	private static int cont;

	public Genero() {
		super();
		setId();
	}

	public Genero(String descricao, String nome) {
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

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void listar() {
		System.out.println("Nome Popular: " + getNome());
		System.out.println("Descrição: " + getDescricao());
		if (getFamilia() != null) {
			System.out.println("\nFamília");
			getFamilia().listar();
		} else
			System.out.println("Família não informada.");
	}
}
