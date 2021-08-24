programa
{
	
	funcao inicio()
	{
		real C, N, E, valorTotal, valorExcesso, valorFinal
		escreva("Digite código do Funcionário ")
		leia(C)
		escreva("Horas trabalhadas: ")
		leia(N)
         se (N < 50.00){
	     valorTotal = (N*10.00)
	     escreva("Funcionário" +C+ "Seu salário será de: " +valorTotal+ "reais. Você não possui horas excedentes ")
	     }
	     senao{
	     	E = (N - 50.00)
	     	valorExcesso = (E*20.00)
	     	valorTotal = (50*10.00)
	     	valorFinal = (valorTotal + valorExcesso)
	     	escreva("Funcionário" +C+ "Seu salário será de: " +valorTotal+ "reais. Você possui horas excedentes no valor de" +valorExcesso)
	     	
	     }
	     	
	     }
	
	
	
	
	
	
	
	
	}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 90; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */