 programa{
  
      funcao inicio(){
  	

 real distribuidor, imposto, fabrica, consumidor

 escreva ("Digite o preço de custo do veículo : ")
 leia(fabrica)

 distribuidor = fabrica + (fabrica*28/100)
 imposto = fabrica + (fabrica*45/100)
 consumidor = fabrica + distribuidor + imposto

 escreva("O custo com impostos será de : " +consumidor)
 
 
  

  
  


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