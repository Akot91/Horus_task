package com.kot.inode;

import org.junit.Assert;
import org.junit.Test;

public class MyStructureTestSuite {

    private final ICompositeNode iCompositeNode = new TestComposite();

    @Test
    public void shouldReturnINodesSize() {
        //Given
        MyStructure testee = new MyStructure(iCompositeNode);

        //When Then
        Assert.assertEquals(4, testee.count());
    }

    @Test(expected = IMException.class)
    public void shouldReturnExceptionWhenRenderIsNull() {
        //Given
        MyStructure testee = new MyStructure(iCompositeNode);

        //When Then
        testee.findByRenderer(null);
    }

    @Test(expected = IMException.class)
    public void shouldReturnExceptionWhenCodeIsNull() {
        //Given
        MyStructure testee = new MyStructure(iCompositeNode);

        //When Then
        testee.findByCode(null);
    }

    @Test
    public void shouldReturnINodeByCode() {
        //Given
        MyStructure testee = new MyStructure(iCompositeNode);

        //When
        INode expected = new TestNode("code 2", "render 2");

        //Then
        Assert.assertEquals(expected, testee.findByCode("code 2"));
    }

    @Test
    public void shouldReturnINodeByRender() {
        //Given
        MyStructure testee = new MyStructure(iCompositeNode);

        //When
        INode expected = new TestNode("code 3", "render 3");

        //Then
        Assert.assertEquals(expected, testee.findByRenderer("render 3"));
    }
}
