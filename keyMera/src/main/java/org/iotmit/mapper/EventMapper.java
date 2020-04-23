package org.iotmit.mapper;

import java.util.List;

import org.iotmit.domain.EventVO;
import org.iotmit.domain.Criteria;


public interface EventMapper {
	
	public List<EventVO> getList();
	
	public List<EventVO> getListWithPaging(Criteria cri);
	
	public void insert(EventVO event);
	
	public void insertSelectKey(EventVO event);
	
	public EventVO read(long detect);
	
	public long count(); 
	public long admin_scount();
	public long search_count(String user);
	//public long search_list(@Param("num1"), int num1,@Param("num2") int num2)
	
	public int delete(long detect);
	
	public int update(EventVO event);
	
	public List<EventVO> quiz(long num);
}
