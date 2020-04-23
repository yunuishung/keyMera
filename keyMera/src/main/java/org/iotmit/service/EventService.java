package org.iotmit.service;

import java.util.List;
import org.iotmit.domain.EventVO;
import org.iotmit.domain.Criteria;

public interface EventService {
	
	public List<EventVO> getList(Criteria cri );
	
	public long scount();
	
	public long count(); 
	
	public long admin_scount();
	
	public long search_count(String writter);
	
	public void register(EventVO event);
	
	public void insert(EventVO event);
		
	public boolean remove(long detect);
	
	public EventVO get(long detect);
	
	public boolean modify(EventVO event);	
}
