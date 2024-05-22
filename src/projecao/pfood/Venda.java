package projecao.pfood;
import java.util.Date;

public class Venda {
	private int Id;
	private Double total;
	private Double quantidade;
	private Date data_venda = new Date();
	
	//GET AND SET
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public Double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}
	public Date getData_venda() {
		return data_venda;
	}
	public void setData_venda(Date data_venda) {
		this.data_venda = data_venda;
	}
	
	
	public static void main(String[]args) {
		Cliente clientes = new Cliente();
		
		clientes.getId();
		clientes.getNome();
		clientes.getTelefone();
		clientes.getEmail();
		clientes.getEndereco();
		clientes.getCPF();
		
		
		System.out.println(clientes.getId());
		System.out.println(clientes.getNome());
		System.out.println(clientes.getTelefone());
		System.out.println(clientes.getEmail());
		System.out.println(clientes.getEndereco());
		System.out.println(clientes.getCPF());
	}
	
	
	
	
	
}
