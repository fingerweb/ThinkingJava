package factory;

/**
 * @author yuyz
 * @date 2018-10-30 22:03
 */
interface Service {
    void method1();
    void method2();
}
interface ServiceFactory {
    Service getService();
}
class Implementation1 implements Service {
    public void method1(){
        System.out.println("Implementation1.method1()");
    }
    public void method2() {
        System.out.println("Implementation1.method2()");
    }
}
class Implementation1Factory implements ServiceFactory{
    public Service getService() {
        return new Implementation1();
    }
}
class Implementation2 implements Service {
    public void method1(){
        System.out.println("Implementation2.method1()");
    }
    public void method2() {
        System.out.println("Implementation2.method2()");
    }
}
class Implementation2Factory implements ServiceFactory{
    public Service getService() {
        return new Implementation2();
    }
}
public class  Factories {
    public static void ServiceConsumer(ServiceFactory serviceFactory) {
        Service service = serviceFactory.getService();
        service.method1();
        service.method2();
    }

    public static void main(String[] args) {
        ServiceConsumer(new Implementation1Factory());
        ServiceConsumer(new Implementation2Factory());
    }
}
