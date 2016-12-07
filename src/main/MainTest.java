package main;

import java.io.IOException;
import java.security.Provider;

import cn.arlen.abstractfactory.IProvider;
import cn.arlen.abstractfactory.MailFactory;
import cn.arlen.abstractfactory.SmsFactory;
import cn.arlen.adapter.ChildWrapperSource;
import cn.arlen.adapter.ISource;
import cn.arlen.adapter.WrapperSource;
import cn.arlen.bridge.Bridge;
import cn.arlen.bridge.ISourceabled;
import cn.arlen.bridge.MyBridge;
import cn.arlen.bridge.SourceSub1;
import cn.arlen.bridge.SourceSub2;
import cn.arlen.builder.Builder;
import cn.arlen.composite.Tree;
import cn.arlen.composite.TreeNode;
import cn.arlen.decorator.Decorator;
import cn.arlen.decorator.ISourceable;
import cn.arlen.decorator.Source;
import cn.arlen.facade.Computer;
import cn.arlen.factory.SendFactory;
import cn.arlen.morefactory.MoreSendFactory;
import cn.arlen.prototype.Prototype;
import cn.arlen.singleton.SingletonPerfect;
import cn.arlen.staticfactory.StaticFactory;
import model.ISender;

public class MainTest {
	/**
	 * ��ͨ����ģʽ������һ�������࣬��ʵ����ͬһ�ӿڵ�һЩ�����ʵ���Ĵ���
	 * @param args
	 */
	/*public static void main(String[] args) {
		SendFactory sendFactory = new SendFactory();
		ISender mailSender = sendFactory.product("mail");
		mailSender.send();
		
		ISender smsSender = sendFactory.product("sms");
		smsSender.send();
	}*/
	
	/**
	 * �������ģʽ������ͨ����ģʽ�ĸĽ���ͳһ��һ����������������������
	 * @param args
	 */
	/*	public static void main(String[] args) {
			MoreSendFactory moreSendFactory = new MoreSendFactory();
			moreSendFactory.sendMail().send();
			moreSendFactory.sendSms().send();
		}*/
	
	/**
	 * ��̬����ģʽ���Ѷ������ģʽ������Ϊ��̬�����ⴴ��ʵ��
	 * @param args
	 */
		/*public static void main(String[] args) {
			StaticFactory.sendMail().send();
			StaticFactory.sendSms().send();
		}*/
	
	/**
	 * ���󹤳�ģʽ������ÿ��ģ���Լ��Ĺ����࣬��������չ�������µ�ģ�飬����ȥ����ǰ��ģ�飬�������
	 * @param args
	 */
	/*	public static void main(String[] args) {
			IProvider providerMail = new MailFactory();
			providerMail.Provider().send();
			
			IProvider providerSms = new SmsFactory();
			providerSms.Provider().send();
		}*/
	
	/**
	 * ����ģʽ����һ��JVM�У��ö���ֻ��һ��ʵ������
	 * @param args
	 */
	/*public static void main(String[] args) {
		SingletonPerfect singletonPerfect = SingletonPerfect.getInstance();
		singletonPerfect.sendMail();
	}*/
	
	/**
	 * ������ģʽ�������ֲ�Ʒ�����������й��������������϶���
	 * ��ν���϶������ָĳ������в�ͬ�����ԣ���ʵ������ģʽ����ǰ����󹤳�ģʽ������Test��������õ���
	 * @param args
	 */
	/*public static void main(String[] args) {
		Builder builder = new Builder();
		builder.providerMail(10);
	}*/
	
	/**
	 * ԭ��ģʽ���������ǳ����
	 * @param args
	 * @throws CloneNotSupportedException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	/*public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException {
		Prototype prototype = new Prototype();
		Prototype prototype2 = (Prototype) prototype.clone();
		Prototype prototype3 = (Prototype) prototype.deepClone();
	}*/
	
	/**
	 * ������ģʽ,�ӿ�������������һ��������ʵ�ֽӿڣ�����������Ը�����Ҫʵ�ֶ�Ӧ�ķ���
	 * @param args
	 */
/*	public static void main(String[] args) {
		ISource source = new ChildWrapperSource();
		source.method1();
		source.method2();
		
		ISource source2 = new WrapperSource() {
			@Override
			public void method2() {
				super.method2();
				System.out.println("method2");
			}
		};
		source2.method2();
	}*/
	
	/**
	 * װ����ģʽ����һ����������һЩ�µĹ��ܣ������Ƕ�̬�ģ�
	 * Ҫ��װ�ζ���ͱ�װ�ζ���ʵ��ͬһ���ӿڣ�װ�ζ�����б�װ�ζ����ʵ��
	 * @param args
	 */
	/*	public static void main(String[] args) {
			ISourceable source = new Source();
			ISourceable sourceable = new Decorator(source);
			sourceable.method();
		}*/
	
	/**
	 * ���ģʽ�����Խ������֮��Ĺ�ϵ���õ������ļ��У�
	 * �����ģʽ���ǽ����ǵĹ�ϵ����һ��Facade���У�
	 * ����������֮�����϶ȣ���ģʽ��û���漰���ӿ�
	 * @param args
	 */
	/*public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}*/
	
	/**
	 * �Ž�ģʽ��������������ʵ�ַֿ��������󻯺�ʵ�ֻ�����
	 * @param args
	 */
	/*public static void main(String[] args) {
		Bridge bridge = new MyBridge();
		ISourceabled sourceable = new SourceSub1();
		bridge.setSource(sourceable);
		bridge.method();
		
		ISourceabled sourceabled = new SourceSub2();
		bridge.setSource(sourceabled);
		bridge.method();
	}*/
	
	/**
	 * ���ģʽ����������������һ����в����������ڱ�ʾ���νṹ�У�
	 * ���������������
	 * @param args
	 */
	public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished");
	}
}
