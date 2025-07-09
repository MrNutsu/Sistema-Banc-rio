# Sistema Bancário Simples

Um sistema bancário básico desenvolvido em Java que permite realizar operações bancárias fundamentais através de um menu interativo no console.

## 📋 Funcionalidades

- **Consultar Saldo**: Visualizar o saldo atual da conta
- **Receber Valor**: Adicionar dinheiro à conta (depósito)
- **Transferir Valor**: Retirar dinheiro da conta (transferência/saque)
- **Menu Interativo**: Interface amigável com opções numeradas
- **Validações**: Verificação de valores positivos e saldo suficiente

## 🚀 Como Executar

### Pré-requisitos
- Java 11 ou superior instalado
- IDE Java (IntelliJ IDEA, Eclipse, VS Code) ou terminal com javac

### Passos para execução

1. **Clone ou baixe o arquivo Main.java**

2. **Compile o programa:**
   ```bash
   javac Main.java
   ```

3. **Execute o programa:**
   ```bash
   java Main
   ```

## 💡 Como Usar

1. **Ao iniciar**, o programa exibe:
   - Dados do cliente (nome e tipo de conta)
   - Saldo inicial: R$ 2500,00

2. **Menu de operações** com 4 opções:
   - `1` - Consultar saldo atual
   - `2` - Receber valor (depósito)
   - `3` - Transferir valor (saque)
   - `4` - Sair do programa

3. **Digite o número** da operação desejada e pressione Enter

4. **Para depósitos e transferências**, digite o valor quando solicitado

5. **O programa continuará** até que você escolha a opção "4 - Sair"

## 🔧 Exemplo de Uso

```
***********************
Dados iniciais do cliente:

Nome: João Pedro Blagitz Ravache
Tipo conta: Corrente

Saldo inicial: R$ 2500,00

***********************

Operações

1- Consultar saldo
2- Receber valor
3- Transferir valor
4- Sair

Digite a opção desejada: 1
Saldo total: R$ 2500,00

Digite a opção desejada: 2
Qual o valor a ser recebido?
500
Saldo atualizado: R$ 3000,00

Digite a opção desejada: 3
Qual o valor a ser transferido?
200
Saldo atualizado: R$ 2800,00

Digite a opção desejada: 4
Processo finalizado
```

## ⚠️ Validações Implementadas

- **Valores positivos**: Não permite depósitos ou transferências com valores negativos ou zero
- **Saldo suficiente**: Impede transferências que excedam o saldo disponível
- **Opções válidas**: Alerta sobre opções inválidas no menu principal
- **Formatação monetária**: Valores sempre exibidos com 2 casas decimais

## 🛠️ Características Técnicas

- **Linguagem**: Java
- **Versão Java**: 11+ (usa text blocks `"""`)
- **Bibliotecas**: `java.util.Scanner` (entrada de dados)
- **Estrutura**: Programação sequencial com loop principal
- **Validação**: Condicionais para verificar entradas do usuário

## 🎯 Possíveis Melhorias

- Implementar histórico de transações
- Adicionar autenticação de usuário
- Criar diferentes tipos de conta
- Implementar limite de transferência
- Adicionar data e hora das operações
- Salvar dados em arquivo

## 👨‍💻 Autor

Sistema desenvolvido para fins educacionais e demonstração de conceitos básicos de programação Java.

---

*Projeto criado como exemplo de sistema bancário simples usando estruturas de controle, loops e validações em Java.*
