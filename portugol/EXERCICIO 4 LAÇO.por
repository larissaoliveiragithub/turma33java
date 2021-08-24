programa
{
	
	funcao inicio(){  

	inteiro numero

	escreva("Digite um número: ")
	leia(numero)

	se(numero ==0){
	escreva("Número neutro" )	
	}   
     senao se(numero <0 e numero %2 ==0){
     escreva("O número " + numero + " é Par e Negativo")
     }
     senao se(numero >0 e numero %2 ==1){
     escreva("O número " + numero + " é Impar e Positivo")	
     }
     senao se(numero<0 e numero%2 ==0){
     escreva("O número " + numero + " é Par e Positivo")	
     }
     senao se(numero>0 e numero %2 ==1){
     escreva("O número " + numero + "é Impar e Negativo")
     }
     



	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 357; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */