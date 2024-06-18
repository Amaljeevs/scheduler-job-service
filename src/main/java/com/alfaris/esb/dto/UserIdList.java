package com.alfaris.esb.dto;

public class UserIdList {

	private String userNickName;
	private String userAliasName;
	private String userId;

	public String getUserNickName() {
		return userNickName;
	}

	public void setUserNickName(String userNickName) {
		this.userNickName = userNickName;
	}

	public String getUserAliasName() {
		return userAliasName;
	}

	public void setUserAliasName(String userAliasName) {
		this.userAliasName = userAliasName;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public UserIdList(String userNickName, String userAliasName, String userId) {
		super();
		this.userNickName = userNickName;
		this.userAliasName = userAliasName;
		this.userId = userId;
	}

	public UserIdList() {
		super();
	}

	@Override
	public String toString() {
		return "UserIdList [userNickName=" + userNickName + ", userAliasName=" + userAliasName + ", userId=" + userId
				+ "]";
	}

}
