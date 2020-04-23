package org.iotmit.service;

import java.util.List;

import org.iotmit.domain.UserVO;
import org.iotmit.domain.Criteria;
import org.iotmit.mapper.UserMapper;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class UserServiceImpl implements UserService {

	private UserMapper mapper;

	@Override
	public List<UserVO> getList(Criteria cri) {
		log.info(" 유저 목록 가져오기");
		return mapper.getListWithPaging(cri);
	}

	@Override
	public void register(UserVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void insert(UserVO board) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserVO get(long no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(UserVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(long no) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long scount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long admin_scount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long search_count(String id) {
		// TODO Auto-generated method stub
		return 0;
	}





}
