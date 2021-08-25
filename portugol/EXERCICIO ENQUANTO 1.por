programa
{
	
	funcao inicio()
	{
		real somatoria=0.0, media, total=0.0, numero=0.0
		enquanto(numero>=0){
		escreva("Digite um número a ser somado: ")
		leia(numero)
		se(numero<0){
			
             	  pare}
			
		somatoria = somatoria + numero
		total = total + 1
             
		}
		
            escreva("A somatória dos números é: "+somatoria)
            media=somatoria/total
            escreva("\nA média dos valores é: "+media)
            escreva("\nO total de números é: "+total)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 250; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */