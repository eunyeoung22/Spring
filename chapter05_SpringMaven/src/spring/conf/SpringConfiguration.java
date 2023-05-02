package spring.conf;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration//환경설정 파일
@PropertySource("classpath:spring/db.properties")
@EnableTransactionManagement//applicationContext.xml에 설정하던 것과 동일함
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
	
	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception{
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("spring/mybatis-config.xml"));
		sqlSessionFactoryBean.setMapperLocations(new ClassPathResource("user/dao/userMapper.xml"));
		
		return sqlSessionFactoryBean.getObject();
		
	}
	
	@Bean
	public SqlSessionTemplate sqlSession() throws Exception {
		SqlSessionTemplate sqlSession = new SqlSessionTemplate(sqlSessionFactory());
		return sqlSession;
		
	}
	@Bean
	public DataSourceTransactionManager transactionManager(){
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource());
		return dataSourceTransactionManager;
	}
	
}


/* 
 @Bean 
  - 메소드에서 return되는 값을 빈으로 생성 한다.
  - 메소드의 이름은 반드시 빈의 id명으로 해야한다.
 */
