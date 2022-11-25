package com.marketingapp10.utilities;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

@Component
public class EmailServiceImpl implements EmailService {
@Autowired
private JavaMailSender sendMail;
	@Override
	public void sendMail(String to, String sub, String body) {
      SimpleMailMessage mess=new SimpleMailMessage();
      mess.setTo(to);
      mess.setSubject(sub);
      mess.setText(body);
      sendMail.send(mess);
	}

}
