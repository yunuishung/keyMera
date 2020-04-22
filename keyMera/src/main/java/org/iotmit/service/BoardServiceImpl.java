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
		log.info("글목록 가져오기");
		return mapper.getListWithPaging(cri);
	}
	
	
	@Override
	public void register(BoardVO board) {
		log.info("글쓰기" + board);
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(long bno) {
		log.info("글번호의 내용 가져오기" + bno);
		return mapper.read(bno);
	}

	@Override
	public boolean modify(BoardVO board) {
		log.info("수정" + board);
	//	int i =mapper.update(board);
	//	if(i==1)	return true;
	//	else	return false;
		return mapper.update(board)==1;
	}

	@Override
	public boolean remove(long bno) {
		log.info("삭제:" + bno);
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


	@Override
	public void insert(BoardVO board) {
		log.info("글쓰기" + board);
		mapper.insert(board);
		
	}

	

}
