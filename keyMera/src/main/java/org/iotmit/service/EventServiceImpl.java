package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.EventVO;
import org.iotmit.domain.Criteria;
import org.iotmit.mapper.EventMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class EventServiceImpl implements EventService {

	private EventMapper mapper;

	@Override
	public List<EventVO> getList(Criteria cri) {
		log.info(" 이벤트 목록 가져오기");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long admin_scount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long search_count(String writter) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EventVO get(long detect) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long scount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void register(EventVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(EventVO event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean remove(long detect) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean modify(EventVO event) {
		// TODO Auto-generated method stub
		return false;
	}




}
