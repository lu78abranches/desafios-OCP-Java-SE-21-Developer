🎯 Desafios — Capítulo 2: Utilizing Java OOP Approach - Part 2

BLOCO 1 — Variables, Scope e var
Desafio 01 — Escopo de variáveis

Crie uma classe ScopeDemo com um método demonstrate() que contenha:

Um campo de instância int instanceVar = 10
Uma variável local int localVar = 20
Um bloco if que declare int blockVar = 30
Tente imprimir blockVar fora do if
Tente imprimir localVar dentro de outro método otherMethod()

Anote quais linhas não compilam e por quê antes de testar.

🔍 Conceito: cada par de {} define um escopo. Variável declarada dentro não existe fora.


Desafio 02 — var e suas restrições

Crie uma classe VarDemo e tente usar var em cinco situações:

Variável local com inicialização → var name = "Java"
Campo de instância → var field = 42
Parâmetro de método → void method(var x)
Sem inicialização → var x;
Inicializado com null → var obj = null

Anote quais compilam e quais não antes de testar.

🔍 Regra central: var só funciona em variável local inicializada na mesma linha com tipo inferível.


BLOCO 2 — Herança e Abstract Classes
Desafio 03 — Hierarquia com abstract

Crie uma hierarquia:

Classe abstrata Shape com campo color, método concreto describe() que imprime a cor, e método abstrato area()
Classe concreta Circle com campo radius que implementa area() retornando Math.PI * radius * radius
Classe concreta Rectangle com campos width e height que implementa area()

No main, crie instâncias de Circle e Rectangle, chame describe() e area() em ambas. Tente também fazer new Shape() e anote o erro.

🔍 Regra: classe abstrata não pode ser instanciada. Subclasse concreta deve implementar todos os métodos abstratos.


Desafio 04 — super() e construtores herdados

Na mesma hierarquia do Desafio 03, adicione um construtor em Shape que recebe color e imprime "Shape created". Force Circle e Rectangle a chamarem esse construtor via super(color). No main, crie os objetos e observe a ordem das mensagens.

🔍 Regra do exame: super(...) deve ser a primeira linha do construtor filho — igual ao this(...) do cap1.


BLOCO 3 — Interfaces
Desafio 05 — Interface com default e static

Crie uma interface Printable com:

Método abstrato print()
Método default printTwice() que chama print() duas vezes
Método static info() que imprime "Printable interface"

Crie duas classes Document e Photo que implementam Printable com mensagens diferentes. No main:

Chame printTwice() em ambas
Chame Printable.info() (via interface, não via instância)
Tente chamar obj.info() via instância e anote o resultado


Desafio 06 — Implementando múltiplas interfaces

Crie as interfaces Flyable com método fly() e Swimmable com método swim(). Crie uma classe Duck que implementa ambas. Crie também uma classe Fish que implementa só Swimmable.
No main, demonstre que:

Duck pode ser referenciada como Flyable, como Swimmable e como Duck
Fish pode ser referenciada como Swimmable mas não como Flyable


🔍 Conceito central de polimorfismo: o tipo da referência determina o que você pode chamar, não o objeto real.


BLOCO 4 — Polimorfismo, Casting e instanceof
Desafio 07 — Override e regras

Crie uma classe Animal com método sound() que imprime "...". Crie subclasses Dog e Cat que fazem override de sound(). Depois crie um array Animal[] animals com instâncias de Dog e Cat e percorra chamando sound() em cada um.
Depois tente criar um método em Dog com a assinatura abaixo e anote o erro:
java// Tenta fazer override diminuindo a visibilidade
void sound() { }  // Animal.sound() era public

🔍 Regra do exame: override não pode reduzir o modificador de acesso.


Desafio 08 — Casting e instanceof

Com a hierarquia Animal → Dog → Cat:
javaAnimal a = new Dog();  // upcasting implícito
Dog d = (Dog) a;       // downcasting explícito — compila e roda?
Cat c = (Cat) a;       // compila? roda?
Antes de testar, escreva sua previsão. Depois reescreva usando instanceof para fazer o cast com segurança:
javaif (a instanceof Dog) { ... }
E por fim use pattern matching com instanceof (Java 16+):
javaif (a instanceof Dog dog) {
    dog.sound();
}

BLOCO 5 — Encapsulamento e Imutabilidade
Desafio 09 — Encapsulamento com getters e setters

Crie uma classe BankAccount com:

Campo private double balance
Campo private String owner
Getter para ambos
Setter para balance que rejeita valores negativos (lança IllegalArgumentException ou imprime erro)
Sem setter para owner (imutável após construção)


🔍 Encapsulamento real: não é só colocar private e gerar getters/setters cegamente. É controlar o que entra e o que sai.


Desafio 10 — Objeto imutável

Crie uma classe ImmutablePoint que represente um ponto (x, y) completamente imutável:

Campos private final int x e private final int y
Apenas construtor com os dois valores
Apenas getters, sem setters
Método translate(int dx, int dy) que não modifica o objeto atual, mas retorna um novo ImmutablePoint

No main, demonstre que o objeto original não muda após translate.

🔍 Modelo do exame: String em Java é imutável exatamente assim. Todo método que "altera" uma String na verdade retorna uma nova.


BLOCO BÔNUS — Sealed Classes
Desafio 11 — Sealed class

Crie uma sealed class Vehicle que permita apenas Car e Motorcycle como subclasses. Declare Car como final e Motorcycle como non-sealed. Tente criar uma terceira subclasse Truck e anote o erro do compilador.

🔍 Sealed classes — regras:

Subclasses devem estar no mesmo pacote (ou módulo)
Cada subclasse deve ser final, sealed ou non-sealed
non-sealed abre a hierarquia novamente


