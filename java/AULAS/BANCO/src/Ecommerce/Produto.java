package Ecommerce;

public class Produto {
	//Atributos
		private String id;
		private String nome;
		private double preco;
		private int estoque;
		
		//Construtor
		public Produto(String id, String nome, double preco, int estoque) {
			super();
			this.id = id;
			this.nome = nome;
			this.preco = preco;
			this.estoque = estoque;
		}
		
		//Getters
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getEstoque() {
			return estoque;
		}
		
		public void incluirEstoque(int quantidade){
			if(quantidade >= 0){
				this.estoque += quantidade;
			}
			
		}
		
		public void tirarEstoque(int quantidade){
			if (quantidade <0){
				System.out.println("Impossivel realizar");
			
			}else if(quantidade <= estoque){
				this.estoque -= quantidade;
			}else{
				System.out.println("Quantidade acima do estoque, impossivel realizar.");
			}
		}


	}

