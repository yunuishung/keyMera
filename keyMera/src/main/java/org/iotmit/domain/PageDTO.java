package org.iotmit.domain;

import lombok.Getter;

@Getter

public class PageDTO {
	private int startPage;
	private int endPage;
	private boolean prev, next;
	
	private Criteria cri;   //
	private int total;   //
	
	public PageDTO( Criteria cri, int total) {//
		this.cri = cri;
		this.total = total;
		
		//
		this.endPage = (int)(Math.ceil(cri.getPageNum() /10.0))*10;
		//
		this.startPage = this.endPage - 9;     //
		
		int realEnd = (int) (Math.ceil(total*1.0)/ cri.getAmount());  //
		if( this.endPage > realEnd) {
			this.endPage = realEnd;
		}
		
		this.prev = this.startPage > 1;
		this.next = this.endPage < realEnd;
	}

	@Override
	public String toString() {
		return "PageDTO [startPage=" + startPage + ", endPage=" + endPage + ", prev=" + prev + ", next=" + next
				+ ", cri=" + cri + ", total=" + total + ", getStartPage()=" + getStartPage() + ", getEndPage()="
				+ getEndPage() + ", isPrev()=" + isPrev() + ", isNext()=" + isNext() + ", getCri()=" + getCri()
				+ ", getTotal()=" + getTotal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
