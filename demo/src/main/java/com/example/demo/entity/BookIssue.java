package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name	="BookIssue")
public class BookIssue {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long bookissueid;
	private Long memberid;
	private Date issuedate;
	private Date returndate;
	private Date datereturned;
	private Double borrowamount;
	private Double laterturnfeeamount;
	public Long getBookissueid() {
		return bookissueid;
	}
	public void setBookissueid(Long bookissueid) {
		this.bookissueid = bookissueid;
	}
	public Long getMemberid() {
		return memberid;
	}
	public void setMemberid(Long memberid) {
		this.memberid = memberid;
	}
	public Date getIssuedate() {
		return issuedate;
	}
	public void setIssuedate(Date issuedate) {
		this.issuedate = issuedate;
	}
	public Date getReturndate() {
		return returndate;
	}
	public void setReturndate(Date returndate) {
		this.returndate = returndate;
	}
	public Date getDatereturned() {
		return datereturned;
	}
	public void setDatereturned(Date datereturned) {
		this.datereturned = datereturned;
	}
	public Double getBorrowamount() {
		return borrowamount;
	}
	public void setBorrowamount(Double borrowamount) {
		this.borrowamount = borrowamount;
	}
	public Double getLaterturnfeeamount() {
		return laterturnfeeamount;
	}
	public void setLaterturnfeeamount(Double laterturnfeeamount) {
		this.laterturnfeeamount = laterturnfeeamount;
	}

}
