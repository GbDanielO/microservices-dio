package br.com.dio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

/**
 * Docs Redis:
 * 
 * - Connector
 * https://docs.spring.io/spring-data/data-redis/docs/current/reference/html/#redis:connectors:lettuce
 * 
 * - Template
 * A maioria dos usuários provavelmente usará RedisTemplate e seu pacote correspondente, org.springframework.data.redis.core. 
 * O template é, de fato, a classe central do módulo Redis, devido ao seu rico conjunto de recursos. 
 * O modelo oferece uma abstração de alto nível para interações do Redis. 
 * Enquanto RedisConnection oferece métodos de baixo nível que aceitam e retornam valores binários (arrays de bytes), 
 * o modelo cuida da serialização e do gerenciamento de conexões, liberando o usuário de lidar com tais detalhes.
 * 
 * Além disso, o modelo fornece exibições de operações (seguindo o agrupamento da referência de comando Redis) 
 * que oferecem interfaces ricas e genéricas para trabalhar com um determinado tipo ou determinada chave 
 * (por meio das interfaces KeyBound), conforme descrito na tabela a seguir:
 * 
 * https://docs.spring.io/spring-data/data-redis/docs/current/reference/html/#redis:template
 * 
 * @author gbdaniel
 *
 */
@Configuration
@EnableRedisRepositories
public class RedisConfig {

	@Bean
	LettuceConnectionFactory redisConnectionFactory() {
		return new LettuceConnectionFactory(new RedisStandaloneConfiguration("localhost", 6379));
	}

	@Bean
	RedisTemplate<String, String> redisTemplate(RedisConnectionFactory redisConnectionFactory) {

		RedisTemplate<String, String> template = new RedisTemplate<>();
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}

}
