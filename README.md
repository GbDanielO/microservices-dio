# microservices-dio
Curso de migroserviços com Spring Boot, Elasticsearch, Redis, Docker, etc.

Tecnologias e frameworks usados:
- Spring boot;
- Spring Web; (Rest)
- Spring cloud;
- Spring actuator; (checa status da aplicação)
- Netflix Eureka Server; (service discovery)
- Docker;
- Docker-compose;
- Elasticsearch;
- Redis;

### Arquitetura

![arquitetura](https://github.com/GbDanielO/microservices-dio/blob/main/Arquitetura.PNG.jpg)

A arquitetura tem um Service-Discovery que serve para registro e balanceamento dos microserviços.
(O service-discovery tem 1 ponto negativo que é uma chamada extra sempre que houver a necessidade
de comunicação entre serviços)

### Documentações:
Config Server: (https://docs.spring.io/spring-cloud-config/docs/3.1.7/reference/html/#_spring_cloud_config_server)<br />
Service Discovery Eureka: (https://cloud.spring.io/spring-cloud-netflix/reference/html/)<br />
Elasticsearch: (https://docs.spring.io/spring-data/elasticsearch/docs/4.4.0/reference/html/#reference)<br />
Elasticsearch with docker: (https://www.elastic.co/guide/en/elasticsearch/reference/7.17/docker.html#docker-cli-run-dev-mode)<br />
Redis: Versão do projeto: 2.7.0 (ná época era a "current")<br />
Redis: (https://docs.spring.io/spring-data/data-redis/docs/current/reference/html/#redis:connectors:lettuce)<br />
Redis template: (https://docs.spring.io/spring-data/data-redis/docs/current/reference/html/#redis:template)<br />

A maioria dos usuários provavelmente usará RedisTemplate e seu pacote correspondente, org.springframework.data.redis.core. 
O template é, de fato, a classe central do módulo Redis, devido ao seu rico conjunto de recursos. 
O modelo oferece uma abstração de alto nível para interações do Redis. 
Enquanto RedisConnection oferece métodos de baixo nível que aceitam e retornam valores binários (arrays de bytes), 
o modelo cuida da serialização e do gerenciamento de conexões, liberando o usuário de lidar com tais detalhes.
 
Além disso, o modelo fornece exibições de operações (seguindo o agrupamento da referência de comando Redis) 
que oferecem interfaces ricas e genéricas para trabalhar com um determinado tipo ou determinada chave 
(por meio das interfaces KeyBound).


