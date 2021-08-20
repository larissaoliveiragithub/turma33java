programa 
{
	
	funcao inicio()
	{

	inteiro anoNascimento
	inteiro mesNascimento
	inteiro diaNascimento
	inteiro idade
	
		escreva("Digite o dia do seu nascimento: ")
		leia(anoNascimento)
		escreva("Digite o mês do seu nascimento: ")
		leia(mesNascimento)
		escreva("Digite o dia do seu nascimento: ")
		leia(diaNascimento)
		idade = (anoNascimento * 365) + (mesNascimento * 30) + diaNascimento
		escreva("A sua idade em dias é de:  " + idade)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 384; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */