programa
{
    inclua biblioteca Matematica-->mat

    funcao inicio()
    {

        cadeia nome
        real nota1, nota2, nota3, media
        real arredonda

        escreva("Qual nome do Aluno: ")
        leia (nome)
        escreva("Insira a Nota 1: ")
        leia (nota1)
        escreva("Insira a Nota 2: ")
        leia (nota2)
        escreva("Insira a Nota 3: ")
        leia (nota3)

        media=(nota1+nota2+nota3)/3
      
        arredonda = mat.arredondar(media,2)
        escreva("A média do aluno "+nome+ " é: " +arredonda)

    }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 230; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */