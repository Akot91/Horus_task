import java.util.Arrays;
import java.util.List;

public class TestComposite implements ICompositeNode {

    private List<INode> nodes = Arrays.asList(
            new TestNode("test", "test2"),
            new TestNode("code 2", "render 2"),
            new TestNode("code 3", "render 3"),
            new TestNode("code 4", "render 4"));

    @Override
    public List<INode> getNodes() {
        return nodes;
    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public String getRenderer() {
        return null;
    }
}
