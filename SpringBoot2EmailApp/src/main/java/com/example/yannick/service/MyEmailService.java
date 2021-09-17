package com.example.yannick.service;

import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MyEmailService {
	@Autowired
	private JavaMailSender sender;
	boolean sent=false;
	
	public Boolean send(String to, String cc[], String bcc[], String subject, String text, org.springframework.core.io.Resource file ) {
		try {
			//1.create one empty message 
			MimeMessage message=sender.createMimeMessage();
			//2. Fill  details(message, attachment exist ?)
			MimeMessageHelper helper=new MimeMessageHelper(message, file!=null?true:false);
			helper.setTo(to);
			if(cc!=null&&cc.length>0) {
				helper.setCc(cc);
			}
			if(bcc!=null&&bcc.length>0) {
				helper.setBcc(bcc);
			}
			 helper.setSubject(subject);
			 //If we are sending only text 
			 helper.setText(text);
			 //If we are sending html data 
			 helper.setText(text, true);
			 if(file!=null) {
				 helper.addAttachment(file.getFilename(), file);
			 }
			 //3. send email 
			 sender.send(message);
			 sent=true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return sent;
	}  	
	

}
