# AVA2 - Atividade de Desenvolvimento Web II do curso de Análise e Desenvolvimento de Sistemas

## Calculadora Web - Java Servlets & JSP

Este repositório contém um projeto acadêmico focado no desenvolvimento de aplicações web utilizando o padrão de arquitetura **MVC (Model-View-Controller)**. O objetivo principal é demonstrar a comunicação fluida entre páginas web dinâmicas e o back-end utilizando as tecnologias fundamentais do ecossistema Java.

## 📁 Estrutura e Arquitetura do Projeto

O projeto foi estruturado seguindo o padrão oficial de diretórios para aplicações web em Java, separando rigorosamente a camada de controle (lógica) da camada de visão (telas).

### 1. Camada de Controle (`/src/main/java/ava2_dad_project`)
Neste diretório ficam as classes Java (`.java`), responsáveis por agir como os "Controladores" da aplicação. Eles processam as requisições HTTP, executam regras de negócio e despacham as respostas.

* **`Calculo.java`:** É o Servlet principal do projeto. Ele atua como uma ponte: recebe via método `POST` os dados enviados pela calculadora, valida as conversões matemáticas de String para Float, executa as operações (tratando exceções críticas como divisão por zero) e devolve as variáveis processadas de volta para a tela do usuário de forma segura.
* **`AloMundo.java`:** Servlet inicial construído para validação e testes de mapeamento e resposta básica do servidor Tomcat.

### 2. Camada de Visão e Configurações (`/src/main/webapp`)
Este diretório atua como a raiz pública da aplicação web. Tudo relacionado à interface e às configurações estruturais do servidor reside aqui.

* **`/ava2_jsp_app/Calculadora.jsp`:** É o arquivo de interface (View). Uma página JSP (JavaServer Pages) que combina marcação HTML para o formulário de entrada com scriptlets e expressões Java (`<%= %>`). Ele é responsável apenas por apresentar a interface gráfica e renderizar as mensagens de erro ou os cálculos finais despachados dinamicamente pelo Servlet.
* **`/WEB-INF/web.xml`:** O Descritor de Implantação (Deployment Descriptor). É o arquivo de configuração de infraestrutura lido pelo servidor Tomcat. Ele mapeia de forma explícita e segura a relação entre as URLs que o usuário acessa no navegador e a localização exata das classes Java no back-end (ex: mapeando a rota `/Calculo` para a classe `ava2_dad_project.Calculo`).

## 🚀 Tecnologias Utilizadas

* **Java SE** (Lógica de processamento)
* **Java EE / Jakarta EE** (Servlets API e JSP)
* **Apache Tomcat v9.0** (Servidor Web / Servlet Container)
* **Eclipse IDE** (Ambiente de Desenvolvimento)
* **HTML5 / CSS3** (Estruturação e estilização da interface)

## ⚙️ Como executar este projeto localmente

1. Certifique-se de ter o [JDK](https://www.oracle.com/br/java/technologies/downloads/) e o servidor [Apache Tomcat 9](https://tomcat.apache.org/download-90.cgi) instalados em sua máquina.
2. Clone este repositório:
   ```bash
   git clone [https://github.com/SEU-USUARIO/ava2_dad_project.git](https://github.com/SEU-USUARIO/ava2_dad_project.git)
