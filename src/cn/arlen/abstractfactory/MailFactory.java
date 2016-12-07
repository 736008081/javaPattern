package cn.arlen.abstractfactory;

import model.ISender;
import model.MailSender;

public class MailFactory implements IProvider{

	@Override
	public ISender Provider() {
		// TODO Auto-generated method stub
		return new MailSender();
	}

}
