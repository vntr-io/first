package io.vntr;

import javax.sql.DataSource;

import org.postgresql.Driver;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableAutoConfiguration
@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan(basePackages="io.vntr")
@EntityScan(basePackages="io.vntr")
@EnableJpaRepositories(basePackages="io.vntr")
@EnableSwagger2
public class Application
{
	public static void main(String[] args)
	{
		SpringApplication.run(Application.class, args);
	}

    @Value("${url}")
    private String url;

    @Value("${jdbc_username}")
    private String username;

    @Value("${password}")
    private String password;

    @Bean(name = "dataSource")
    public DataSource dataSource()
    {
    	System.out.println("URL: \"" + url + "\", username: \"" + username + "\", password: \"" + password + "\"");
    	double val = 0;
    	for(int i=0; i<100000; i++)
    	{
    		val += Math.pow(i+1, 0.01);
    	}
    	System.out.println("val: " + val);
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(Driver.class);
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }
}