package DynamicProxyNullObject;

import java.util.Arrays;
import java.util.List;

/**
 * @author yuyz
 * @date 2019-01-05 22:42
 */
public class SnowRemovalRobot implements Robot{
    private String name;
    public SnowRemovalRobot(String name) {
        this.name = name;
    }
    @Override
    public String name() {
        return name;
    }

    @Override
    public String model() {
        return "SnowRot Series l1";
    }

    @Override
    public List<Operation> operations() {
        return Arrays.asList(
                new Operation() {
                    public String description() {
                        return "name" + " can shovel snow";
                    }
                    public void command() {
                        System.out.println(name + " shoveling snow");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can chip ice";
                    }
                    public void command() {
                        System.out.println(name + " chipping ice");
                    }
                },
                new Operation() {
                    public String description() {
                        return name + " can clear the roof";
                    }
                    public void command() {
                        System.out.println(name + " clearing roof");
                    }
                }
        );
    }

    public static void main(String[] args) {
        Robot.Test.test(new SnowRemovalRobot("Slusher"));
    }

}