package DragAndDropTeste.DragAndDropTeste;

import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeFeed extends DefaultMutableTreeNode {
	public JTreeFeed(){
		super("Root");
	    DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
	    DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");
	    this.add(child1);
	    child1.add(new DefaultMutableTreeNode("Child 3"));
	    this.add(child2);
	}
	
	
}
