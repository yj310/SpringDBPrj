package kr.hs.study.dto;

import org.springframework.stereotype.Component;

@Component
public class PortfolioDTO {
	
	private String title;
	private int memberCnt;
	private String language;
	private String IDE;
	private String state;
	private int devYear;
	private String period;
	private String attach;
	
	
	/* constructor */
	public PortfolioDTO() {
		super();
	}
	
	public PortfolioDTO(String title, int memberCnt, String language, String iDE, String state, int devYear,
			String period, String attach) {
		super();
		this.title = title;
		this.memberCnt = memberCnt;
		this.language = language;
		IDE = iDE;
		this.state = state;
		this.devYear = devYear;
		this.period = period;
		this.attach = attach;
	}

	/* getter setter */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getMemberCnt() {
		return memberCnt;
	}

	public void setMemberCnt(int memberCnt) {
		this.memberCnt = memberCnt;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getIDE() {
		return IDE;
	}

	public void setIDE(String iDE) {
		IDE = iDE;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getDevYear() {
		return devYear;
	}

	public void setDevYear(int devYear) {
		this.devYear = devYear;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	

	
	
	
	
}
