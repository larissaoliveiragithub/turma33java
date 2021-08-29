programa
{
	
	funcao inicio()
	{
		cadeia valorProduto[10] = {"0.00 ","0.00 ","0.00 ","0.00 ","0.00 ","0.00 ","0.00 ","0.00 ","0.00 ","0.00 "}
          cadeia estoqueProduto[10]={"10","10","10","10","10","10","10","10","10","10"}
          cadeia vetorProduto[10]
          cadeia codigoProduto[10]
         
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
          
          escreva("COD"+"\tPRODUTO"+"\t\t\tVALOR" +"\t\tESTOQUE\n")
          
		para(inteiro x=0; x<TAMANHO_VETOR; ++x){
			//Carga no vetor
			vetor01[x] = x
	          escreva("G2-" +(x+1)+ " "+"\t" +vetorProduto[x]+"\t"+"R$ " +valorProduto[x]+ "\t"+estoqueProduto[x]+ "\n")
	          
		     
		
		
		}
	         
		 
	
	
    
	
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 988; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */