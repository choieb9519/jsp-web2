package sample2.listener;

import java.util.TimeZone;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class Sample2AppListener
 *
 */
@WebListener
public class Sample2AppListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public Sample2AppListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    	TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
    }   //다른 메소드보다 먼저 실행된다고 명시, 타임존 명시
	
}
