package org.iotmit.domain;

import lombok.Data;

@Data
public class UserVO {
	private long no;
	private String id;
	private String pw;
	private String name;
	private String gender;
	private String email;
}
