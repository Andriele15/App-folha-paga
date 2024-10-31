# **APP FOLHA PAGA**

> Um aplicativo Android simples para calcular seu salário líquido.

## 📱 Descrição

O **APP FOLHA PAGA** permite ao usuário calcular o salário líquido com base em informações como nome, salário bruto, número de filhos e sexo. 
O aplicativo considera os descontos de INSS e IR, além de calcular o salário família quando aplicável. 

## 🔧 Funcionalidades

- [x] Entrada de Dados: O usuário pode inserir seu nome, salário bruto, número de filhos e selecionar seu sexo.
- [x] Cálculo de Descontos: O aplicativo calcula automaticamente os descontos do INSS e do Imposto de Renda (IR).
- [x] Salário Família: O cálculo inclui a possibilidade de receber salário família, dependendo do salário bruto.
- [x] Interface simples e intuitiva
- [X] Resultado: O resultado é exibido de forma clara, incluindo os descontos e o salário líquido final.


## 🚀 Tecnologias Utilizadas

- [x] **Android Studio** (Koala | 2024.1.2)
- [x] **Java** para desenvolvimento
- [x] **ConstraintLayout** para interface responsiva
- [x] **TextView** e **EditText** para entrada e exibição de dados
- [x] **Button**   para executar o app.
- [X] **RadioGroup** para exibição de pronome no resultado. 

## 🛠️ Como Rodar o Projeto

Siga os passos abaixo para rodar o projeto localmente:

1. Clone este repositório:

    ```bash
    git clone https://github.com/Andriele15/App-folha-paga.git

    ```

2. Abra o projeto no Android Studio.
3. Compile e execute o projeto em um emulador ou dispositivo físico.

## 📂 Estrutura do Projeto

```bash
├── app
│ ├── src
│ │ ├── main
│ │ │ ├── java/br/ulbra/appfolhapaga
│ │ │ │ ├── MainActivity.java # Atividade principal 
│ │ │ ├── res
│ │ │ │ ├── layout
│ │ │ │ │ ├── activity_main.xml # Layout da tela principal
│ │ │ │ └── values
│ │ │ │ ├── strings.xml # Strings usadas no app
│ │ │ │ ├── colors.xml # Cores definidas no projeto
│ └── build.gradle # Configuração do Gradle
└── README.md # Este arquivo
````

## 🎨 Design e Prototipagem
 
A interface do app foi criada usando **ConstraintLayout** para manter a responsividade em diferentes tamanhos de tela.
 
O design é minimalista e fácil de usar, com foco na simplicidade.
 
 ## 🖥️ Telas do Aplicativo

1. **Tela Principal**
 
Na tela principal, o usuário insere seu nome, seu salário bruto e o número de filhos, após isso você marca alguma das opções do RadioGroup, para o resultado ser devolvido com seu pronome.
 
![folhapaga](https://github.com/user-attachments/assets/815ef6cc-5cc8-4a62-bc15-f7ae16387f0d)

 
## 👨‍💻 Desenvolvedores –

**Andriele Pacheco** - Desenvolvedor - [GitHub](https://github.com/Andriele15)
 
 ## 📄 Licença
 
Este projeto está licenciado sob os termos da licença MIT. 
Para mais
detalhes, veja o arquivo [LICENSE](LICENSE).
