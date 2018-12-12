package filters;

import publicInterface.Processor;

/**
 * 适配器模式
 * 适配器中的代码将接受你所拥有的接口,并产生你所需要的接口
 * 这种使用适配器的方式,FilterAdapter的构造器接受你所拥有的接口Filter
 * 然后生成具有你所需要的Processor接口,在FilterAdapter类中,用到了代理.
 * @author yuyz
 * @date 2018-10-31 9:17
 */
public class FilterAdapter implements Processor{
    Filter filter;
    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }
    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public Waveform process(Object input) {
        return (Waveform)filter.process((Waveform)input);
    }
}
