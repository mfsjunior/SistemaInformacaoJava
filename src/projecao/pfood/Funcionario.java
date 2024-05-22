package projecao.pfood;

public class Funcionario {
	private int Id;
	private String Nome;
	private String CPF;
	private String Cargo;
	private String Matricula;
	
	//GET AND SET
	
	public Funcionario(){
		getId();
		getNome();
		getCPF();
		getCargo();
		getMatricula();
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getCargo() {
		return Cargo;
	}
	public void setCargo(String cargo) {
		Cargo = cargo;
	}
	public String getMatricula() {
		return Matricula;
	}
	public void setMatricula(String matricula) {
		Matricula = matricula;
	}
	
	
	
	
	
	
	
	
	
	
	
}
