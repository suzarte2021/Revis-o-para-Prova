package ListaEncadeada;

/*/Faca um programa em java para armazernar uma lista de convidados para a festa do seu aniversário. 

1) Lista simplesmente encadeada (adicionar, remover e listar)
/*/
public class Celula {

	private Convidados valor;  //  info  prox
	private Celula proximo;
	
	public Convidados getValor() {
		return valor;
	}
	public void setValor(Convidados valor) {
		this.valor = valor;
	}
	public Celula getProximo() {
		return proximo;
	}
	public void setProximo(Celula proximo) {
		this.proximo = proximo;
	}
}
