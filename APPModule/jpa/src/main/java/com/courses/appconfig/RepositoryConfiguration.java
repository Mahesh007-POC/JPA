package com.courses.appconfig;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;

@Configuration
@PropertySource("application.properties")
public class RepositoryConfiguration {
	@Value("${spring.datasource.driver-class-name}")
	private String driverName;
	@Value("${spring.datasource.url}")
	private String url;
	@Value("${spring.datasource.username}")
	private String username;
	@Value("${spring.datasource.password}")
	private String password;
	/*
	 * @Bean public DataSource getDataSource() {
	 * 
	 * DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
	 * dataSourceBuilder.driverClassName(driverName); dataSourceBuilder.url(url);
	 * dataSourceBuilder.username("mahesme"); dataSourceBuilder.password("mahesme");
	 * return dataSourceBuilder.build(); }
	 */

	@Bean
	public DataSource dataSource() {

		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		return builder.setType(EmbeddedDatabaseType.H2).build();

	}
}
