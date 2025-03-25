# Herança em Java

Este projeto demonstra o uso de herança em Java, implementando uma hierarquia de classes que representam pessoas e suas especializações, como alunos, professores e funcionários.

## Estrutura do Projeto

O projeto está organizado da seguinte forma:


### Classes

- **Pessoa**: Classe base que contém atributos comuns como `nome`, `cpf` e `data_nascimento`.
- **Aluno**: Subclasse de `Pessoa` que adiciona o atributo `matricula`.
- **Professor**: Subclasse de `Pessoa` que adiciona os atributos `disciplina` e `salario`.
- **Funcionario**: Subclasse de `Pessoa` que adiciona os atributos `cargo`, `salario` e `data_admissao`.

### Classe Principal

A classe principal `App` contém o método `main`, que pode ser usado para testar as funcionalidades das classes.

## Configuração do Ambiente

Este projeto utiliza as configurações do Visual Studio Code para projetos Java. Certifique-se de que o arquivo `.vscode/settings.json` está configurado corretamente:

```json
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
