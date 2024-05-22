package projecao.pfood;

public class Produto {
	private int Id;
	private Double Preco;
	private String Descricao;
	private String Nome;
	
	//GET AND SET
	
	public Produto() {
		getId();
		getPreco();
		getDescricao();
		getNome();
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Double getPreco() {
		return Preco;
	}

	public void setPreco(Double preco) {
		Preco = preco;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
	
	
	
	
}
