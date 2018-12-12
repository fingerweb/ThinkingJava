import publicInterface.Processor;

/**
 * @author yuyz
 * @date 2018-10-30 21:33
 */
public class Apply {
    public static void process(Processor processor, Object input){
        System.out.println("Using Processor " + processor.name());
        System.out.println(processor.process(input));
    }
}
