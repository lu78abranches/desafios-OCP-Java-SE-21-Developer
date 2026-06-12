package zoo.outroAnimal;
import zoo.model.Animal;

public class FlyingLion extends Animal {
	public static void main(String[] args) {
	FlyingLion an = new FlyingLion();
	an.especie = "leao voador";// não acessa porque o modificador de acesso é private, permitido somente para a classe mãe
	an.idade = 7;//não acessa porque o modificador é default permitido apenas para o mesmo pacote
	an.peso = 15.5;//  acessa sim, moficador protect, permito para mesmo pacote e subclasses.
	an.nome = "voador";// acessa sim, modificador public, acesso em toda a aplicação.
	}
}