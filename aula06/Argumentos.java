/*programa que imprime na tela argumentos solicitados na hora de compilar o programa
mostrará na tela "você digitou + o texto que eu quiser colocar. 
Exemplo: ao chamar na linha de comando java Argumentos teste = imprimirá na tela = Você digitou teste" */

class Argumentos 
{
	public static void main (String [] args) //método main
	{
		System.out.println ("Você digitou " + args[0]);
		
	} 
}