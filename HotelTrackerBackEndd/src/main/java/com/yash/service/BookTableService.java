package com.yash.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.yash.model.BookTable;
import com.yash.repository.BookTableRepositry;
@Service
public class BookTableService {
	
	@Autowired
	BookTableRepositry btr;
	
	public BookTable save(BookTable booktable) {
		
		return btr.save(booktable);
	}

	@Autowired private JavaMailSender javaMailSender;

	@Value("${spring.mail.username}") private String sender;

	// Method 1
	// To send a simple email
	public String sendSimpleMail(BookTable details)
	{

		// Try block to check for exceptions
		try {

			// Creating a simple mail message
			SimpleMailMessage mailMessage
				= new SimpleMailMessage();
BookTable b=new BookTable();
			// Setting up necessary details
			mailMessage.setFrom(sender);
			mailMessage.setTo(b.getEmail());

			// Sending the mail
			javaMailSender.send(mailMessage);
			return "Mail Sent Successfully...";
		}

		// Catch block to handle the exceptions
		catch (Exception e) {
			return "Error while Sending Mail";
		}
	}

}
