programa
{
	
	funcao inicio()
	{
		real P, E, M
		escreva("Digite o peso do tomate: ")
		leia(P)
		E = (P - 50.00)
		M = (E * 4.00)
		se
		 (P> 50.00){
		 escreva("Você excedeu o peso dos tomates em: "+ E + "kg e pagará " +M+ "de multa ")
		 }
		senao{
		escreva("Você não excedeu o peso dos tomates, e não pagará multa")
			
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 122; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */