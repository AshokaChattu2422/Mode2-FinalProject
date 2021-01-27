package com.bankapp.entities;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Transaction_Log_table")
public class TransactionLog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int txLogId;
	private String type;
	private int fromAccount;
	private int toAccount;
	private String transcationDetails;
	private LocalDateTime timestamp;
	private String status;
	
	
	
	public int getTxLogId() {
		return txLogId;
	}
	public void setTxLogId(int txLogId) {
		this.txLogId = txLogId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getFromAccount() {
		return fromAccount;
	}
	public void setFromAccount(int fromAccount) {
		this.fromAccount = fromAccount;
	}
	public int getToAccount() {
		return toAccount;
	}
	public void setToAccount(int toAccount) {
		this.toAccount = toAccount;
	}
	public String getTranscationDetails() {
		return transcationDetails;
	}
	public void setTranscationDetails(String transcationDetails) {
		this.transcationDetails = transcationDetails;
	}
	public LocalDateTime getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}
	public String isStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public TransactionLog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionLog(String type, int fromAccount, int toAccount, String transcationDetails) {
		super();
		this.type = type;
		this.fromAccount = fromAccount;
		this.toAccount = toAccount;
		this.transcationDetails = transcationDetails;
		this.timestamp=LocalDateTime.now();
		this.status="successfull";
	}
	
	
}