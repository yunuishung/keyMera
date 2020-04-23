package org.iotmit.mapper;

import java.util.List;

import org.iotmit.domain.UserVO;
import org.iotmit.domain.Criteria;

public interface UserMapper {

	//@Select("select * from tbl_user where no>0")
	public List<UserVO> getList();
	
	public List<UserVO> getListWithPaging(Criteria cri);
		
	public void insert(UserVO user);
	
	public void insertSelectKey(UserVO user);
	
	public UserVO read(long no);
	
	public long count(); 
	public long admin_scount();
	public long search_count(String writter);
	//public long search_list(@Param("num1"), int num1,@Param("num2") int num2)
	
	public int delete(long no);
	
	public int update(UserVO user);
	
}
