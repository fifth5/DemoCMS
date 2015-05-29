package com.democms.model.domain;

public class Result {

	public boolean reslut = false;
	public String msgCode;
	public String errorCode;
	
	
	
	
	public boolean isReslut() {
		return reslut;
	}
	public void setReslut(boolean reslut) {
		this.reslut = reslut;
	}
	public String getMsgCode() {
		return msgCode;
	}
	public void setMsgCode(String msgCode) {
		this.msgCode = msgCode;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
