# 📚 Sistema de Biblioteca

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

![Status](https://img.shields.io/badge/status-em%20andamento-yellow)
![Java](https://img.shields.io/badge/Java-8%2B-orange)
![License](https://img.shields.io/badge/license-MIT-blue)

Sistema desktop em Java (Swing) para gerenciamento de uma biblioteca: cadastro de usuários, livros e funcionários, controle de empréstimos/devoluções e processamento de pagamento de funcionários com bônus por cargo.

---

## 📬 Contato

- 📧 Email: [luizdayspring@gmail.com](mailto:luizdayspring@gmail.com)
- 📸 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 💼 LinkedIn: [luiz-paulo-soares](https://www.linkedin.com/in/luiz-paulo-soares/)
- 🐙 GitHub: [LuizPauloSoares](https://github.com/LuizPauloSoares)

---

## 🛠️ Tecnologias utilizadas

- Java (JDK 8+)
- Swing (interface gráfica, gerada via NetBeans GUI Builder)
- Programação Orientada a Objetos (herança, classes abstratas, interfaces, polimorfismo)

---

## ⚙️ Como o sistema funciona

- **Usuários** podem pegar e devolver livros, respeitando um limite máximo de livros emprestados por usuário (`Biblioteca.MAX_LIVROS_POR_USUARIO`).
- **Livros** têm status de disponibilidade e um contador estático (`totalLivrosEmprestados`) compartilhado entre todas as instâncias.
- **Funcionários** são uma hierarquia abstrata (`Funcionario`) implementada por `Bibliotecario` e `Gerente`, cada um com sua própria regra de bônus (`calcularBonus()`) e forma de processar pagamento (`processarPagamento()`), via interface `Pagamento`.
- Os cadastros (`CadastroUsuarios`, `CadastroLivros`, `CadastroFuncionario`) funcionam como repositórios estáticos em memória (listas).
- A interface gráfica tem várias telas: Home, Usuário, Livro, Funcionário, Empréstimo/Devolução, Consulta e Pagamento.

---

## 💡 O que o código faz

| Funcionalidade | Descrição |
|---|---|
| Cadastro de usuários | Guarda nome e idade, controla livros emprestados |
| Cadastro de livros | Guarda título, autor e disponibilidade |
| Empréstimos | Empresta livros respeitando o limite por usuário |
| Cadastro de funcionários | Bibliotecário (bônus de 10%) ou Gerente (bônus de 20%) |
| Pagamento | Calcula salário + bônus e processa o pagamento |

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

## ✅ Pré-requisitos

- [JDK 8 ou superior](https://adoptium.net/)
- IDE com suporte a Swing (recomendado: **Apache NetBeans**, por causa do GUI Builder e dos arquivos `.form`)
- [Git](https://git-scm.com/)

Verifique a instalação:

```bash
java -version
javac -version
git --version
```

---

## 📥 Como clonar o projeto

```bash
git clone https://github.com/LuizPauloSoares/NOME-DO-REPOSITORIO.git
cd NOME-DO-REPOSITORIO
```

---

## 🚀 Instalação e configuração

1. Clone o repositório (passo acima).
2. Abra o projeto na IDE (preferencialmente NetBeans, devido aos arquivos `.form`).
3. Aguarde o build automático (projeto Java puro, sem dependências externas).
4. Execute `Main.java` para testar a lógica de negócio via console, **ou**
5. Execute `GUI_Home.java` para abrir a interface gráfica completa.

---

## 🖼️ Exemplos de uso

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

📷 *Screenshots: adicione aqui (`docs/screenshot1.png`).*

---

## 📌 Status do projeto

🚧 **Em andamento** — cadastro e empréstimo básicos implementados; telas de consulta e devolução ainda com ações pendentes.

---

## 🗺️ Roadmap / Próximos passos

- [ ] Finalizar lógica de devolução e consulta de empréstimos (`GUI_Emprestimo`, `GUI_Consulta`)
- [ ] Persistir dados em banco de dados (atualmente em memória)
- [ ] Implementar cálculo e cobrança de multa por atraso (`MULTA_DIARIA`)
- [ ] Validações adicionais de formulário

---

## 📄 Licença

Distribuído sob a licença **MIT**. Veja o arquivo `LICENSE` para mais detalhes.

---

## 👨‍💻 Autor / Créditos

**Luiz Paulo Soares**
