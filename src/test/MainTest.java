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
	/*public static void main(String[] args) {
		Tree tree = new Tree("A");
		TreeNode nodeB = new TreeNode("B");
		TreeNode nodeC = new TreeNode("C");
		
		nodeB.add(nodeC);
		tree.root.add(nodeB);
		System.out.println("build the tree finished");
	}*/
	
	/**
	 * ����ģʽ������һϵ�е��㷨��ʹ���ǿ��Ի����滻�����㷨�ı仯����
	 * Ӱ�쵽ʹ���㷨�Ŀͻ�����Ҫ���һ���ӿڣ�Ϊһϵ��ʵ�����ṩͳһ�ķ�����
	 * ���ʵ����ʵ�ָýӿڣ����һ��������
	 * @param args
	 */
	/*	public static void main(String[] args) {
		ICalculator calculator = new Plus();
		System.out.println("�ӷ��㷨��"+calculator.calculate("8+6"));
		
		ICalculator calculator1 = new Minus();
		System.out.println("�����㷨��"+calculator1.calculate("8-6"));
		
		ICalculator calculator2 = new Multiply();
		System.out.println("�˷��㷨��"+calculator2.calculate("8*6"));
	}*/
	
	/**
	 * ģ�巽��ģʽ���ڳ������ж�����󷽷������ڱ�����ã�����ʵ��������ȥ����
	 * @param args
	 */
	/*public static void main(String[] args) {
		AbstractCalulate abstractCalulate = new TemplatePlus();
		System.out.println(abstractCalulate.calulate("8+3","\\+"));
	}*/
	
	/**
	 * �۲���ģʽ����һ���������仯ʱ�������ö�����඼���յ�֪ͨ������֮�仯
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
	 * ������ģʽ��˳��ķ��ʾۼ��еĶ���
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
	 * ������ģʽ���������ÿ�����������һ����������ã�����
	 * �ͻ��γ�һ�������������������ϵĴ��ݣ�ֱ��ĳһ��С����
	 * ���������
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
	 * ������ģʽ��ָ���һ��㴫����ȥ���е����ƽ����·����ʿ��ȥִ��
	 */
	/*public static void main(String[] args) {
		Received received = new Received();
		ICommand command = new MyCommand(received);
		InVoke inVoke = new InVoke(command);
		inVoke.action();
	}*/
	
	
	/**
	 * ����¼ģʽ������������Ի�������޸���ص������Ժ��ܻع���ȥ
	 * @param args
	 */
	/*public static void main(String[] args) {
		Original original = new Original("wdd");
		
		//��������¼
		Storage storage = new Storage(original.createMemento());
		
		//�޸�ԭʼ��
		System.out.println("��ʼ��Ϊ��"+original.getValue());
		
		original.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ��"+original.getValue());
		
		//�ָ�ԭʼ���״̬
		original.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ��"+original.getValue());
	}*/
	
	/**
	 * ״̬ģʽ��״̬��ת�������ݲ�ͬ��״̬ȥִ����Ӧ�Ĳ�������Ȩ�޹���
	 * ״̬�л���
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
	 * ������ģʽ��������ģʽ�����ݽṹ�������ڽṹ�ϵĲ�������ϣ�
	 * ʹ�ò������Ͽ�������ɵ��ݻ�����ȱ����������µ����ݽṹ�����ѡ�
	 * @param args
	 */
	/*public static void main(String[] args) {
		IVisitor visitor = new Visitor();
		ISubjected subject = new Subject();
		subject.accept(visitor);
	}*/
	
	/**
	 * �н�ģʽ�����������϶ȣ���Ϊ�������֮����������ϵ��
		�����ڹ��ܵ���չ��ά������ΪֻҪ�޸�һ����������������
		���󶼵��޸ģ����ʹ���н�ģʽ��ֻ����ĺ�Mediator�Ĺ�ϵ��
		��������֮��Ĺ�ϵ�����Ƚ���Mediator����
	 * @param args
	 */
	/*public static void main(String[] args) {
		IMediator mediator = new Mediator();
		mediator.createMediator();
		mediator.workAll();
	}*/
	
	/**
	 * ������ģʽ��һ������OOP�����У��õıȽ��٣��������������������ʽ��
	 * @param args
	 */
	/*public static void main(String[] args) {
		int result = new Minused().interpret
				((new Contexted(new Plused().interpret(new Contexted(9, 2)), 8)));
		System.out.println("current result:"+result);
	}*/
}