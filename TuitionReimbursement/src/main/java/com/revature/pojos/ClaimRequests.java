package com.revature.pojos;

public class ClaimRequests {
	
	private int claimrequestid; 
	private int requestor; 
	private int approver;
	private String employeerole;
	private String dateofclaim;
	private String startdateofevent;
	private String enddateofevent;
	private String timeofevent;
	private String locationofevent;
	private String descriptionofevent; 
	private double costofevent; 
	private String gradingformat;
	private int typeofevent;
	private String workjustification;
	private String status; 
	private String attachments;
	private String approvaltype;
	private String worktimemissed;
	private String eligiblereimbursement;
	private String availablereimbursement;
	
	public int getClaimrequestid() {
		return claimrequestid;
	}
	public void setClaimrequestid(int claimrequestid) {
		this.claimrequestid = claimrequestid;
	}
	public int getRequestor() {
		return requestor;
	}
	public void setRequestor(int requestor) {
		this.requestor = requestor;
	}
	public int getApprover() {
		return approver;
	}
	public void setApprover(int approver) {
		this.approver = approver;
	}
	public String getEmployeerole() {
		return employeerole;
	}
	public void setEmployeerole(String employeerole) {
		this.employeerole = employeerole;
	}
	public String getDateofclaim() {
		return dateofclaim;
	}
	public void setDateofclaim(String dateofclaim) {
		this.dateofclaim = dateofclaim;
	}
	public String getStartdateofevent() {
		return startdateofevent;
	}
	public void setStartdateofevent(String startdateofevent) {
		this.startdateofevent = startdateofevent;
	}
	public String getEnddateofevent() {
		return enddateofevent;
	}
	public void setEnddateofevent(String enddateofevent) {
		this.enddateofevent = enddateofevent;
	}
	public String getTimeofevent() {
		return timeofevent;
	}
	public void setTimeofevent(String timeofevent) {
		this.timeofevent = timeofevent;
	}
	public String getLocationofevent() {
		return locationofevent;
	}
	public void setLocationofevent(String locationofevent) {
		this.locationofevent = locationofevent;
	}
	public String getDescriptionofevent() {
		return descriptionofevent;
	}
	public void setDescriptionofevent(String descriptionofevent) {
		this.descriptionofevent = descriptionofevent;
	}
	public double getCostofevent() {
		return costofevent;
	}
	public void setCostofevent(double costofevent) {
		this.costofevent = costofevent;
	}
	public String getGradingformat() {
		return gradingformat;
	}
	public void setGradingformat(String gradingformat) {
		this.gradingformat = gradingformat;
	}
	public int getTypeofevent() {
		return typeofevent;
	}
	public void setTypeofevent(int typeofevent) {
		this.typeofevent = typeofevent;
	}
	public String getWorkjustification() {
		return workjustification;
	}
	public void setWorkjustification(String workjustification) {
		this.workjustification = workjustification;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAttachments() {
		return attachments;
	}
	public void setAttachments(String attachments) {
		this.attachments = attachments;
	}
	public String getApprovaltype() {
		return approvaltype;
	}
	public void setApprovaltype(String approvaltype) {
		this.approvaltype = approvaltype;
	}
	public String getWorktimemissed() {
		return worktimemissed;
	}
	public void setWorktimemissed(String worktimemissed) {
		this.worktimemissed = worktimemissed;
	}
	public String getEligiblereimbursement() {
		return eligiblereimbursement;
	}
	public void setEligiblereimbursement(String eligiblereimbursement) {
		this.eligiblereimbursement = eligiblereimbursement;
	}
	public String getAvailablereimbursement() {
		return availablereimbursement;
	}
	public void setAvailablereimbursement(String availablereimbursement) {
		this.availablereimbursement = availablereimbursement;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((approvaltype == null) ? 0 : approvaltype.hashCode());
		result = prime * result + approver;
		result = prime * result + ((attachments == null) ? 0 : attachments.hashCode());
		result = prime * result + ((availablereimbursement == null) ? 0 : availablereimbursement.hashCode());
		result = prime * result + claimrequestid;
		long temp;
		temp = Double.doubleToLongBits(costofevent);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((dateofclaim == null) ? 0 : dateofclaim.hashCode());
		result = prime * result + ((descriptionofevent == null) ? 0 : descriptionofevent.hashCode());
		result = prime * result + ((eligiblereimbursement == null) ? 0 : eligiblereimbursement.hashCode());
		result = prime * result + ((employeerole == null) ? 0 : employeerole.hashCode());
		result = prime * result + ((enddateofevent == null) ? 0 : enddateofevent.hashCode());
		result = prime * result + ((gradingformat == null) ? 0 : gradingformat.hashCode());
		result = prime * result + ((locationofevent == null) ? 0 : locationofevent.hashCode());
		result = prime * result + requestor;
		result = prime * result + ((startdateofevent == null) ? 0 : startdateofevent.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((timeofevent == null) ? 0 : timeofevent.hashCode());
		result = prime * result + typeofevent;
		result = prime * result + ((workjustification == null) ? 0 : workjustification.hashCode());
		result = prime * result + ((worktimemissed == null) ? 0 : worktimemissed.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClaimRequests other = (ClaimRequests) obj;
		if (approvaltype == null) {
			if (other.approvaltype != null)
				return false;
		} else if (!approvaltype.equals(other.approvaltype))
			return false;
		if (approver != other.approver)
			return false;
		if (attachments == null) {
			if (other.attachments != null)
				return false;
		} else if (!attachments.equals(other.attachments))
			return false;
		if (availablereimbursement == null) {
			if (other.availablereimbursement != null)
				return false;
		} else if (!availablereimbursement.equals(other.availablereimbursement))
			return false;
		if (claimrequestid != other.claimrequestid)
			return false;
		if (Double.doubleToLongBits(costofevent) != Double.doubleToLongBits(other.costofevent))
			return false;
		if (dateofclaim == null) {
			if (other.dateofclaim != null)
				return false;
		} else if (!dateofclaim.equals(other.dateofclaim))
			return false;
		if (descriptionofevent == null) {
			if (other.descriptionofevent != null)
				return false;
		} else if (!descriptionofevent.equals(other.descriptionofevent))
			return false;
		if (eligiblereimbursement == null) {
			if (other.eligiblereimbursement != null)
				return false;
		} else if (!eligiblereimbursement.equals(other.eligiblereimbursement))
			return false;
		if (employeerole == null) {
			if (other.employeerole != null)
				return false;
		} else if (!employeerole.equals(other.employeerole))
			return false;
		if (enddateofevent == null) {
			if (other.enddateofevent != null)
				return false;
		} else if (!enddateofevent.equals(other.enddateofevent))
			return false;
		if (gradingformat == null) {
			if (other.gradingformat != null)
				return false;
		} else if (!gradingformat.equals(other.gradingformat))
			return false;
		if (locationofevent == null) {
			if (other.locationofevent != null)
				return false;
		} else if (!locationofevent.equals(other.locationofevent))
			return false;
		if (requestor != other.requestor)
			return false;
		if (startdateofevent == null) {
			if (other.startdateofevent != null)
				return false;
		} else if (!startdateofevent.equals(other.startdateofevent))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (timeofevent == null) {
			if (other.timeofevent != null)
				return false;
		} else if (!timeofevent.equals(other.timeofevent))
			return false;
		if (typeofevent != other.typeofevent)
			return false;
		if (workjustification == null) {
			if (other.workjustification != null)
				return false;
		} else if (!workjustification.equals(other.workjustification))
			return false;
		if (worktimemissed == null) {
			if (other.worktimemissed != null)
				return false;
		} else if (!worktimemissed.equals(other.worktimemissed))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ClaimRequests [claimrequestid=" + claimrequestid + ", requestor=" + requestor + ", approver=" + approver
				+ ", employeerole=" + employeerole + ", dateofclaim=" + dateofclaim + ", startdateofevent="
				+ startdateofevent + ", enddateofevent=" + enddateofevent + ", timeofevent=" + timeofevent
				+ ", locationofevent=" + locationofevent + ", descriptionofevent=" + descriptionofevent
				+ ", costofevent=" + costofevent + ", gradingformat=" + gradingformat + ", typeofevent=" + typeofevent
				+ ", workjustification=" + workjustification + ", status=" + status + ", attachments=" + attachments
				+ ", approvaltype=" + approvaltype + ", worktimemissed=" + worktimemissed + ", eligiblereimbursement="
				+ eligiblereimbursement + ", availablereimbursement=" + availablereimbursement + "]";
	}
	public ClaimRequests(int requestor, String dateofclaim, String startdateofevent, String enddateofevent,
			String timeofevent, String locationofevent, String descriptionofevent, double costofevent,
			String gradingformat, int typeofevent, String workjustification) {
		super();
		this.requestor = requestor;
		this.dateofclaim = dateofclaim;
		this.startdateofevent = startdateofevent;
		this.enddateofevent = enddateofevent;
		this.timeofevent = timeofevent;
		this.locationofevent = locationofevent;
		this.descriptionofevent = descriptionofevent;
		this.costofevent = costofevent;
		this.gradingformat = gradingformat;
		this.typeofevent = typeofevent;
		this.workjustification = workjustification;
	}
	
	
	

}
