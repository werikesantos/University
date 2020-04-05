package aula05_00;

public class Caneta {
		
		private String tipo;
		private String cor;
		
		//construtor modificador
		public Caneta() {
			this.tipo = "";
			this.cor = "";
		}
		//construtor acessor
		public Caneta(String t, String c){
			this.tipo = t;
			this.cor = c;
		}

		//Acessor do atributo "tipo"
		public String getTipo() {
			return this.tipo;
		}
		
		//Modificador do atributo "tipo"
		public void setTipo(String t) {
			this.tipo = t;
		}
		
		//Acessor do atributo "cor"
		public String getCor() {
			return this.cor;
		}
		
		//Modificador do atributo "cor"
		public void setCor(String c) {
			this.cor = c;
		}
		
		public void status() {
			System.out.println("Caneta: "+getTipo()+"\nCor: "+getCor()+"\n=========================");
		}
}