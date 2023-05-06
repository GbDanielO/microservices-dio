package br.com.dio.config;

import javax.swing.text.html.parser.Entity;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

/**
 * Doc elasticsearch:
 * https://docs.spring.io/spring-data/elasticsearch/docs/4.4.0/reference/html/#reference
 * 
 * Doc elasticsearch with docker:
 * https://www.elastic.co/guide/en/elasticsearch/reference/7.17/docker.html#docker-cli-run-dev-mode
 * 
 * @author gbdaniel
 *
 */
@SuppressWarnings("deprecation")
@Configuration
@EnableElasticsearchRepositories(basePackages = "br.com.dio.repository")
public class ElasticSearchConfig extends AbstractElasticsearchConfiguration {

	@Override
    @Bean
    public RestHighLevelClient elasticsearchClient() {

        final ClientConfiguration clientConfiguration = ClientConfiguration.builder()  
            .connectedTo("localhost:9200")
            .build();
        
        return RestClients.create(clientConfiguration).rest();

    }
	

}
