package study.chap06.Final;

public class Login {
	int login(String id , String password) {
		if(id.equals("hong")&& password.equals("1234")){	
			return Member.LOGIN_SUCCESS;
	} else if(id.equals("hong")) {
		return Member.ID_MISSMATCH; }
		else if(password.equals("1234")) {
		
		return Member.PASSWORD_MISSMATCH;
	}else if(id.equals("hong")&& password.equals("1234")) {
		return Member.NOT_EXIST;
	}
		return 0;
		
	}
}
