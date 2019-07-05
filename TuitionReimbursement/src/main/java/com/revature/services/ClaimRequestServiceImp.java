package com.revature.services;

import com.revature.dao.ClaimRequestDAO;
import com.revature.dao.ClaimRequestDAOimp;
import com.revature.pojos.ClaimRequests;

public class ClaimRequestServiceImp implements ClaimRequestService {

	private static ClaimRequestDAO crs = new ClaimRequestDAOimp();
	
    public void createNewForm(ClaimRequests claimrequests) {
        
        crs.createNewForm(claimrequests);
        
    }

	
	
}
