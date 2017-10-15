
import material.SimpleObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunClientRun {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        "client.xml"
                );
        SimpleObject simpleObject = context.getBean(SimpleObject.class);
        simpleObject.executeServerObject();
    }
}
