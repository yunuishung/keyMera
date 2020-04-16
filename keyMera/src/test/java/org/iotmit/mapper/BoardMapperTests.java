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
		board.setTitle("�����Դϴ�.");
		board.setContent("�����Դϴ�.");
		board.setWriter("������");
				
		mapper.insert(board);
		
	}
	
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("�����Դϴ�.1");
		board.setContent("�����Դϴ�.1");
		board.setWriter("������1");
				
		mapper.insertSelectKey(board);
	}
	
	@Test
	public void	testRead() {
		mapper.read(2);
	}
	
	@Test
	public void	testDelete() {
		log.info("���� ����" + mapper.delete(2));
	}
	
	@Test
	public void	testUpate() {
		BoardVO board = new BoardVO();
		board.setTitle("�����Դϴ�.1");
		board.setContent("�����Դϴ�.1");
		board.setWriter("������1");
		board.setBno(3L);
		log.info("���� ����" + mapper.update(board));
	}
	
	@Test
	public void testQuiz() {
		mapper.quiz(3);
	}
	
}





