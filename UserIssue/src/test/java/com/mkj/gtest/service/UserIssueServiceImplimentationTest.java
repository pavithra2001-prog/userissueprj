package com.mkj.gtest.service;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.mkj.gtest.entity.UserIssue;
import com.mkj.gtest.repository.UserIssueRepository;

@SpringBootTest

import com.mkj.gtest.entity.UserIssue;

class UserIssueServiceImplimentationTest {
	@Mock
	UserIssueRepository UserIssueRepository;
	
	@InjectMocks
	UserIssueServiceImplimentation reviewService;

	@Test
	void testInsertUserIssue() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllUserIssue() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssueByIssueid() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssueByStatus() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssueByCategory() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssueByDate() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssueByTitle() {
		fail("Not yet implemented");
	}

	@Test
	void testGetUserIssuesBetweenIds() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUserIssueInt() {
		fail("Not yet implemented");
	}

	@Test
	void testDeleteUserIssueString() {
		fail("Not yet implemented");
	}
	@Test
	//@Disabled
    @DisplayName("Get all users by user id")
	void testGetUserIssueByIssueId() throws Exception {
		UserIssue sampleOutput = new UserIssue(101,"disc is crashed","the disk has been crashed, please rectify it asap","computer","09:15", "11-11-2022", "false")
				sampleOutput.setIssueid(1);

		int sampleInput = 1;

		BDDMockito.given(UserIssueService.getUserIssueByIssueId(sampleInput)).willReturn(sampleOutput);

		// when
		UserIssue actualOutput = UserIssueService.getUserIssueByIssueid(sampleInput);
		// verify
		assertEquals(sampleOutput, actualOutput);
		assertSame(sampleOutput.getIssueid(), actualOutput.getIssueid());
		assertThat(actualOutput.getUserId()).isGreaterThan(0);
	
	}

	@Test
	void testGetAllUserIssueBasedOnLocalDate() {
		fail("Not yet implemented");
	}

}
