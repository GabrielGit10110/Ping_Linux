# 🌐 Ping Linux

Aplicação Java que testa a conectividade com servidores populares usando o comando ping do Linux, executando testes simultâneos em threads separadas.

## 🎯 Funcionalidades

- Executa testes de ping simultâneos para UOL, Terra e Google
- Exibe resultados em tempo real de cada iteração
- Calcula e mostra o tempo médio de resposta para cada servidor
- Valida se o sistema operacional é Linux antes de executar
- Interface clara com identificação visual dos servidores

## ⚠️ Pré-requisitos

- **Sistema Operacional**: Linux (obrigatório)
- JDK 8 ou superior
- Git instalado
- Permissão para executar comandos ping

## 🚀 Como executar

1. Clone o repositório:
```bash
git clone https://github.com/GabrielGit10110/PingTester.git
```

2. Acesse o diretório do projeto:
```bash
cd PingTester
```

3. Compile o código:
```bash
javac -d bin src/*.java
```

4. Execute a aplicação:
```bash
java -cp bin Main
```

## 🛠️ Tecnologias utilizadas
- Java SE
- Programação multithread
- Execução de comandos do sistema Linux
- Processamento de streams de entrada/saída
- JDK 8+

## 📋 Exemplo de saída
```
Google tempo de iteracao: 4.94 ms

Terra tempo de iteracao: 3.92 ms

UOL tempo de iteracao: 30.8 ms

... [iterações continuam] ...

Tempo médio ping no server Google: 12.113ms

Tempo médio ping no server Terra: 20.377ms

Tempo médio ping no server UOL: 32.655ms
```

## ⚠️ Mensagem de erro em outros SOs
```

Sistema operacional não suportado: Windows
Esta aplicação requer uma distribuição Linux para ser executada

```

## 👨‍💻 Desenvolvido por
[GabrielGit10110](https://github.com/GabrielGit10110)
