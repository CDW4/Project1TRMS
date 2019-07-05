package com.revature.pojos;

public class Event {
	
	private String eventName; 
	
	private boolean eventEligibility;

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public boolean isEventEligibility() {
		return eventEligibility;
	}

	public void setEventEligibility(boolean eventEligibility) {
		this.eventEligibility = eventEligibility;
	}

	public Event(String eventName, boolean eventEligibility) {
		super();
		this.eventName = eventName;
		this.eventEligibility = eventEligibility;
	}

	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (eventEligibility ? 1231 : 1237);
		result = prime * result + ((eventName == null) ? 0 : eventName.hashCode());
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
		Event other = (Event) obj;
		if (eventEligibility != other.eventEligibility)
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Event [eventName=" + eventName + ", eventEligibility=" + eventEligibility + "]";
	}

}
