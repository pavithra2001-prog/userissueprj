package com.mkj.gtest.repository;


	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	import com.mkj.gtest.entity.UserIssue;

	@Repository
		public interface UserIssueRepository extends JpaRepository<UserIssue, Integer> , UserIssueCustomRepository 
		{

		}



