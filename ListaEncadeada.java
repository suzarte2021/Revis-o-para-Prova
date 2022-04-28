package ListaEncadeada;

/*/Faca um programa em java para armazernar uma lista de convidados para a festa do seu aniversário. 

1) Lista simplesmente encadeada (adicionar, remover e listar)
/*/

public class ListaEncadeada {

	private Celula primeiro; ///|     |  --> |      | -->null
	private Celula ultimo; 
	private Celula posicaoAtual;
	
	public void adicionar(Convidados valor) {
		Celula celula = new Celula(); 
		celula.setValor(valor); 
		//como ta minha lista??
		if(primeiro ==null && ultimo ==null) { // pergunto isso?? ta vazia ou tem elemento?
			primeiro = celula;//Manuela
			ultimo = celula;
		}else {							                   
			ultimo.setProximo(celula);
			ultimo = celula;
}
	}		
	public boolean temProximo() {
		if (primeiro == null) {
			return false;
		}else if(posicaoAtual == null){
			posicaoAtual = primeiro;
			return true;
		}else {
			boolean temProximo = posicaoAtual.getProximo() != null ? true : false;
			posicaoAtual = posicaoAtual.getProximo();
			return temProximo;
}
	}
	public Celula getPosicaoAtual() {
		return posicaoAtual;
}
	// esse eh  o nosso metodo para excluir contato
		public void remover() {
			if(primeiro.getProximo() != null) {
				Celula celula = this.recuperarPenultimo(this.primeiro);
				ultimo = celula;
				celula.setProximo(null);
			} else {
				primeiro = ultimo = null;
			}
		}
	private Celula recuperarPenultimo(Celula celula) {
		if(celula.getProximo().equals(ultimo)) {
			return celula;
		}
		return recuperarPenultimo(celula.getProximo());
	}

public void listar() {

	
}
}