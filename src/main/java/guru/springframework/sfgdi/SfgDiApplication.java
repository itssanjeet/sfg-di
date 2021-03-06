package guru.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import guru.springframework.sfgdi.controller.ConstructorInjectedController;
import guru.springframework.sfgdi.controller.I18NController;
import guru.springframework.sfgdi.controller.MyController;
import guru.springframework.sfgdi.controller.PropertyInjectedController;
import guru.springframework.sfgdi.controller.SetterInjectedController;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);
		
		System.out.println("-------I18N");
		I18NController i18nController = (I18NController)ctx.getBean("i18NController");
		System.out.println(i18nController.sayHello());
		
		System.out.println("-------Primary");
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println(myController.sayHello());
		
		System.out.println("-------Property");
		PropertyInjectedController propertyInjectedController = 
				(PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("-------Setter");
		SetterInjectedController setterInjectedController = 
				(SetterInjectedController)ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("-------Constructor");
		ConstructorInjectedController constructorInjectedController = 
				(ConstructorInjectedController)ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
