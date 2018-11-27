package tu.search;

	//Initial Template for Java
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	class Node3
	{
	    int data;
	    Node3 left, right;
	    Node3(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	public class Nodes_without_sibling
	{
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t > 0)
	        {
	            HashMap<Integer, Node3> m = new HashMap<Integer, Node3> ();
	            int n = sc.nextInt();
	            Node3 root = null;
	            while (n > 0)
	            {
	                int n1 = sc.nextInt();
	                int n2 = sc.nextInt();
	                char lr = sc.next().charAt(0);
	                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
	                Node3 parent = m.get(n1);
	                if (parent == null)
	                {
	                    parent = new Node3(n1);
	                    m.put(n1, parent);
	                    if (root == null)
	                        root = parent;
	                }
	                Node3 child = new Node3(n2);
	                if (lr == 'L')
	                    parent.left = child;
	                else
	                    parent.right = child;
	                m.put(n2, child);
	                n--;
	            }
	            GfG3 g = new GfG3();
	            g.printSibling(root);
	            System.out.println();
	            t--;
				
	        }
	    }
	}

	class GfG3
	{
		void printSibling(Node3 node)
		{
			preOrder(node);
			System.out.println("");
			
		}
		
		void preOrder(Node3 node){
			
			if(node==null)
				return;
			if(node.left!=null&node.right==null){
				System.out.print(String.format("%d ", node.left.data));
				preOrder(node.left);
			}
			else if(node.right!=null&node.left==null){
				System.out.print(String.format("%d ", node.right.data));
				preOrder(node.right);
			}
			else{
			preOrder(node.left);
			preOrder(node.right);	
			} 
						
			
		}
	}