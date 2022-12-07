package com.mkj.gtest.service;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mkj.gtest.entity.UserIssue;
import com.mkj.gtest.repository.UserIssueRepository;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.mkj.gtest.entity.Conversation;
import com.mkj.gtest.repository.UserIssueCustomRepository;

@Service
public class UserIssueServiceImplimentation implements UserIssueService{
	@Autowired
	UserIssueRepository userIssueRepository;
	
	@Override
	@Transactional
	public UserIssue insertUserIssue(UserIssue user) throws Exception {
		UserIssue savedUserIssue	 =  userIssueRepository.save(user); 
		if(savedUserIssue != null)
		{
			return savedUserIssue;
		}
		else return null;
        }


	@Override
	public List<UserIssue> getAllUserIssue() throws Exception {
		
		// may contains other code like security , loggging , validation 
		
		List<UserIssue> allUserIssues =  userIssueRepository.findAll(); // Note : same as save
				return allUserIssues;
	}
	@Override
	public UserIssue getUserIssueByIssueid(int issueid) throws Exception {
		UserIssue outputUser=userIssueRepository.getUserIssueByIssueid(issueid);
		return outputUser;
		
	}
	@Override
	public List<UserIssue> getUserIssueByStatus(boolean searchstatus)throws Exception{
	List<UserIssue> outputIssues=getAllUserIssue().stream().filter((iss)->iss.getStatus()==searchstatus).collect(Collectors.toList());
	return outputIssues;
	}
	@Override
	public List<UserIssue> getUserIssueByCategory(String category)throws Exception{
	List<UserIssue> outputIssues=getAllUserIssue().stream().filter((iss)->iss.getCategory().equals(category)).collect(Collectors.toList());
	return outputIssues;
	}
	@Override
	public List<UserIssue> getUserIssueByDate(String localDate)throws Exception{
		List<UserIssue> outputIssues=getAllUserIssue().stream().filter((iss)->iss.getLocalDate().equals(localDate)).collect(Collectors.toList());
	return outputIssues;
	}
	
	@Override
	public List<UserIssue> getUserIssueByTitle(String issueTitle)throws Exception{
		List<UserIssue> outputIssues=getAllUserIssue().stream().filter((iss)->iss.getIssueTitle().equals(issueTitle)).collect(Collectors.toList());
	return outputIssues;
	}
	@Override
	public List<UserIssue> getUserIssuesBetweenIds(int id1,int id2)throws Exception{
		List<UserIssue> outputIssues=getAllUserIssue().stream().filter((iss)->iss.getIssueid()>=id1 && iss.getIssueid()<=id2).collect(Collectors.toList());
		return outputIssues;
		}
	

	@Override
	public String deleteUserIssue(int issueid) throws Exception{
		UserIssue UserToBeDeleted=userIssueRepository.getUserIssueByIssueid(issueid);
		userIssueRepository.delete(UserToBeDeleted);
		return "Deleted";
	}


	@Override
	public String deleteUserIssue(String searchUsername) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	
	}
