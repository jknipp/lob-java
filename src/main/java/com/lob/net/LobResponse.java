package com.lob.net;

public class LobResponse {
	
	int responseCode;
	String responseBody;
	
	public LobResponse(int responseCode, String responseBody) {
		this.responseCode = responseCode;
		this.responseBody = responseBody;
	}

	public int getResponseCode() {
		return responseCode;
	}
	
	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getResponseBody() {
		return responseBody;
	}
	
	public void setResponseBody(String responseBody) {
		this.responseBody = responseBody;
	}
}
