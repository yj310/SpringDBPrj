package kr.hs.study.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.jdbc.core.JdbcTemplate;

import kr.hs.study.dto.PortfolioDTO;
import kr.hs.study.dao.PortfolioDAO;

@Configuration
public class JavaConfig {

	@Bean
	@Scope("prototype")
	public PortfolioDTO PortfolioDTO() {
		PortfolioDTO pd = new PortfolioDTO();
		return pd;
	}
	
	@Bean
	public PortfolioDAO PortfolioDAO() {
		PortfolioDAO pd = new PortfolioDAO();
		return pd;
	}
	
	@Bean
	public BasicDataSource source() {
		// 디비 접속 정보 입력
		BasicDataSource source = new BasicDataSource();
		source.setDriverClassName("oracle.jdbc.OracleDriver");
		source.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		source.setUsername("scott");
		source.setPassword("tiger");
		return source;
	}
	
	@Bean
	public JdbcTemplate db(BasicDataSource source) {
		// 디비 접속 정보를 jdbcTemplate로 넘기기
		JdbcTemplate db = new JdbcTemplate(source);
		return db;
	}
	
	
}
