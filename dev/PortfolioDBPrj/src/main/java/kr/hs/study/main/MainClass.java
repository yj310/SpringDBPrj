package kr.hs.study.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.hs.study.config.JavaConfig;
import kr.hs.study.dao.PortfolioDAO;
import kr.hs.study.dto.PortfolioDTO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		PortfolioDTO bean1 = ctx.getBean("PortfolioDTO", PortfolioDTO.class);
		bean1.setTitle("난난이의 습격");
		bean1.setMemberCnt(2);
		bean1.setLanguage("C++,DirectX");
		bean1.setIDE("visual studio");
		bean1.setState("개발 완료");
		bean1.setDevYear(2020);
		bean1.setPeriod("2주");
		bean1.setAttach("https://github.com/yj310/Attack_Of_Nannan");
		
		PortfolioDTO bean2 = ctx.getBean("PortfolioDTO", PortfolioDTO.class);
		bean2.setTitle("난난이의 습격");
		bean2.setPeriod("3주");
		
		PortfolioDAO dao = ctx.getBean("PortfolioDAO", PortfolioDAO.class);
		//dao.insert_data(bean1);
		
		//dao.update_data(bean2);
		
		dao.delete_data(bean1);
		
		System.out.println("완료");
		ctx.close();
		
	}

}
