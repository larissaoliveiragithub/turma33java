programa
{
	
	funcao inicio()
	{
	//Ler número e retornar se é par ou impar
	 inteiro numero
	 
	 escreva("Digite um número inteiro: ")
	 leia(numero)

	 	se(numero % 2 == 1){
	 		escreva("O número " +numero+ " é Impar.")
	     
	 	} senao se (numero % 2 ==0){
	     	escreva("O número "+numero+ "é Par")
	     }

	     senao se (numero  == 0 ){
          escreva("Número" +numero+"neutro") 
	     }
          senao(numero <0) {
          escreva("Número invalido")}
          
	       

}
}
	     
		     

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 487; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */