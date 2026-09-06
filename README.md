# 📚 Sistema de Biblioteca

Sistema desktop em Java (Swing) para gerenciamento de uma biblioteca: cadastro de usuários, livros e funcionários, controle de empréstimos/devoluções e processamento de pagamento de funcionários com bônus por cargo.

---

## ⚙️ Como o sistema funciona

- **Usuários** podem pegar e devolver livros, respeitando um limite máximo de livros emprestados por usuário (`Biblioteca.MAX_LIVROS_POR_USUARIO`).
- **Livros** têm status de disponibilidade e um contador estático (`totalLivrosEmprestados`) compartilhado entre todas as instâncias.
- **Funcionários** são uma hierarquia abstrata (`Funcionario`) implementada por `Bibliotecario` e `Gerente`, cada um com sua própria regra de bônus (`calcularBonus()`) e forma de processar pagamento (`processarPagamento()`), via interface `Pagamento`.
- Os cadastros (`CadastroUsuarios`, `CadastroLivros`, `CadastroFuncionario`) funcionam como repositórios estáticos em memória (listas).
- A interface gráfica (Swing) é composta por várias telas: Home, Usuário, Livro, Funcionário, Empréstimo/Devolução, Consulta e Pagamento.

---

## 🧱 Estrutura de dados

| Classe | Responsabilidade |
|---|---|
| `Usuario` | Nome, idade e controle de livros emprestados |
| `Livro` | Título, autor, disponibilidade e total de empréstimos (estático) |
| `Funcionario` (abstrata) | Nome e salário; implementa `Pagamento` |
| `Bibliotecario` / `Gerente` | Subclasses de `Funcionario` com regras de bônus distintas (10% e 20%) |
| `Pagamento` (interface) | Contrato `processarPagamento(double valor)` |
| `Biblioteca` | Constantes globais (limite de livros, multa diária) |
| `CadastroUsuarios` / `CadastroLivros` / `CadastroFuncionario` | Repositórios estáticos (listas) |
| `GUI_Home`, `GUI_Usuario`, `GUI_Livro`, `GUI_Funcionario`, `GUI_Emprestimo`, `GUI_Consulta`, `GUI_Pagamento` | Telas Swing (NetBeans GUI Builder) |

---

## 🛠️ Tecnologias utilizadas

- Java (JDK)
- Swing (interface gráfica, gerada via NetBeans GUI Builder)
- Programação Orientada a Objetos (herança, classes abstratas, interfaces, polimorfismo)

---

## ✅ Pré-requisitos

- JDK instalado (8 ou superior)
- IDE com suporte a projetos Swing/NetBeans (recomendado: **Apache NetBeans**, por causa do GUI Builder)

---

## 📥 Como clonar o projeto

```bash
git clone <url-do-repositorio>
cd <pasta-do-projeto>
```

---

## ▶️ Instalação e execução

1. Abra o projeto na IDE (preferencialmente NetBeans, devido ao arquivo `.form`).
2. Aguarde o build automático das dependências (projeto Java puro, sem dependências externas).
3. Execute a classe `Main.java` para testar a lógica de negócio via console, **ou**
4. Execute `GUI_Home.java` para abrir a interface gráfica completa.

---

## 💻 Exemplo de uso

Pela interface gráfica:
1. Tela inicial (`GUI_Home`) com botões de navegação: Funcionários, Usuários, Pagamento, Empréstimo e Livro.
2. Cadastre um usuário e um livro nas respectivas telas.
3. Realize um empréstimo na tela de Empréstimo/Devolução.
4. Cadastre um funcionário (Bibliotecário ou Gerente) e processe o pagamento na tela de Pagamento.

Pelo console (`Main.java`):
```java
Funcionario f1 = new Bibliotecario("Carlos", 2000);
f1.mostrarDados();
f1.processarPagamento(f1.getSalario());
```

---

## 🚧 Status do projeto

Em desenvolvimento — funcionalidades básicas de cadastro e empréstimo implementadas; telas de consulta e devolução ainda com ações pendentes de finalização.

---

## 🗺️ Roadmap / Próximos passos

- [ ] Finalizar lógica de devolução e consulta de empréstimos (`GUI_Emprestimo`, `GUI_Consulta`)
- [ ] Persistir dados em banco de dados (atualmente em memória)
- [ ] Implementar cálculo e cobrança de multa por atraso (`MULTA_DIARIA`)
- [ ] Validações adicionais de formulário

---

## 👤 Autor

Luiz

## 🔗 Contato

- 📧 Email: [seu-email@exemplo.com]
- 💼 LinkedIn: [seu-linkedin]
- 📷 Instagram: [seu-instagram]
- 🐙 GitHub: [seu-github]

---

## 📄 Licença

Este projeto está sob a licença [MIT](LICENSE) — ajuste conforme necessário.
