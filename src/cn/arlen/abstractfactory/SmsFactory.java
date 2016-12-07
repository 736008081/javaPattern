package cn.arlen.abstractfactory;

import model.ISender;
import model.SmsSender;

public class SmsFactory implements IProvider{

	@Override
	public ISender Provider() {
		// TODO Auto-generated method stub
		return new SmsSender();
	}

}
