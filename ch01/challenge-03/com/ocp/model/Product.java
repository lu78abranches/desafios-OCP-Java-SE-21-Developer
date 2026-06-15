/*### **BLOCO 2 — Packages, Imports e Access Modifiers**

**Desafio 03 — Estrutura de pacotes**
Crie duas classes em pacotes diferentes:
- `com.ocp.model.Product` com um campo `name` e um método `describe()`
- `com.ocp.app.Main` que tenta usar `Product`

Faça isso de três formas separadas (três versões no mesmo desafio):
1. Usando `import` explícito
2. Usando o fully qualified name (sem import)
3. Usando wildcard import

> Pegadinha do exame:* a declaração `package` deve ser a **primeira linha** do arquivo, antes de qualquer `import`.*/

package com.ocp.model;

public class Product {

	public String nome;

	public void describe(){
	System.out.println("Classe Product");
	}
}
