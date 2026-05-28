

---

## 🎯 Desafios — Capítulo 1: Utilizing Java OOP Approach - Part 1

Organize no seu repositório como `ch01/challenge-XX/`. Ao terminar cada um, volte aqui e me conta o que escreveu — eu reviso e aponto erros de compilação sem entregar a solução.

---

### **BLOCO 1 — Classes, Objetos e Ciclo de Vida**

**Desafio 01 — Blueprint e instâncias**
Crie uma classe `Vehicle` com os campos `brand` (String), `year` (int) e `fuelLevel` (double). Crie um método `refuel(double amount)` que soma ao `fuelLevel`. No método `main` de outra classe, instancie dois `Vehicle` distintos, atribua valores diferentes e chame `refuel` em apenas um deles. Imprima os campos de ambos.

> 🔍 *O que o exame vai cobrar:* diferença entre classe (blueprint) e objeto (instância), que campos de instâncias são independentes entre si.

---

**Desafio 02 — Referências e Garbage Collection**
Declare três variáveis de referência do tipo `Vehicle`. Faça com que duas delas apontem para o mesmo objeto. Depois, anule uma das referências. Adicione comentários inline (`//`) explicando em qual ponto cada objeto se torna elegível para garbage collection.

> 🔍 *Conceito-chave:* um objeto só é coletado quando **nenhuma** referência o aponta. O GC é automático e você não controla quando ocorre.

---

### **BLOCO 2 — Packages, Imports e Access Modifiers**

**Desafio 03 — Estrutura de pacotes**
Crie duas classes em pacotes diferentes:
- `com.ocp.model.Product` com um campo `name` e um método `describe()`
- `com.ocp.app.Main` que tenta usar `Product`

Faça isso de três formas separadas (três versões no mesmo desafio):
1. Usando `import` explícito
2. Usando o fully qualified name (sem import)
3. Usando wildcard import

> 🔍 *Pegadinha do exame:* a declaração `package` deve ser a **primeira linha** do arquivo, antes de qualquer `import`.

---

**Desafio 04 — Access Modifiers na prática**
Crie quatro classes (podem estar em arquivos/pacotes separados conforme necessário):
- `Animal` no pacote `zoo.model` com um campo `private`, um `default`, um `protected` e um `public`
- `Lion` no **mesmo pacote** que tenta acessar todos os quatro campos
- `Eagle` em **pacote diferente** que tenta acessar os mesmos campos
- `FlyingLion` em pacote diferente que **extends Animal** e tenta acessar os campos

Anote com comentários quais linhas **não compilam** e por quê, antes de testar.

> 🔍 *Regra do `protected`:* é acessível por subclasses **e** classes do mesmo pacote — mas atenção à diferença de acesso via herança vs. via instância.

---

### **BLOCO 3 — Fields, Methods, Overloading e Varargs**

**Desafio 05 — Static vs Instance**
Crie uma classe `Counter` com:
- Um campo `static` `totalCreated` incrementado a cada vez que um objeto é criado
- Um campo de instância `id` com o valor do `totalCreated` no momento da criação
- Um método `static getTotal()` e um método de instância `getId()`

No `main`, crie três instâncias e imprima o `id` de cada uma e o `totalCreated` final.

> 🔍 *Pergunta-armadilha:* você pode chamar um método `static` por meio de uma instância? Compila? O que o exame acha disso?

---

**Desafio 06 — Method Overloading**
Crie uma classe `Printer` com cinco versões sobrecarregadas do método `print`:
1. Recebe `int`
2. Recebe `double`
3. Recebe `String`
4. Recebe `int` e `String`
5. Recebe `String` e `int`

No `main`, chame cada versão e depois tente chamar `print(10, "hello")` e `print("hello", 10)` — são chamadas para métodos diferentes? Anote sua previsão antes de compilar.

> 🔍 *O que **não** define overloading:* só mudar o tipo de retorno. Tente criar dois métodos `print` que diferem apenas no retorno e observe o erro do compilador.

---

**Desafio 07 — Varargs**
Crie um método `sum(int... numbers)` que retorna a soma de todos os argumentos. Depois crie um segundo método `sum(int first, int... rest)`. No `main`:
- Chame `sum()` (zero argumentos)
- Chame `sum(5)`
- Chame `sum(1, 2, 3, 4, 5)`
- Tente chamar `sum(new int[]{1, 2, 3})`

> 🔍 *Regra do exame:* vararg deve ser **o último parâmetro** e só pode haver **um** por método. O que acontece se você tentar `sum(int... a, int... b)`?

---

### **BLOCO 4 — Construtores e Inicializadores**

**Desafio 08 — Construtores encadeados**
Crie uma classe `Car` com três construtores:
1. Sem parâmetros — define `brand = "Unknown"`, `year = 0`
2. Recebe `brand` — delega para o construtor sem parâmetros e depois sobrescreve `brand`
3. Recebe `brand` e `year`

Use `this(...)` para encadeamento. No `main`, instancie com cada construtor e imprima os campos.

> 🔍 *Regra crítica:* `this(...)` deve ser a **primeira instrução** do construtor. O que acontece se você colocar um `System.out.println` antes?

---

**Desafio 09 — Ordem de Inicialização**
Crie uma classe `Robot` com:
- Um campo `static String brand` inicializado com `"Generic"`
- Um bloco inicializador estático que imprime `"Static init"` e altera `brand`
- Um campo de instância `int serialNumber`
- Um bloco inicializador de instância que imprime `"Instance init"` e define `serialNumber`
- Um construtor que imprime `"Constructor"`

No `main`, crie **dois** objetos `Robot`. Antes de compilar, escreva no papel a ordem exata das mensagens que você espera ver.

> 🔍 *Ordem canônica do exame:* static fields/blocks (uma vez, em ordem textual) → instance fields/blocks (a cada `new`) → construtor.

---

### **BLOCO 5 — Nested Classes**

**Desafio 10 — Static Nested vs Inner Class**
Crie uma classe externa `Library` com:
- Uma **static nested class** `Catalog` com um método `list()`
- Uma **inner class** `Member` com um campo `name` e um método `borrow()`

No `main` (fora de `Library`), instancie `Catalog` **sem** criar uma instância de `Library`, e instancie `Member` **através** de uma instância de `Library`. Anote a sintaxe exata necessária para cada caso antes de tentar.

> 🔍 *Diferença central:* `static nested class` não precisa de instância do outer; `inner class` sim. `Library.Catalog c = new Library.Catalog()` vs. `Library lib = new Library(); Library.Member m = lib.new Member()`.

---

**Desafio 11 — Local e Anonymous Class**
Crie uma interface `Greeter` com um método `greet(String name)`. Dentro de um método `main`:
1. Implemente `Greeter` como **local class** (classe dentro do método)
2. Implemente `Greeter` como **anonymous class** (new Greeter() { ... })

Chame `greet("OCP Candidate")` para ambas.

> 🔍 *Para o exame:* anonymous classes são úteis mas não têm nome — logo, não podem ter construtores explícitos.

---

### **COMO USAR ESSES DESAFIOS**

- Escreva o código **sem rodar primeiro** — leia o compilador na cabeça
- Quando travar, releia a seção do capítulo correspondente
- Depois compile e compare o resultado com sua previsão
- Me traga o código ou o erro e eu faço a revisão

Qual desafio quer começar? 🚀