// Loja DevShoes 
// Integrantes: Matheus, Paulo, Larissa, Fernando, Beatriz e Leonardo.
// ###### GENERATION BRASIL 2021 TURMA 33 #######
// SISTEMA QUE SIMULA UM E-COMMERCE



programa{
	inclua biblioteca Util
	

		//vetor - produto
		cadeia nomeProduto[10]

          //vetor - código do produto
          cadeia codigoProduto[10], codigoEscolhido=" "


		//vetor - Carrinho
		cadeia carrinho[10]

		
		//vetor - Adicionado ao Carrinho
		inteiro qtaAdicionadoCarrinho[10]

		
		//vetor - valor do produto
		inteiro valorProduto[10] = {200, 150, 100, 50, 500, 1000, 30, 25, 40, 120 }
          
          //vetor - estoque do produto
          inteiro estoqueProduto[10]

		
		//VARIAVEIS ********************************************
		inteiro x=0 
		
		caracter valor, s = 's', n = 'n'
		real total = 0.0, totalFinal = 0.0
		caracter desejaComprar = 'x', desejaComprar2 = 'x', continuarCompra = 'x'// opcaoPgto= 'x'
		real valorTotal = 0.0, valorNota = 0.0, valorParcela, valorCompra = 0.0
		inteiro formaPagamento
		logico desejaAdicionarMais=falso
		caracter desejaAdicionar='x'
		inteiro fim=1
		//********************************************************

	funcao inicio(){
		nomeProduto[0] = "Tênis Nike        "
		nomeProduto[1] = "Tênis Adidas      "
		nomeProduto[2] = "Tênis Puma        "
		nomeProduto[3] = "Camisa Nike       "
		nomeProduto[4] = "Camisa Lacoste    "
		nomeProduto[5] = "Camisa Supreme    "
		nomeProduto[6] = "Meia Nike         "
		nomeProduto[7] = "Meia Adidas       "
		nomeProduto[8] = "Bola de futebol   "  
		nomeProduto[9] = "Blusa moleton Nike"

		codigoProduto [0] = "G2-1"
		codigoProduto [1] = "G2-2"	
		codigoProduto [2] = "G2-3"
		codigoProduto [3] = "G2-4"
		codigoProduto [4] = "G2-5"
		codigoProduto [5] = "G2-6"
		codigoProduto [6] = "G2-7"
		codigoProduto [7] = "G2-8"
		codigoProduto [8] = "G2-9"
		codigoProduto [9] = "G2-10"
		
		carrinho[0] = " "
		carrinho[1] = " "
		carrinho[2] = " "
		carrinho[3] = " "
		carrinho[4] = " "
		carrinho[5] = " "
		carrinho[6] = " "
		carrinho[7] = " "
		carrinho[8] = " "
		carrinho[9] = " "

		qtaAdicionadoCarrinho[0] = 0
		qtaAdicionadoCarrinho[1] = 0
		qtaAdicionadoCarrinho[2] = 0
		qtaAdicionadoCarrinho[3] = 0
		qtaAdicionadoCarrinho[4] = 0
		qtaAdicionadoCarrinho[5] = 0
		qtaAdicionadoCarrinho[6] = 0
		qtaAdicionadoCarrinho[7] = 0
		qtaAdicionadoCarrinho[8] = 0
		qtaAdicionadoCarrinho[9] = 0

		estoqueProduto[0] = 10
		estoqueProduto[1] = 10
		estoqueProduto[2] = 10
		estoqueProduto[3] = 10
		estoqueProduto[4] = 10
		estoqueProduto[5] = 10
		estoqueProduto[6] = 10
		estoqueProduto[7] = 10
		estoqueProduto[8] = 10
		estoqueProduto[9] = 10

			
			
			
			
			
			
			//*********************************************
			// APRESENTAÇÃO DA LOJA
			apresentacao()
			Util.aguarde(600)
			apresentacao2()
		


			//	FALTA DEFINIR	//enquanto(opcaoPgto=='x'ou opcaoPgto=='1' ou opcaoPgto=='2' ou opcaoPgto=='3')
			//******************************************************
			//************* AQUI COMEÇA O LAÇO 1 *****************

			escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
			escreva("\t\t\t\t     S/N: ")
			
			erp()
	}//@AQUI ACABA A FUNÇÃO MAIN


	funcao erp() {


			
			enquanto (desejaComprar != 'S' e desejaComprar != 's' e desejaComprar != 'N' e desejaComprar != 'n'){
				leia(desejaComprar)
				limpa()
				
			
				executarOperacao()
			
			}

					
		}//@AQUI TERMINA A FUNCAO ERP
		


	funcao executarOperacao(){
		//****************************************************************	
		escreva ("COD\t  Produto \t \tValor  Qnt\n")
		para(inteiro y=0; y<10; y++){
			se(desejaComprar == 's' ou desejaComprar == 'S'){
				//cabeçalho LISTA DE PRODUTOS
		       	para(y=0; y<10; y++)
     			
     			escreva(codigoProduto[y]+"\t" +nomeProduto[y]+"\t"+"R$ " +valorProduto[y]+ "\t"+estoqueProduto[y]+ "\n")
		      	escreva("\nExemplo: G2-1 - Tênis Nike \n")
				escreva("SELECIONE O CODIGO DO PRODUTO: ")
		      	}
		      	 senao{
					escreva("\n\nAté breve!")
					 //Finaliza o laço
					pare
				}
		      	
			}
		
			leia(codigoEscolhido)
			//***************** SELECIONE O CÓDIGO DO PRODUTO *******************

			para(x=0; x<10; ++x){
				
				se(codigoEscolhido == codigoProduto[x]){

					escreva ("COD "+codigoProduto[x]+"\t"+"PRODUTO: "+nomeProduto[x]+ +"VALOR R$"+valorProduto[x]+"\t"+"ESTOQUE:"+estoqueProduto[x]+"\n")
					escreva ("\n")
						
					escreva("ESCOLHA A QUANTIDADE : ")
					leia(qtaAdicionadoCarrinho[x])
					//***************** cabeçalho CARRINHO *******************
					se(qtaAdicionadoCarrinho[x] <= estoqueProduto[x] e carrinho[x]==" " e qtaAdicionadoCarrinho[x] >0){
						limpa()
						
						escreva ("■■■■■■■■■■■■■■■■■■■■■■■ Produtos Selecionado ■■■■■■■■■■■■■■■■■■■■■■■■\n")
						escreva ("Código: Produto:           Valor:     Quantidade:\n")
						carrinho[x]=codigoProduto[x]+"\t"+nomeProduto[x]+"R$ "+(valorProduto[x]*qtaAdicionadoCarrinho[x])+"\t   "+qtaAdicionadoCarrinho[x]+"\n"
						
						para(inteiro c=0; c<10; c++){
							se(carrinho[c] != " "){
								escreva (carrinho[c])
								total = valorProduto[x]*qtaAdicionadoCarrinho[x]
							}

						}

						
						
						totalFinal = total+totalFinal
						escreva("\n")
						escreva("\t\t\t\t\t\t Subtotal: R$"+totalFinal+"")
						
						escreva("\n\n\n\n\n")
						escreva("\t\t  CONTINUAR A COMPRANDO? S/N : ")
						leia(continuarCompra)
						limpa()					

							se (continuarCompra != 'S' e continuarCompra != 's' e continuarCompra != 'N' e continuarCompra != 'n'){
								escreva("Opção Inválida, escreve S ou N\n")
								escreva ("Continuar a compra ? S/N ")
								leia(continuarCompra)
								se(continuarCompra == 's' ou continuarCompra == 'S'){
										executarOperacao()
									}senao{escreva("Até breve!!")}
						} 	senao se (carrinho[0] != " " e carrinho[1] != " " e carrinho[2] != " " e carrinho[3] != " " e carrinho[4] != " " e carrinho[5] != " " e carrinho[6] != " " e carrinho[7] != " " e carrinho[8] != " " e carrinho[9] != " "){
								escreva("Carrinho cheio, finalize sua compra")
													
								escreva ("\nContinuar a compra ? S/N ")
								leia(continuarCompra)
								limpa()
							se(continuarCompra == 'n' ou continuarCompra == 'N'){
								limpa()
								resetFun()
							}
						} senao se(continuarCompra == 'S'  ou continuarCompra == 's') {
							executarOperacao()
						} senao {
							finalizarCompra()
						}
							
					}//@AQUI ACABA O SEGUNDO > SE
					senao se (qtaAdicionadoCarrinho[x] > estoqueProduto[x]) {
						limpa()
						escreva("\n\n Indisponível essa quantidade..\n\n")
						pare
					}
					senao se (carrinho[x]!=" ") {
						limpa()
						escreva("\n\nVocê já adicionou esse item no carrinho! \n")
						escreva ("Gostária acrescentar? S/N")
						leia(desejaAdicionar)
						se(desejaAdicionar == 's' ou desejaAdicionar == 'S'){
							escreva ("COD "+codigoProduto[x]+"\t"+"PRODUTO: "+nomeProduto[x]+ +"VALOR R$"+valorProduto[x]+"\t"+"ESTOQUE:"+estoqueProduto[x]+"\n")
							escreva ("\n")
								
							escreva("ESCOLHA A QUANTIDADE : ")
							leia(qtaAdicionadoCarrinho[x])
							se(qtaAdicionadoCarrinho[x] <= estoqueProduto[x] ou qtaAdicionadoCarrinho[x] >0){
								estoqueProduto[x] = estoqueProduto[x] - qtaAdicionadoCarrinho[x]
								executarOperacao()
								}
								senao {
									escreva("Não temos essa quantidade em estoque")
									
								}
						}senao{
							desejaAdicionarMais = falso
						}
						leia(continuarCompra)

						se(continuarCompra == 's' ou continuarCompra == 'S'){
							

							escreva ("COD "+codigoProduto[x]+"\t"+"PRODUTO: "+nomeProduto[x]+ +"VALOR R$"+valorProduto[x]+"\t"+"ESTOQUE:"+estoqueProduto[x]+"\n")
							escreva ("\n")
								
							escreva("ESCOLHA A QUANTIDADE : ")
							leia(qtaAdicionadoCarrinho[x])

							
						}
									
					}
					senao se (qtaAdicionadoCarrinho[x]<=0){
						limpa()
						escreva("\nEscolha ao menos um valor positivo\n\n")
						pare
						
					}	
				}//@AQUI ACABA O PRIMEIRO > SE	
	
				senao se (codigoEscolhido != codigoProduto[0] e codigoEscolhido != codigoProduto[1] e codigoEscolhido != codigoProduto[2] e codigoEscolhido != codigoProduto[3] e codigoEscolhido != codigoProduto[4] e codigoEscolhido != codigoProduto[5] e codigoEscolhido != codigoProduto[6] e codigoEscolhido != codigoProduto[7] e codigoEscolhido != codigoProduto[8] e codigoEscolhido != codigoProduto[9]) {
					limpa()
					escreva("Opção Inválida, escreve S ou N\n")
					escreva ("Continuar a compra ? S/N ")
					leia(continuarCompra)
					se(continuarCompra == 's' ou continuarCompra == 'S'){
							executarOperacao()
						}
				}senao{
					
						
				}
			}

			
		}//@AQUI ACABA A FUNÇÃO  #executarOperacao

		funcao finalizarCompra(){
			formaPagamentoFun()
			escreva("\n\n")
			escreva("CARRINHO\n\n")
			escreva ("COD\t  Produto \t   Valor\t    Qnt\n")
			carrinho[x]=codigoProduto[x]+"\t"+nomeProduto[x]+"R$ "+(valorProduto[x]*qtaAdicionadoCarrinho[x])+"\t   "+qtaAdicionadoCarrinho[x]+"\n"

			
			para(inteiro c=0; c<10; c++){
				se(carrinho[c] != " "){
					escreva (carrinho[c])
					total = valorProduto[x]*qtaAdicionadoCarrinho[x]
				}
			
			}
			escreva("\n")
			escreva("Subtotal: R$ "+totalFinal+"\t\t Valor da nota: R$ "+valorTotal)
			escreva("\n\n")

			escreva("FINALIZAR COMPRA AGORA? (1) SIM ou (2) NAO: \n")
			leia(fim)
			
			se(fim==1){
				estoqueProduto[x]= estoqueProduto[x] - qtaAdicionadoCarrinho[x] 
				apresentacao()
				Util.aguarde(800)
				apresentacao2()
				resetFun()
			
			}senao{
				escreva("FINALIZAR COMPRA AGORA?\n")
				leia(fim) 
			}

		}

		funcao formaPagamentoFun(){
			escreva("Selecione a forma de pagamento?\n")
			escreva("\n1 - DEBITO \n2 - CREDITO \n3 - PARCELADO (2X)")
			escreva("\nPagamento: ")
			leia(formaPagamento)
			limpa()

			se(formaPagamento ==1) {
			valorCompra = totalFinal * (10.00/100.00)
			valorTotal = totalFinal - valorCompra
			valorNota = valorTotal * (9.00/100.00)
			escreva("ESPELHO DA NOTA\n\n")
			escreva("O valor total da compra é de: R$ " ,valorTotal, " (Desconto 10%)	")
		
		
	
			} senao se(formaPagamento ==2){
			valorCompra = totalFinal * (10.00/100.00)
			valorTotal = totalFinal + valorCompra
			valorNota = valorTotal * (9.00/100.00)
			escreva("O valor total da compra é de: R$ " ,valorTotal, " (Acréscimo 10%)")
	
			} senao se(formaPagamento ==3){
			valorCompra = totalFinal * (15.00/100.00)
			valorTotal = totalFinal + valorCompra
			valorNota = valorTotal * (9.00/100.00)
			

			valorParcela = valorTotal / 2
			escreva("O valor total da compra é de: R$ " ,valorTotal)
			escreva("\nA conta totalizou 2 parcelas de: R$ " ,valorParcela)

			}
			escreva("\nO imposto é de: " ,valorNota, " (9%) ")
			escreva("\n")

			

		}//aqui acaba a funcao pagamento








			
			//AQUI SÃO AS FUNÇÕES ÚTEIS

			funcao resetFun(){
			escreva("\t\t\t DESEJA FAZER COMPRAS? DIGITE.. \n")
			escreva("\t\t\t\t     S/N: ")
				leia(desejaComprar2)
				limpa()
				
			
				executarOperacao()
			}










			

			// Função do bloco - Apresentacao 1
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
			// Função do bloco - Apresentacao 2
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


			
 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 9587; 
 * @PONTOS-DE-PARADA = 16, 24;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */