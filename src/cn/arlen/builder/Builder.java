package cn.arlen.builder;

import java.util.ArrayList;
import java.util.List;

import model.ISender;
import model.MailSender;
import model.SmsSender;

public class Builder {

	private List<ISender> listSender = new ArrayList<>();
	public void providerMail(int count){
		for(int i = 0;i<count;i++){
			listSender.add(new MailSender());
		}
	}
	
	public void providerSms(int count){
		for(int i = 0;i<count;i++){
			listSender.add(new SmsSender());
		}
	}
}
