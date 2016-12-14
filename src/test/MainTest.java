package test;

import java.io.IOException;
import java.security.Provider;

import javax.swing.plaf.multi.MultiButtonUI;

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
import cn.arlen.chain.MyHandler;
import cn.arlen.command.ICommand;
import cn.arlen.command.InVoke;
import cn.arlen.command.MyCommand;
import cn.arlen.command.Received;
import cn.arlen.composite.Tree;
import cn.arlen.composite.TreeNode;
import cn.arlen.decorator.Decorator;
import cn.arlen.decorator.ISourceable;
import cn.arlen.decorator.Source;
import cn.arlen.facade.Computer;
import cn.arlen.factory.SendFactory;
import cn.arlen.interpreter.Contexted;
import cn.arlen.interpreter.Minused;
import cn.arlen.interpreter.Plused;
import cn.arlen.iterator.Collection;
import cn.arlen.iterator.Iterator;
import cn.arlen.iterator.MyCollection;
import cn.arlen.mediator.IMediator;
import cn.arlen.mediator.Mediator;
import cn.arlen.memento.Original;
import cn.arlen.memento.Storage;
import cn.arlen.morefactory.MoreSendFactory;
import cn.arlen.observer.ISubject;
import cn.arlen.observer.MySubject;
import cn.arlen.observer.Observer;
import cn.arlen.observer.Subject1;
import cn.arlen.observer.Subject2;
import cn.arlen.prototype.Prototype;
import cn.arlen.singleton.SingletonPerfect;
import cn.arlen.state.Context;
import cn.arlen.state.State;
import cn.arlen.staticfactory.StaticFactory;
import cn.arlen.strategy.ICalculator;
import cn.arlen.strategy.Minus;
import cn.arlen.strategy.Multiply;
import cn.arlen.strategy.Plus;
import cn.arlen.template.AbstractCalulate;
import cn.arlen.template.TemplatePlus;
import cn.arlen.visitor.ISubjected;
import cn.arlen.visitor.IVisitor;
import cn.arlen.visitor.Subject;
import cn.arlen.visitor.Visitor;
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
	/*public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished");
	}*/
	
	/**
	 * 策略模式，定义一系列的算法，使他们可以互相替换，且算法的变化不会
	 * 影响到使用算法的客户，需要设计一个接口，为一系列实现类提供统一的方法，
	 * 多个实现类实现该接口，设计一个抽象类
	 * @param args
	 */
	/*	public static void main(String[] args) {
		ICalculator calculator = new Plus();
		System.out.println("加法算法："+calculator.calculate("8+6"));
		
		ICalculator calculator1 = new Minus();
		System.out.println("减法算法："+calculator1.calculate("8-6"));
		
		ICalculator calculator2 = new Multiply();
		System.out.println("乘法算法："+calculator2.calculate("8*6"));
	}*/
	
	/**
	 * 模板方法模式，在抽象类中定义抽象方法，并在本类调用，具体实现让子类去操作
	 * @param args
	 */
	/*public static void main(String[] args) {
		AbstractCalulate abstractCalulate = new TemplatePlus();
		System.out.println(abstractCalulate.calulate("8+3","\\+"));
	}*/
	
	/**
	 * 观察者模式，当一个对象发生变化时，依赖该对象的类都会收到通知，并随之变化
	 * @param args
	 */
	/*public static void main(String[] args) {
		ISubject subject = new MySubject();
		Observer observer = new Subject1();
		subject.add(observer);
		subject.add(new Subject2());
//		subject.delete(observer);
		subject.operation();
	}*/
	
	/**
	 * 迭代子模式，顺序的访问聚集中的对象
	 * @param args
	 */
	/*public static void main(String[] args) {
		Collection collection = new MyCollection();
		Iterator it = collection.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}*/
	
	/**
	 * 责任链模式，多个对象，每个对象持有下一个对象的引用，这样
	 * 就会形成一条链，请求在这条链上的传递，直到某一对小决定
	 * 处理该请求
	 */
	/*public static void main(String[] args) {
		MyHandler handler1 = new MyHandler("deal1");
		MyHandler handler2 = new MyHandler("deal2");
		MyHandler handler3 = new MyHandler("deal3");
		
		handler1.setHandler(handler2);
		handler2.setHandler(handler3);
		
		handler1.operation();
	}*/
	
	/**
	 * 命令行模式，指令的一层层传递下去，有点类似将军下发命令，士兵去执行
	 */
	/*public static void main(String[] args) {
		Received received = new Received();
		ICommand command = new MyCommand(received);
		InVoke inVoke = new InVoke(command);
		inVoke.action();
	}*/
	
	
	/**
	 * 备忘录模式，保存类的属性或对象，在修改相关的属性以后，能回滚回去
	 * @param args
	 */
	/*public static void main(String[] args) {
		Original original = new Original("wdd");
		
		//创建备忘录
		Storage storage = new Storage(original.createMemento());
		
		//修改原始类
		System.out.println("初始化为："+original.getValue());
		
		original.setValue("niu");
		System.out.println("修改后的状态为："+original.getValue());
		
		//恢复原始类的状态
		original.restoreMemento(storage.getMemento());
		System.out.println("恢复后的状态为："+original.getValue());
	}*/
	
	/**
	 * 状态模式，状态的转换，根据不同的状态去执行相应的操作，如权限管理
	 * 状态切换等
	 * @param args
	 */
	/*	public static void main(String[] args) {
		State state1 = new State();
		Context context = new Context();
		context.setState(state1);
		state1.setValue("method1");
		context.method();
		
		state1.setValue("method2");
		context.method();
	}*/
	
	/**
	 * 访问者模式，访问者模式把数据结构和作用于结构上的操作解耦合，
	 * 使得操作集合可相对自由地演化，其缺点就是增加新的数据结构很困难。
	 * @param args
	 */
	/*public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		ISubjected subject = new Subject();
		subject.accept(visitor);
	}*/
	
	/**
	 * 中介模式，降低类的耦合度，因为如果类类之间有依赖关系，
		不利于功能的扩展和维护，因为只要修改一个对象，其他关联的
		对象都得修改，如果使用中介模式，只需关心和Mediator的关系，
		具体类类之间的关系及调度交给Mediator就行
	 * @param args
	 */
	/*public static void main(String[] args) {
		IMediator mediator = new Mediator();
		mediator.createMediator();
		mediator.workAll();
	}*/
	
	/**
	 * 解释器模式，一般用于OOP开发中，用的比较少，解析各种命令，如正则表达式中
	 * @param args
	 */
	/*public static void main(String[] args) {
		int result = new Minused().interpret
				((new Contexted(new Plused().interpret(new Contexted(9, 2)), 8)));
		System.out.println("current result:"+result);
	}*/
}