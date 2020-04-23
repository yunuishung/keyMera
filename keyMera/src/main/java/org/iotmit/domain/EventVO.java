package org.iotmit.domain;

import java.util.Date;

import lombok.Data;

@Data
public class EventVO {
	private long detect;
	private String user;
	private Date date;
	private String confidence;
}
