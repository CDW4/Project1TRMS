package com.revature.dao;

import com.revature.pojos.ClaimRequests;

public interface ClaimRequestDAO {
	//create
	public void createNewForm(ClaimRequests claimrequests);
	//read
	public void viewFormSubmissions(ClaimRequests claimrequests);
	//update
	public void approveRequests(ClaimRequests claimrequests);
	//delete
	void denyRequests(ClaimRequests claimrequests);

}
