package zoo.outroAnimal;
import zoo.model.Animal;

public class Eagle {
	public static void main(String[] args) {
	Animal eagle = new Animal();
	eagle.especie = "Ave";// não acessa porque o modificador de acesso é private, permitido somente para a classe mãe
	eagle.idade = 7;//não acessa porque o modificador é default permitido apenas para o mesmo pacote
	eagle.peso = 15.5;// não acessa, moficador protect, permito para mesmo pacote e subclasses.
	eagle.nome = "Ligeiro";// acessa sim, modificador public, acesso em toda a aplicação.
	}
}