package kr.hs.study.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import kr.hs.study.dto.PortfolioDTO;

@Component
public class PortfolioDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void insert_data(PortfolioDTO dto) {
		String sql = "insert into portfolio values(?, ?, ?, ?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, dto.getTitle(), dto.getMemberCnt(), dto.getLanguage(), dto.getIDE(), dto.getState(), dto.getDevYear(), dto.getPeriod(), dto.getAttach());
	}
	
	public void update_data(PortfolioDTO dto) {
		String sql = "update portfolio set period=? where title=?";
		jdbcTemplate.update(sql, dto.getPeriod(), dto.getTitle());
	}
	
}
