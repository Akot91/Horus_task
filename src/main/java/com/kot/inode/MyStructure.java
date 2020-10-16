package com.kot.inode;

import java.util.List;

public class MyStructure implements IMStructure {

    private final List<INode> nodes;

    public MyStructure(ICompositeNode iCompositeNode) {
        nodes = iCompositeNode.getNodes();
    }

    @Override
    public INode findByCode(String code) {
        if (code == null) {
            throw new IMException("Parameter 'code' cannot be null. Required String. Cannot find any INode by null");
        }
        return nodes.stream()
                .filter(iNode -> code.equals(iNode.getCode()))
                .findAny()
                .orElse(null);
    }

    @Override
    public INode findByRenderer(String renderer) {
        if (renderer == null) {
            throw new IMException("Parameter 'render' cannot be null. Required String. Cannot find any INode by null");
        }
        return nodes.stream()
                .filter(iNode -> renderer.equals(iNode.getRenderer()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public int count() {
        return nodes.size();
    }

}
