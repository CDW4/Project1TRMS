package com.revature.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.pojos.ClaimRequests;
import com.revature.util.ConnectHub2;

public class ClaimRequestDAOimp implements ClaimRequestDAO{


		private static Connection conn = ConnectHub2.getConnection();

		
        public void createNewForm(ClaimRequests claimrequests) {
            
            
            String sql = "INSERT INTO request(claimrequestid, requestor, approver, employeerole, dateofclaim, startdateofevent, enddateofevent, timeofevent, locationofevent, descriptionofevent, costofevent,  gradingformat, typeofevent, workjustification, status, attachments, approvaltype, worktimemissed, eligiblereimbursement, availablereimbursement)" +
                    " VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement ps;
            
            try {
                ps = conn.prepareStatement(sql);
                
                ps.setInt(1, claimrequests.getClaimrequestid());
                ps.setInt(2, claimrequests.getRequestor());
                ps.setInt(3, claimrequests.getApprover());
                ps.setString(4, claimrequests.getEmployeerole());
                ps.setString(5, claimrequests.getDateofclaim());
                ps.setString(6, claimrequests.getStartdateofevent());
                ps.setString(7, claimrequests.getEnddateofevent());
                ps.setString(8, claimrequests.getTimeofevent());
                ps.setString(9, claimrequests.getLocationofevent());
                ps.setString(10, claimrequests.getDescriptionofevent());
                ps.setDouble(11, claimrequests.getCostofevent());
                ps.setString(12, claimrequests.getGradingformat());
                ps.setInt(13, claimrequests.getTypeofevent());
                ps.setString(14, claimrequests.getWorkjustification());
                ps.setString(15, claimrequests.getStatus());
                ps.setString(16, claimrequests.getAttachments());
                ps.setString(17, claimrequests.getApprovaltype());
                ps.setString(18, claimrequests.getWorktimemissed());
                ps.setString(19, claimrequests.getEligiblereimbursement());
                ps.setString(20, claimrequests.getAvailablereimbursement());
            
                 ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            
        }


		
		public void viewFormSubmissions(ClaimRequests claimrequests) {
	            
	            
	            String sql = "Select * from claimrequests";
	            
	            PreparedStatement ps;
	            
	            try {
	                ps = conn.prepareStatement(sql);
	                
	                ps.setInt(1, claimrequests.getClaimrequestid());
	                ps.setInt(2, claimrequests.getRequestor());
	                ps.setInt(3, claimrequests.getApprover());
	                ps.setString(4, claimrequests.getEmployeerole());
	                ps.setString(5, claimrequests.getDateofclaim());
	                ps.setString(6, claimrequests.getStartdateofevent());
	                ps.setString(7, claimrequests.getEnddateofevent());
	                ps.setString(8, claimrequests.getTimeofevent());
	                ps.setString(9, claimrequests.getLocationofevent());
	                ps.setString(10, claimrequests.getDescriptionofevent());
	                ps.setDouble(11, claimrequests.getCostofevent());
	                ps.setString(12, claimrequests.getGradingformat());
	                ps.setInt(13, claimrequests.getTypeofevent());
	                ps.setString(14, claimrequests.getWorkjustification());
	                ps.setString(15, claimrequests.getStatus());
	                ps.setString(16, claimrequests.getAttachments());
	                ps.setString(17, claimrequests.getApprovaltype());
	                ps.setString(18, claimrequests.getWorktimemissed());
	                ps.setString(19, claimrequests.getEligiblereimbursement());
	                ps.setString(20, claimrequests.getAvailablereimbursement());
	            
	                 ps.executeUpdate();
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
		}


		public void approveRequests(ClaimRequests claimrequests) {

            
            
            String sql = "UPDATE ClaimRequests " +

                    "SET approver = ?, " +

                    "status = ?, " +

                    "approvaltype = ?, " +

                    "eligiblereimbursements = ?, " +

                    "availabalereimbursement = ? WHERE claimrequestid = ?";
            
            PreparedStatement ps;
            
            try {
                ps = conn.prepareStatement(sql);
                
                ps.setInt(1, claimrequests.getClaimrequestid());
                ps.setInt(2, claimrequests.getRequestor());
                ps.setInt(3, claimrequests.getApprover());
                ps.setString(4, claimrequests.getEmployeerole());
                ps.setString(5, claimrequests.getDateofclaim());
                ps.setString(6, claimrequests.getStartdateofevent());
                ps.setString(7, claimrequests.getEnddateofevent());
                ps.setString(8, claimrequests.getTimeofevent());
                ps.setString(9, claimrequests.getLocationofevent());
                ps.setString(10, claimrequests.getDescriptionofevent());
                ps.setDouble(11, claimrequests.getCostofevent());
                ps.setString(12, claimrequests.getGradingformat());
                ps.setInt(13, claimrequests.getTypeofevent());
                ps.setString(14, claimrequests.getWorkjustification());
                ps.setString(15, claimrequests.getStatus());
                ps.setString(16, claimrequests.getAttachments());
                ps.setString(17, claimrequests.getApprovaltype());
                ps.setString(18, claimrequests.getWorktimemissed());
                ps.setString(19, claimrequests.getEligiblereimbursement());
                ps.setString(20, claimrequests.getAvailablereimbursement());
            
                 ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
			
		}


		public void denyRequests(ClaimRequests claimrequests) {

            
            
            String sql = "UPDATE ClaimRequests " +

                    "SET approver = ?, " +

                    "status = ?, " +

                    "approvaltype = ?, " +

                    "eligiblereimbursements = ?, " +

                    "availabalereimbursement = ? WHERE claimrequestid = ?";
            
            PreparedStatement ps;
            
            try {
                ps = conn.prepareStatement(sql);
                
                ps.setInt(1, claimrequests.getClaimrequestid());
                ps.setInt(2, claimrequests.getRequestor());
                ps.setInt(3, claimrequests.getApprover());
                ps.setString(4, claimrequests.getEmployeerole());
                ps.setString(5, claimrequests.getDateofclaim());
                ps.setString(6, claimrequests.getStartdateofevent());
                ps.setString(7, claimrequests.getEnddateofevent());
                ps.setString(8, claimrequests.getTimeofevent());
                ps.setString(9, claimrequests.getLocationofevent());
                ps.setString(10, claimrequests.getDescriptionofevent());
                ps.setDouble(11, claimrequests.getCostofevent());
                ps.setString(12, claimrequests.getGradingformat());
                ps.setInt(13, claimrequests.getTypeofevent());
                ps.setString(14, claimrequests.getWorkjustification());
                ps.setString(15, claimrequests.getStatus());
                ps.setString(16, claimrequests.getAttachments());
                ps.setString(17, claimrequests.getApprovaltype());
                ps.setString(18, claimrequests.getWorktimemissed());
                ps.setString(19, claimrequests.getEligiblereimbursement());
                ps.setString(20, claimrequests.getAvailablereimbursement());
            
                 ps.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
			
		}

		
}


