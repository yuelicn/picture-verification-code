package com.yl.image;

import java.time.LocalDateTime;

public class VerificationCode {

	private String code;

	private LocalDateTime expireTime;

	public VerificationCode(String code, int expireTime) {
		this.code = code;
		this.expireTime = LocalDateTime.now().plusSeconds(expireTime);
	}

	public VerificationCode(String code, LocalDateTime expireTime) {
		this.code = code;
		this.expireTime = expireTime;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDateTime getExpireTime() {
		return expireTime;
	}

	public void setExpireTime(LocalDateTime expireTime) {
		this.expireTime = expireTime;
	}

	/**
	 * 判断时间是否过期
	 * 
	 * @return
	 */
	public boolean isExpried() {
		return LocalDateTime.now().isAfter(expireTime);
	}
}
