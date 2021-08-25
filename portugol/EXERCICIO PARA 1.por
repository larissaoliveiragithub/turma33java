programa
{
	
	funcao inicio()
	{ 
	     inteiro numeroFilhos
		real totalSalario=0.0, mediaFilhos, valorSalario, maiorSalario=0.0, percSalario, mediaSalario=0.0, menorSalario=0.0, totalFilhos=0
		
		para(inteiro x=1; x<=20; x++){
		escreva("Digite o salário do participante "+x+": ")
		leia(valorSalario)
		escreva("Digite o número de de filhos do participante "+x+": ")
		leia(numeroFilhos)
	totalFilhos=totalFilhos+numeroFilhos
		se(valorSalario>maiorSalario){
			maiorSalario = valorSalario
		}
			
			totalSalario = totalSalario + valorSalario
			se(valorSalario<=100){
			menorSalario = menorSalario+1
		}}

              menorSalario=totalSalario/20.00
              escreva("\nA média de salário é: "+mediaSalario)
              mediaFilhos=totalFilhos/20.00
              escreva("\nA média de filhos é: "+mediaFilhos)
              escreva("\nO maior salário é: "+maiorSalario)
              percSalario=(menorSalario/20*100)
              escreva("\n1A quantidade de pessoas com salário menor que R$100,00 é: "+percSalario+"%")
			
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 726; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */