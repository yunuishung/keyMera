package org.iotmit.service;

import static org.junit.Assert.assertNotNull;

import org.iotmit.domain.Criteria;
import org.iotmit.service.BoardService;
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
public class BoardServiceTests {

	@Setter(onMethod_= {@Autowired})
	private BoardService service; 
	
	@Test
	public void testExist() {
		log.info(service);
		assertNotNull(service);
	}
	
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(1,10)).forEach(board->log.info(board));
	}
	
	@Test
	public void testGet() {
		service.get(3);
		
	}
	
}

