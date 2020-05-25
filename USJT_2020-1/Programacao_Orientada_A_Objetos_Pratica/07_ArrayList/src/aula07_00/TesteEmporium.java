package aula07_00;

public class TesteEmporium {

	public static void main(String[] args) {
		
		//CRIAR OBJETO CARRINHO
		Carrinho carrinho = new Carrinho();
		
		//MÉTODO COLOCAR PRODUTO NO CARRINHO
		carrinho.colocarProdutoNoCarrinho("carne", 40.50, 1.0);
		carrinho.colocarProdutoNoCarrinho("arroz", 10.00, 1.0);
		carrinho.colocarProdutoNoCarrinho("feijão", 12.00, 1.0);
		carrinho.colocarProdutoNoCarrinho("macarrão", 05.00, 1.0);

	}

}
