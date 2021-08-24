programa
{
	
	funcao inicio()
	{
		real base ,altura, area

		escreva("Digite o valor da base: ")
		leia(base)
		escreva("Digite o valor da altura: ")
		leia(altura)
	
		area =(base*altura)
		se(base<=0){
		escreva("Base inválida/negativa")
		}
		se(altura<0){
		escreva("Altura inválida/negativa")
		}
          senao{
          	escreva("O valor da área é: "+area)
          }
          
         
         	
         
         	
         }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 63; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */