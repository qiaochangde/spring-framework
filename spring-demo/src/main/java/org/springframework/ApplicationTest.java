package org.springframework;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.vo.Person;
import org.springframework.vo.SimpleBean;

public class ApplicationTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application.xml");
		Person person = context.getBean("person", Person.class);
		System.out.println(person.getName());

		SimpleBean bean = context.getBean(SimpleBean.class);
		bean.send();

		context.close();
	}
}
