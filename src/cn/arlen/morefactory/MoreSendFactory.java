package cn.arlen.morefactory;

import model.ISender;
import model.MailSender;
import model.SmsSender;

public class MoreSendFactory {

	public ISender sendMail(){
		return new MailSender();
	}
	
	public ISender sendSms(){
		return new SmsSender();
	}
	
}
