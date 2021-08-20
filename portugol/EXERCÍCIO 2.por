programa
{
	
	funcao inicio()
	{
		inteiro idadePessoaDias
		inteiro anos
		inteiro meses
		inteiro dias

	escreva("Informe a Idade da pessoas em dias:  ")
		leia(idadePessoaDias)
		 anos = idadePessoaDias / 365
	meses = (idadePessoaDias% 365) / 30
	dias = (idadePessoaDias% 365)% 30
	
	escreva ("\n Anos:" + anos)
	escreva ("\n Meses:" + meses)
	escreva ("\n Dias:" + dias)

}}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 379; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */