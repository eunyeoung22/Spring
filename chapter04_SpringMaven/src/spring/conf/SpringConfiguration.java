package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import user.dao.UserDAOImpl;
import user.service.UserDeleteService;
import user.service.UserInsertService;
import user.service.UserUpdateService;

@Configuration//환경설정 파일
@PropertySource("classpath:spring/db.properties")
public class SpringConfiguration {
	@Value("${jdbc.driver}")
	private String driver;
	
	@Value("${jdbc.url}")
	private String url;
	
	@Value("${jdbc.username}")
	private String username;
	
	@Value("${jdbc.password}")
	private String password;
	
	@Bean
	public BasicDataSource dataSource(){
		BasicDataSource basicDataSource = new BasicDataSource();
		
		basicDataSource.setDriverClassName(driver);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(username);
		basicDataSource.setPassword(password);
		
		return basicDataSource;
	}
}


/* 
 @Bean 
  - 메소드에서 return되는 값을 빈으로 생성 한다.
  - 메소드의 이름은 반드시 빈의 id명으로 해야한다.
 */
