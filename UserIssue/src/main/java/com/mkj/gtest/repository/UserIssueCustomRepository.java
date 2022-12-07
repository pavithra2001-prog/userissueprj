package com.mkj.gtest.repository;


	import com.mkj.gtest.entity.UserIssue;

	public interface UserIssueCustomRepository {
		public UserIssue getUserIssueByIssueid(int issueid)throws Exception;
			
		}



