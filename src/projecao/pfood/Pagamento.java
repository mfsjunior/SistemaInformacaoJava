package projecao.pfood;

public class Pagamento {
	private int Id;
	private String Forma_pgt;
	private String Parcela_ou_nao;
	
	//GET AND SET
	
	public Pagamento() {
		getId();
		getForma_pgt();
		getParcela_ou_nao();
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getForma_pgt() {
		return Forma_pgt;
	}
	public void setForma_pgt(String forma_pgt) {
		Forma_pgt = forma_pgt;
	}
	public String getParcela_ou_nao() {
		return Parcela_ou_nao;
	}
	public void setParcela_ou_nao(String parcela_ou_nao) {
		Parcela_ou_nao = parcela_ou_nao;
	}
	
	

	
	
	
	
	
}
