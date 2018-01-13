import com.smart.beanfactory.MyBeanPostProcessor;
import com.smart.beanfactory.MyInstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App {

    public static void main(String[] args) {

        Resource resource = new ClassPathResource("beans.xml");

        DefaultListableBeanFactory listableBeanFactory = new DefaultListableBeanFactory();

        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(listableBeanFactory);
        reader.loadBeanDefinitions(resource);

        listableBeanFactory.addBeanPostProcessor(new MyBeanPostProcessor());
        listableBeanFactory.addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

        System.out.println(listableBeanFactory.getBean("car"));

        listableBeanFactory.destroySingletons();
    }
}
