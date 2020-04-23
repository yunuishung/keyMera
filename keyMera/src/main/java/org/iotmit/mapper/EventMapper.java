package org.iotmit.mapper;

import java.util.List;

import org.iotmit.domain.EventVO;
import org.iotmit.domain.Criteria;
import org.iotmit.domain.EventVO;

public interface EventMapper {
	public List<EventVO> getList();
	
	public List<EventVO> getListWithPaging(Criteria cri);
	
	public void insert(EventVO board);
	
	public void insertSelectKey(EventVO board);
	
	public EventVO read(long bno);
	
	public long count(); 
	public long admin_scount();
	public long search_count(String writter);
	//public long search_list(@Param("num1"), int num1,@Param("num2") int num2)
	
	public int delete(long bno);
	
	public int update(EventVO board);
	
	public List<EventVO> quiz(long num);
}
