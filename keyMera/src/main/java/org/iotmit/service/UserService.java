package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.UserVO;
import org.iotmit.domain.Criteria;

public interface UserService {
	
	public List<UserVO> getList(Criteria cri );
	
	public void register(UserVO board);
	
	public void insert(UserVO board);
	
	public UserVO get(long no);
	
	public boolean modify(UserVO board);
	
	public boolean remove(long no);
	
	public long scount();
	
	public long admin_scount();
	
	public long search_count(String id);
	
		
}
