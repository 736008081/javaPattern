package cn.arlen.factory;

import model.ISender;
import model.MailSender;
import model.SmsSender;

public class SendFactory {

	public ISender product(String type){
		if("mail".equals(type)){
			return new MailSender();
		}else if("sms".equals(type)){
			return new SmsSender();
		}else{
			System.out.println("请输入正确的类型");
			return null;
		}
	}
	
}
