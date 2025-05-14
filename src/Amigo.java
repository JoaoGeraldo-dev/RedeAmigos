
public class Amigo {
	private String nome, sexo, mensagem;
	private int idade;
	
	
	public String getNome() {
		return nome;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public String getMensagem() {
		return mensagem;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void SetNome(String nome) {
		this.nome = nome;
	}
	
	public void SetSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public void SetMensagem(String mensagem) {
		//o tamanho da mensagem vai ser no maximo 144

		if(mensagem.length() <= 144) {
			this.mensagem = mensagem;
		}else {
			//trunca se for maior
			this.mensagem = mensagem.substring(0, 144);
		}	
	}
	
	public void Setidade(int idade) {
		this.idade = idade;
	}
	
	public String toString() {
	      return "[Nome: "+nome+"] [Sexo: "+sexo+"] [Idade: "+idade+ 
	    	         "]\n[Mensagem: "+mensagem+"]"; 

	}
}
