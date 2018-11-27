package tu.search;

	//Initial Template for Java
	import java.util.*;
	import java.lang.*;
	import java.io.*;
	class Node4
	{
	    int data;
	    Node4 left, right;
	    Node4(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	public class HeightOfTree
	{
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        int t = sc.nextInt();
	        while (t > 0)
	        {
	            HashMap<Integer, Node4> m = new HashMap<Integer, Node4> ();
	            int n = sc.nextInt();
	            Node4 root = null;
	            while (n > 0)
	            {
	                int n1 = sc.nextInt();
	                int n2 = sc.nextInt();
	                char lr = sc.next().charAt(0);
	                //  cout << n1 << " " << n2 << " " << (char)lr << endl;
	                Node4 parent = m.get(n1);
	                if (parent == null)
	                {
	                    parent = new Node4(n1);
	                    m.put(n1, parent);
	                    if (root == null)
	                        root = parent;
	                }
	                Node4 child = new Node4(n2);
	                if (lr == 'L')
	                    parent.left = child;
	                else
	                    parent.right = child;
	                m.put(n2, child);
	                n--;
	            }
	            GfG4 g = new GfG4();
	            g.printheight(root);
	            System.out.println();
	            t--;
				
	        }
	    }
	}

	class GfG4
	{
		void printheight(Node4 node)
		{
			
			System.out.println(getDepth(node));
			
		}
		int getDepth(Node4 node){
			
			if(node==null)
				return 0;
			int l_depth=getDepth(node.left);
			int r_depth=getDepth(node.right);
			int depth=l_depth>r_depth?l_depth:r_depth;
			depth=depth+1;
			return depth;
			
		}
		
		
	}