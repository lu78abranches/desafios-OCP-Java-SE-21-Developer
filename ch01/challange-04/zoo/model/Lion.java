package zoo.model;
import zoo.model.Animal;

public class Lion {
	public static void main(String[] args) {
	Animal lion = new Animal();
	lion.especie = "felino";// não acessa porque o modificador de acesso é private, permitido somente para a classe mãe
	lion.idade = 10;//acessa sim porque o modificador é default permitido apenas para o mesmo pacote
	lion.peso = 100.5;// acessa sim, moficador protect, permito para mesmo pacote e subclasses.
	lion.nome = "Juba";// acessa sim, modificador public, acesso em toda a aplicação.
	}
}