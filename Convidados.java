package ListaEncadeada;

/*/Faca um programa em java para armazernar uma lista de convidados para a festa do seu aniversário. 

1) Lista simplesmente encadeada (adicionar, remover e listar)

/*/
public class Convidados {

	private Integer id;
	private String nome;
	private String email;
	public Convidados(Integer id, String nome, String email) {
		this.id = id;
		this.nome = nome;
		this.email = email;
}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
