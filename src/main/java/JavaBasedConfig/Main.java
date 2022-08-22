package JavaBasedConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import JavaBasedConfig.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.Annotation;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) {


        //Java Based
        ApplicationContext forStudent = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Student student = (Student) forStudent.getBean("student");
        String StudentName = student.getName();
        int StudentId = student.getId();

        System.out.println(StudentName);
        System.out.println(StudentId);


        //XML Config
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("Spring.xml");
        Address theAddy = (Address) ac.getBean("addy");
        String theCity = theAddy.getCity();
        String theState = theAddy.getState();
        String theCountry = theAddy.getCountry();
        String theZip = theAddy.getZipcode();

        System.out.println(theCity + " "  + theState + " "  + theCountry + " "  + theZip);



        //Annotation-based
        ApplicationContext forPhone = new ClassPathXmlApplicationContext("Spring.xml");
        Phone thePhone = (Phone) forPhone.getBean("fone");

        String phoneString = thePhone.getMob();
        System.out.println(phoneString);


    }
}
