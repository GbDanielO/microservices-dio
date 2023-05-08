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

#Arquitetura

!(https://github.com/GbDanielO/microservices-dio/blob/main/Arquitetura.PNG.jpg)

A arquitetura tem um Service-Discovery que serve para registro e balanceamento dos microserviços.
(O service-discovery tem 1 ponto negativo que é uma chamada extra sempre que houver a necessidade
de comunicação entre serviços)
