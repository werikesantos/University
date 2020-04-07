package aula05_00;

public class Caneta {
		
		private String tipo;
		private String cor;
		
		//==============# CONSTRUTOR #===================
		public Caneta(String tipo, String cor){
			this.tipo = tipo;
			this.cor = cor;
		}
		
		//===============# MÉTODOS #=====================
		public void imprimir() {
			System.out.println("Caneta: "+getTipo()+"\nCor: "+getCor()+"\n=========================");
		}
		
		//===============# SETTER_GETTER #===============
		//Acessor TIPO
		public String getTipo() {
			return this.tipo;
		}
		
		//Modificador TIPO
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		
		//===============================================
		//Acessor COR
		public String getCor() {
			return this.cor;
		}
		
		//Modificador COR
		public void setCor(String cor) {
			this.cor = cor;
		}		
}