package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.BoardVO;
import org.iotmit.domain.Criteria;

public interface BoardService {
	
	public List<BoardVO> getList(Criteria cri );
	
	public void register(BoardVO board);
	
	public void insert(BoardVO board);
	
	public BoardVO get(long bno);
	
	public boolean modify(BoardVO board);
	
	public boolean remove(long bno);
	
	public long scount();
	
	public long admin_scount();
	
	public long search_count(String writter);
	
	//public BoardVO get(int num1,int num2);
		
}
