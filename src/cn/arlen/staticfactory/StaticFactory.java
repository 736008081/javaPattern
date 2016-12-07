package cn.arlen.staticfactory;

import model.ISender;
import model.MailSender;
import model.SmsSender;

public class StaticFactory {
	
	public static ISender sendMail(){
		return new MailSender();
	}
	
	public static ISender sendSms(){
		return new SmsSender();
	}
}
