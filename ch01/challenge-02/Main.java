/*BLOCO 1 — Classes, Objetos e Ciclo de Vida
Desafio 02 — Referências e Garbage Collection
Declare três variáveis de referência do tipo Vehicle. Faça com que duas delas apontem para o mesmo objeto. Depois, anule uma das referências. Adicione comentários inline (//) explicando em qual ponto cada objeto se torna elegível para garbage collection.

🔍 Conceito-chave: um objeto só é coletado quando nenhuma referência o aponta. O GC é automático e você não controla quando ocorre./*

public class Main {
	public static void main(String [] args) {


	Vehicle varA = new Vehicle();
	Vehicle varB = varA;
	Vehicle varC = varA;
	varA = null; // not yet eligible because varB and varC points to the varA
	varB = null; // not yet eligible because varC points to the varA 
	varC = null; // yes now eligible because no variable points to the varA.

	}
}

	
	