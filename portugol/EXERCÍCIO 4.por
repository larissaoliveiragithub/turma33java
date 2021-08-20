      programa
{
	
inclua biblioteca Matematica
--> Mat
	funcao inicio()
	{
 
        real a, b, c, d, r, s

        
        escreva("Digite o numero de A: ")
        leia(a)
        escreva("Digite o numero de B: ")
        leia(b)
        escreva("Digite o numero de C: ")
        leia(c)

        r = Mat.potencia((a+b), 2)
        escreva("\n O valor de r é: " + r)
        
        s = Mat.potencia((b+c), 2)
        escreva("\n O valor de S é: " + s)
        
        d = (r+s)/2
        escreva("\n O valor de D é: " + d)

        
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 175; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */