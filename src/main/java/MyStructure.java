import java.util.List;

public class MyStructure implements IMStructure {

    private final ICompositeNode iCompositeNode;
    private List<INode> nodes;

    public MyStructure(ICompositeNode iCompositeNode) {
        this.iCompositeNode = iCompositeNode;
        nodes = iCompositeNode.getNodes();
    }

    @Override
    public INode findByCode(String code) {
        if (code.equals(null)) {
            throw new NullPointerException("Parameter \'code\' cannot be null. Required String. Cannot find any INode by null");
        } else {
            return nodes.stream()
                    .filter(iNode -> iNode.getCode().equals(code))
                    .findAny().orElse(null);
        }
    }

    @Override
    public INode findByRenderer(String renderer) {
        if (renderer.equals(null)) {
            throw new NullPointerException("Parameter \'render\' cannot be null. Required String. Cannot find any INode by null");
        } else {
            return nodes.stream()
                    .filter(iNode -> iNode.getRenderer().equals(renderer))
                    .findFirst().orElse(null);
        }
    }

    @Override
    public int count() {
        return nodes.size();
    }
}
