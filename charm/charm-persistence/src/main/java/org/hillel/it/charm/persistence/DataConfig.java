package org.hillel.it.charm.persistence;
import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@PropertySource("classpath:application.properties")
@EnableTransactionManagement
@ComponentScan("org.hillel.it")
public class DataConfig {

		@Autowired
		private Environment env;

		@Bean
		public BasicDataSource dataSource() {
			BasicDataSource dataSource = new BasicDataSource();
			dataSource.setUrl(env.getProperty("db.url"));
			dataSource.setUsername(env.getProperty("db.user"));
			dataSource.setPassword(env.getProperty("db.password"));
			dataSource.setDriverClassName(env.getProperty("db.driver"));

			return dataSource;
		}
		
		@Bean
		public JdbcTemplate jdbcTemplate() {
			return new JdbcTemplate(dataSource());
		}
		
		@Bean
		public NamedParameterJdbcTemplate namedTemplate() {
			return new NamedParameterJdbcTemplate(dataSource());
		}

		@Bean
		public DataSourceTransactionManager transactionManager() {
			return new DataSourceTransactionManager(
					dataSource());
		}
		
}
	
