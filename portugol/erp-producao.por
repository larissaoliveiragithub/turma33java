// Loja DevShoes 
// Integrantes: Matheus, Paulo, Larissa, Fernando, Beatriz e Leonardo.
// ###### GENERATION BRASIL 2021 TURMA 33 #######
// SISTEMA QUE SIMULA UM E-COMMERCE



programa{
	inclua biblioteca Util
	// Função MAIN
	funcao inicio(){
		apresentacao()
		Util.aguarde(500)
		apresentacao2()
		perguntar()
	     
	}
	
	// Função do bloco - Apresentacao
	funcao apresentacao(){
		para(inteiro x=0; x<5; ++x){
			cadeia linha1="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
			escreva(linha1)
		}
			escreva("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ LOJA DevShoes ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
			
		para(inteiro x=0; x<5; ++x){
			cadeia linha2="■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n"
			escreva(linha2)
		}
	}

	funcao apresentacao2 (){
		cadeia nomeLoja,slogan
		escreva("\n ")
		escreva("\n ")
		nomeLoja = "\t\t\tLoja DevShoes"
		slogan = "- CodeStyle é vida!"
		escreva(nomeLoja)
		escreva(" ")
		escreva(slogan)

		escreva("\n ")
		
		escreva("\t\t\t■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■\n")
	}
	
     funcao listarProduto(){
      	inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
          inteiro estoqueProduto[10]={10,10,10,10,10,10,10,10,10,10}
          cadeia vetorProduto[10]
          cadeia codigoProduto[10] 
          inteiro carrinho [10]={10,10,10,10,10,10,10,10,10,10}
         //Declaração do vetor e limite do laço
		const inteiro TAMANHO_VETOR=10 
			 inteiro vetor01[TAMANHO_VETOR]
		
		
		//vetores de produto
		vetorProduto[0] = "Tênis Nike        "
		vetorProduto[1] = "Tênis Adidas      "
		vetorProduto[2] = "Tênis Puma        "
		vetorProduto[3] = "Camisa Nike       "
		vetorProduto[4] = "Camisa Lacoste    "
		vetorProduto[5] = "Camisa Supreme    "
		vetorProduto[6] = "Meia Nike         "
		vetorProduto[7] = "Meia Adidas       "
		vetorProduto[8] = "Bola de futebol   "  
		vetorProduto[9] = "Blusa moleton Nike"

          
          //cabeçalho
          escreva("LISTA DE PRODUTO\n")
          escreva("\n")
          escreva("COD"+"\tPRODUTO"+"\t\t\tVALOR" +"\t\tESTOQUE\n")
          
		para(inteiro x=0; x<TAMANHO_VETOR; ++x){
			//Carga no vetor
			vetor01[x] = x
	          escreva("G2-" +(x+1)+ " "+"\t" +vetorProduto[x]+"\t"+"R$ " +valorProduto[x]+ "\t\t"+estoqueProduto[x]+ "\n")
	          
		    }
		   escreva("\n")
	        escreva("CARRINHO DE COMPRAS")
	        escreva("\n")
	     }
           
            //Carrinho de compras
          
     
     funcao perguntar(){
	caracter valor, s = 's', n = 'n'
	escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
	escreva("\t\t\t\t     S/N: ")
	leia(valor)
	escreva("\n")

      
	se(valor == s ou valor == 'S'){
	       listarProduto()
	}senao se (valor == n ou valor == 'N'){
		escreva("Ok.. Até logo!")
		}senao{
			escreva("Valor digitado é inválido")
		
		
		
		}
	}

	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 2874; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */