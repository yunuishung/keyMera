package org.iotmit.controller;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//GetServer Uri�� get Ÿ������ ��û�Ǹ�  �ʸ�  �ؽ�Ʈ��   �����ϴ� ����ѷ�  (gitHub��� )

@Controller
public class AjaxController {

	@GetMapping("/jQuery/ajax")
	public void ajax() {
		
	}
	
	@GetMapping("/GetServer")
	@ResponseBody
	public String second() {
	    Calendar calendar=Calendar.getInstance();
	    int second=calendar.get(Calendar.SECOND);
	    System.out.println(second);
	    String str=Integer.toString(second);  //���� �ð���  ���ڿ��� ������ش�
	    //google : "������ �ؽ�Ʈ ������"
	    return str;
	    //http://localhost:8090/controller/ ���� 
	    //http://localhost:8090/controller/GetServer 
	}
}
