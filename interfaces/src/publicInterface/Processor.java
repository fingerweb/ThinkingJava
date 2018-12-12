package publicInterface;

/**
 * @author yuyz
 * @date 2018-10-30 21:21
 */
public interface Processor {
    String name();
    Object process(Object input);
}
