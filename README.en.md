# 📚 Library System

[🇧🇷 Português](README.md) | [🇺🇸 English](README.en.md)

![Status](https://img.shields.io/badge/status-in%20progress-yellow)
![Java](https://img.shields.io/badge/Java-8%2B-orange)
![License](https://img.shields.io/badge/license-MIT-blue)

Java (Swing) desktop application to manage a library: user, book and employee registration, loan/return control, and employee payment processing with role-based bonuses.

---

## 📬 Contact

- 📧 Email: [luizdayspring@gmail.com](mailto:luizdayspring@gmail.com)
- 📸 Instagram: [@lu1z_st](https://instagram.com/lu1z_st)
- 💼 LinkedIn: [luiz-paulo-soares](https://www.linkedin.com/in/luiz-paulo-soares/)
- 🐙 GitHub: [LuizPauloSoares](https://github.com/LuizPauloSoares)

---

## 🛠️ Technologies

- Java (JDK 8+)
- Swing (GUI built with the NetBeans GUI Builder)
- Object-Oriented Programming (inheritance, abstract classes, interfaces, polymorphism)

---

## ⚙️ How it works

- **Users** can borrow and return books, up to a maximum number of loans per user (`Biblioteca.MAX_LIVROS_POR_USUARIO`).
- **Books** have an availability status and a static counter (`totalLivrosEmprestados`) shared across all instances.
- **Employees** follow an abstract hierarchy (`Funcionario`) implemented by `Bibliotecario` and `Gerente`. Each has its own bonus rule (`calcularBonus()`) and payment handling (`processarPagamento()`) through the `Pagamento` interface.
- The registries (`CadastroUsuarios`, `CadastroLivros`, `CadastroFuncionario`) act as static in-memory repositories (lists).
- The GUI has several screens: Home, User, Book, Employee, Loan/Return, Search and Payment.

---

## 💡 What the code does

| Feature | Description |
|---|---|
| User registration | Stores name and age, tracks borrowed books |
| Book registration | Stores title, author and availability |
| Loans | Borrow books respecting the per-user limit |
| Employee registration | Librarian (10% bonus) or Manager (20% bonus) |
| Payment | Calculates salary + bonus and processes payment |

---

## 🧱 Data structure

| Class | Responsibility |
|---|---|
| `Usuario` | Name, age and borrowed-books control |
| `Livro` | Title, author, availability and total loans (static) |
| `Funcionario` (abstract) | Name and salary; implements `Pagamento` |
| `Bibliotecario` / `Gerente` | `Funcionario` subclasses with different bonus rules (10% and 20%) |
| `Pagamento` (interface) | Contract `processarPagamento(double valor)` |
| `Biblioteca` | Global constants (loan limit, daily fine) |
| `CadastroUsuarios` / `CadastroLivros` / `CadastroFuncionario` | Static repositories (lists) |
| `GUI_Home`, `GUI_Usuario`, `GUI_Livro`, `GUI_Funcionario`, `GUI_Emprestimo`, `GUI_Consulta`, `GUI_Pagamento` | Swing screens (NetBeans GUI Builder) |

---

## ✅ Prerequisites

- [JDK 8 or higher](https://adoptium.net/)
- An IDE with Swing support (recommended: **Apache NetBeans**, because of the GUI Builder and `.form` files)
- [Git](https://git-scm.com/)

Check your installation:

```bash
java -version
javac -version
git --version
```

---

## 📥 How to clone

```bash
git clone https://github.com/LuizPauloSoares/REPOSITORY-NAME.git
cd REPOSITORY-NAME
```

---

## 🚀 Installation and setup

1. Clone the repository (step above).
2. Open the project in your IDE (preferably NetBeans, due to the `.form` files).
3. Let the IDE finish building (pure Java project, no external dependencies).
4. Run `Main.java` to test the business logic via console, **or**
5. Run `GUI_Home.java` to open the full graphical interface.

---

## 🖼️ Usage examples

Through the GUI:
1. Home screen (`GUI_Home`) with navigation buttons: Employees, Users, Payment, Loan and Book.
2. Register a user and a book on their screens.
3. Make a loan on the Loan/Return screen.
4. Register an employee (Librarian or Manager) and process the payment on the Payment screen.

Through the console (`Main.java`):

```java
Funcionario f1 = new Bibliotecario("Carlos", 2000);
f1.mostrarDados();
f1.processarPagamento(f1.getSalario());
```

📷 *Screenshots: add here (`docs/screenshot1.png`).*

---

## 📌 Project status

🚧 **In progress** — basic registration and loan features are implemented; the search and return screens still have pending actions.

---

## 🗺️ Roadmap

- [ ] Finish return logic and loan search (`GUI_Emprestimo`, `GUI_Consulta`)
- [ ] Persist data in a database (currently in memory)
- [ ] Implement late-fee calculation and charging (`MULTA_DIARIA`)
- [ ] Additional form validations

---

## 📄 License

Distributed under the **MIT** license. See the `LICENSE` file for details.

---

## 👨‍💻 Author / Credits

**Luiz Paulo Soares**
