# 🎓 p.o.o-fatec

Exercícios da disciplina de **Programação Orientada a Objetos** da FATEC — cada pasta é um exercício independente focado em um conceito: encapsulamento, herança, polimorfismo, classes abstratas e construtores.

_Exercises from the **Object-Oriented Programming** course at FATEC — each folder is a standalone exercise focused on one concept: encapsulation, inheritance, polymorphism, abstract classes and constructors._

[![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://adoptium.net/)
![Status](https://img.shields.io/badge/status-educational-informational?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-brightgreen?style=for-the-badge)

---

## 📖 Sobre — _About_

Repositório de exercícios práticos de POO, sem build tool e sem dependências externas: cada
pasta tem um `src/` com a classe principal e pode ser executada direto pela IDE. O foco é
**modelar domínios** (aluno, funcionário, professor, equipe, ponto cartesiano) e praticar as
relações entre classes.

_Repository of practical OOP exercises, with no build tool and no external dependencies: each
folder has a `src/` with a main class and can be run straight from the IDE. The focus is on
**modelling domains** (student, employee, teacher, team, cartesian point) and practising the
relationships between classes._

## 🧩 Exercícios — _Exercises_

| Pasta | Conceito | Descrição — _Description_ |
|---|---|---|
| [`Primeiro/`](./Primeiro) | Encapsulamento | Classe `Aluno` com RA, notas e `calcularMedia()` — construtor, getters/setters e `toString()`. _`Aluno` class with RA, grades and `calcularMedia()` — constructor, getters/setters and `toString()`._ |
| [`exercicio_01/`](./exercicio_01) | Encapsulamento + validação | `Funcionario` com salário/hora e horas trabalhadas; os setters **rejeitam valores inválidos** (`nome` vazio, salário ≤ 0) e `addHorasTrabalhadas()` acumula. _`Funcionario` with hourly wage and hours worked; setters **reject invalid values** (empty name, wage ≤ 0) and `addHorasTrabalhadas()` accumulates._ |
| [`heranca/`](./heranca) | Herança | `Funcionario extends Pessoa` usando campos `protected` e `super()` nos construtores. _`Funcionario extends Pessoa` using `protected` fields and `super()` in constructors._ |
| [`faculdade/`](./faculdade) | Herança + Polimorfismo | `Pessoa` **abstrata** com `calcularSalario()` e `zerarMes()` abstratos, implementados por `Funcionario` (faltas, adicional fixo, R$ 100 por filho) e `Professor` (salário por aula). `hollerith()` é sobrescrito e complementado com `super`. _**Abstract** `Pessoa` with abstract `calcularSalario()` and `zerarMes()`, implemented by `Funcionario` (absences, fixed bonus, R$ 100 per child) and `Professor` (wage per class). `hollerith()` is overridden and extended with `super`._ |
| [`tecelagem/`](./tecelagem) | Classes abstratas + Polimorfismo | `Funcionario` abstrata com subclasses `Administrativo`, `Vendedor` e `Producao`, cada uma com seu cálculo de salário; `Equipe` agrega um array e gera relatórios por categoria via `instanceof`. _Abstract `Funcionario` with `Administrativo`, `Vendedor` and `Producao` subclasses, each with its own salary calculation; `Equipe` aggregates an array and produces per-category reports via `instanceof`._ |
| [`cartesiano/`](./cartesiano) | Construtores + Geometria | `Ponto` (3 construtores: default, parametrizado e **de cópia**) com `escale()`, `desloc()`, `distance()` e `assign()`; `Segmento` com `length()`, `isValid()` e `midPoint()`. _`Ponto` (3 constructors: default, parameterized and **copy**) with `escale()`, `desloc()`, `distance()` and `assign()`; `Segmento` with `length()`, `isValid()` and `midPoint()`._ |
| [`fibonacci/`](./fibonacci) | Vetores | Sequência de Fibonacci iterativa em `long[100]`, sem recursão. _Iterative Fibonacci sequence in `long[100]`, no recursion._ |
| [`Zoo/`](./Zoo) | — | Apenas o esqueleto de `application/Program.java`, sem implementação. _Only the `application/Program.java` skeleton, no implementation._ |

Também incluídos: `Iniciando no Netbeans - ApostilaPOO.pdf` (apostila da disciplina) e
`exTecelagem.doc` (enunciado do exercício de tecelagem).

_Also included: `Iniciando no Netbeans - ApostilaPOO.pdf` (course handout) and `exTecelagem.doc`
(the weaving exercise statement)._

## 🛠️ Stack — _Tech Stack_

| Componente | Detalhe |
|---|---|
| Linguagem | Java 25 — sem build tool, sem dependências externas |
| Organização | Pastas independentes, cada uma com `src/` (layout de projeto NetBeans/IDE) |
| Entrada | Classes `Main` / `Program` com método `main` |
| Code style | Códigos e nomes de classes em português |

## 📁 Estrutura — _Project Structure_

```
p.o.o-fatec/
├── Primeiro/           # encapsulamento — Aluno
│   └── src/{Aluno,Main}.java
├── exercicio_01/       # encapsulamento + validação — Funcionario
│   └── src/{Main.java,entities/Funcionario.java}
├── heranca/            # herança — Pessoa, Funcionario
│   └── src/{Pessoa,Funcionario,Main}.java
├── faculdade/          # classe abstrata + polimorfismo — Pessoa, Funcionario, Professor
│   └── src/{Pessoa,Funcionario,Professor,Program}.java
├── tecelagem/          # factory de cargos — Funcionario, Administrativo, Vendedor, Producao, Equipe
│   └── src/application/Program.java
│   └── src/entities/*.java
├── cartesiano/         # geometria — Ponto, Segmento
│   └── src/{Ponto,Segmento,Program}.java
├── fibonacci/          # vetores — Program
│   └── src/Program.java
└── Zoo/                # esqueleto vazio
    └── src/application/Program.java
```

## 🚀 Como Executar — _How to Run_

Sem build tool — abra a pasta do exercício na sua IDE e execute a classe `Main` (ou `Program`).
Os exercícios `heranca/`, `tecelagem/` e `cartesiano/` usam `void main()` sem `public static`,
recurso do **Java 25** — confirme que a IDE está no level 25.

_No build tool — open the exercise folder in your IDE and run the `Main` (or `Program`) class.
The `heranca/`, `tecelagem/` and `cartesiano/` exercises use `void main()` without
`public static`, a **Java 25** feature — make sure the IDE language level is 25._

## 🚨 Limitações Conhecidas — _Known Limitations_

- **`Zoo/` está vazio** — só existe `application/Program.java` sem corpo. É um esqueleto deixado
  pela IDE, sem exercício implementado.
  _**`Zoo/` is empty** — only an empty `application/Program.java` exists, an IDE skeleton with no
  exercise implemented._
- **`heranca/src/Main.java` é boilerplate da IntelliJ** — imprime "Hello and welcome" e um loop de
  1 a 5. As classes `Pessoa` e `Funcionario` estão implementadas, mas não são exercitadas pelo
  `main`.
  _**`heranca/src/Main.java` is IntelliJ boilerplate** — it prints "Hello and welcome" and a 1-to-5
  loop. The `Pessoa` and `Funcionario` classes are implemented but not exercised by `main`._
- **Sem build tool, testes ou CI** — os exercícios são executados manualmente pela IDE.
  _No build tool, tests or CI — the exercises are run manually from the IDE._
- **`heranca/` e `faculdade/` têm modelos de domínio sobrepostos** — `Funcionario` aparece em três
  pastas com atributos diferentes. É intencional: cada exercício isola um conceito.
  _**`heranca/` and `faculdade/` have overlapping domain models** — `Funcionario` appears in three
  folders with different attributes. This is intentional: each exercise isolates one concept._

## 📄 Licença — _License_

[MIT](./LICENSE) — Copyright (c) 2026 0utLunar

_MIT — Copyright (c) 2026 0utLunar_
