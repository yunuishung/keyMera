package org.iotmit.mapper;

import org.iotmit.domain.BoardVO;
import org.iotmit.mapper.BoardMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") 
@Log4j
public class BoardMapperTests {

	@Setter(onMethod_= {@Autowired})
	private BoardMapper mapper;
	
	@Test
	public void testGetList() {
		mapper.getList();
	}
	
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		
		board.setTitle("testInsert Junit 테스입니다!. ");
		board.setContent("testInsert Junit 테스입니다. ");
		board.setWriter("관리자");
		mapper.insert(board);
		
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("testDelete() 테스트입니다.");
		board.setContent("	@Test\r\n" + 
				"	public void	testDelete() {\r\n" + 
				"		log.info(\"1번글 삭제\" + mapper.delete(1));\r\n" + 
				"	}\r\n" + 
				"	");
		board.setWriter("관리자");
				
		mapper.insertSelectKey(board);
	}
	
	@Test
	public void	testRead() {
		mapper.read(2);
	}
	
	@Test
	public void	testDelete() {
		log.info("1번글 삭제" + mapper.delete(1));
	}
	
	@Test
	public void	testUpate() {
		BoardVO board = new BoardVO();
		board.setTitle("업데이트 테스트입니다");
		board.setContent("업데이합니다");
		board.setWriter("관리자");
		board.setBno(3L);
		log.info("업데이트" + mapper.update(board));
	}
	
	@Test
	public void testQuiz() {
		mapper.quiz(3);
	}
	
}





