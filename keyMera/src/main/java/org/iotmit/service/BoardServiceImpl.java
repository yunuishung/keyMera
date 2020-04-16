package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.BoardVO;
import org.iotmit.domain.Criteria;
import org.iotmit.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
	
	@Override
	public List<BoardVO> getList(Criteria cri) {
		log.info("�۸�� ��������");
		return mapper.getListWithPaging(cri);
	}
	
	
	@Override
	public void register(BoardVO board) {
		log.info("�۵�� ��" + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(long bno) {
		log.info("�ۻ󼼺��� �ϳ��� �۰�������" + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("�ۼ���" + board);
	//	int i =mapper.update(board);
	//	if(i==1)	return true;
	//	else	return false;
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(long bno) {
		log.info("�ۻ��� �۹�ȣ:" + bno);
		return mapper.delete(bno)==1;
	}

	@Override
	public long scount() {
		return mapper.count();
	}

	@Override
	public long admin_scount() {
		return mapper.admin_scount();
	}

	@Override
	public long search_count(String writter) {
		System.out.println("search_count : "+ writter);
		return mapper.search_count( writter );
	}

	

}
