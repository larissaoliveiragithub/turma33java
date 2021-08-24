programa
{
	
	funcao inicio()
	{
		real indicePoluicao
		escreva("Digite o índice de poluição: ")
		leia(indicePoluicao)

           	se(indicePoluicao >= 0.3 e indicePoluicao <0.4){
           escreva("\n Suspeder atividades das empresas do grupo 1 ")
           }
		
		senao se (indicePoluicao >=0.4 e indicePoluicao <0.5){
          escreva("\n Suspeder atividades das empresas do grupo 1 e 2 ")
		}
		
		senao se (indicePoluicao >=0.5){
		escreva("\n Suspeder atividades das empresas do grupo 1, 2 e 3 ")
	     }
	     
	     senao{
	     escreva("Indice menor que 0,3, todas empresas podem continuar as atividades. ")	
	     	
}
}		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 636; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */