package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.BoardVO;
import org.iotmit.domain.Criteria;

public interface BoardService {
	//1.��Ϻ���
	public List<BoardVO> getList(Criteria cri );
	//2.�Խñ۵��
	public void register(BoardVO board);
	
	public void insert(BoardVO board);
	//3.�Խñۺ���
	public BoardVO get(long bno);
	//4.�Խñۼ���
	public boolean modify(BoardVO board);
	//5.�Խñۻ���
	public boolean remove(long bno);
	//6.��ü �Խ��� �۰���
	public long scount();
	
	public long admin_scount();
	
	public long search_count(String writter);
	
	//public BoardVO get(int num1,int num2);
		
}
