import java.util.Objects;

public class TestNode implements INode {
    private String code;
    private String render;

    public TestNode(String code, String render) {
        this.code = code;
        this.render = render;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getRenderer() {
        return render;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestNode testNode = (TestNode) o;
        return Objects.equals(code, testNode.code) &&
                Objects.equals(render, testNode.render);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, render);
    }

    @Override
    public String toString() {
        return "TestNode{" +
                "code='" + code + '\'' +
                ", render='" + render + '\'' +
                '}';
    }
}
