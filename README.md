# Weather forecast project.

Este projeto foi criado utilizando o Spring Initializr com Java 17 e Maven. Ele faz uso da biblioteca Jackson Databind para manipulação de JSON e realiza chamadas à API da OpenWeatherMap para obter dados de previsão do tempo.
### Configuração
O projeto foi dividido em pastas, onde model contém desserializadores de dados, service contém consumidores e conversores de APIs, e Principal contém a função principal do programa.

 ### Requisitos

- [Java 17](https://adoptopenjdk.net/)
- [Maven](https://maven.apache.org/)

### Dependências

Este projeto utiliza a seguinte dependência:

```xml
<dependency>
    <groupId>com.fasterxml.jackson.core</groupId>
    <artifactId>jackson-databind</artifactId>
    <version>2.15.2</version>
</dependency>
