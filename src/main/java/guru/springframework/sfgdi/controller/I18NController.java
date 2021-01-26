package guru.springframework.sfgdi.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import guru.springframework.sfgdi.services.GreetingService;

@Controller
public class I18NController {
	private final GreetingService greetingService;

	public I18NController(@Qualifier("i18nService") GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
