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
	 * 普通工厂模式，建立一个工厂类，对实现了同一接口的一些类进行实例的创建
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
	 * 多个工厂模式，对普通工程模式的改进，统一用一个工厂管理，不做类型区分
	 * @param args
	 */
	/*	public static void main(String[] args) {
			MoreSendFactory moreSendFactory = new MoreSendFactory();
			moreSendFactory.sendMail().send();
			moreSendFactory.sendSms().send();
		}*/
	
	/**
	 * 静态工厂模式，把多个工厂模式类设置为静态，避免创建实例
	 * @param args
	 */
		/*public static void main(String[] args) {
			StaticFactory.sendMail().send();
			StaticFactory.sendSms().send();
		}*/
	
	/**
	 * 抽象工厂模式，创建每个模块自己的工厂类，有利于扩展和增加新的模块，不用去动以前的模块，降低耦合
	 * @param args
	 */
	/*	public static void main(String[] args) {
			IProvider providerMail = new MailFactory();
			providerMail.Provider().send();
			
			IProvider providerSms = new SmsFactory();
			providerSms.Provider().send();
		}*/
	
	/**
	 * 单例模式，在一个JVM中，该对象只有一个实例存在
	 * @param args
	 */
	/*public static void main(String[] args) {
		SingletonPerfect singletonPerfect = SingletonPerfect.getInstance();
		singletonPerfect.sendMail();
	}*/
	
	/**
	 * 建造者模式，将各种产品集中起来进行管理，用来创建复合对象，
	 * 所谓复合对象就是指某个类具有不同的属性，其实建造者模式就是前面抽象工厂模式和最后的Test结合起来得到的
	 * @param args
	 */
	/*public static void main(String[] args) {
		Builder builder = new Builder();
		builder.providerMail(10);
	}*/
	
	/**
	 * 原型模式，对象的深浅复制
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
	 * 适配器模式,接口适配器，借助一个抽象类实现接口，而其子类可以根据需要实现对应的方法
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
	 * 装饰者模式，给一个对象增加一些新的功能，而且是动态的，
	 * 要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
	 * @param args
	 */
	/*	public static void main(String[] args) {
			ISourceable source = new Source();
			ISourceable sourceable = new Decorator(source);
			sourceable.method();
		}*/
	
	/**
	 * 外观模式，可以将类和类之间的关系配置到配置文件中，
	 * 而外观模式就是将他们的关系放在一个Facade类中，
	 * 降低了类类之间的耦合度，该模式中没有涉及到接口
	 * @param args
	 */
	/*public static void main(String[] args) {
		Computer computer = new Computer();
		computer.startup();
		computer.shutdown();
	}*/
	
	/**
	 * 桥接模式，把事物和其具体实现分开，将抽象化和实现化解耦
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
	 * 组合模式，将多个对象组合在一起进行操作，常用于表示树形结构中，
	 * 例如二叉树、树等
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
