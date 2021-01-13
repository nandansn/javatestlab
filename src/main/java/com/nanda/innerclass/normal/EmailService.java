package com.nanda.innerclass.normal;

public interface EmailService {
	
	public void sendMail(EmailDetails emailDetails);
	
	class EmailDetails {
		String toName;
		String fromName;
		
	}

}
