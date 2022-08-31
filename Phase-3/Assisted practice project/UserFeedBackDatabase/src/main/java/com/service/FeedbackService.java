package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Feedback;
import com.dao.FeedbackDAO;

@Service
public class FeedbackService {
	@Autowired
	FeedbackDAO feedbackDao;
	
	public String storeFeedback(Feedback feedback) {
		if(feedbackDao.storeFeedback(feedback)>0) {
			return "Record stored";
		}else {
			return "Record didn't store";
		}
	}
}
