package tu.search;
	//Initial Template for Java
	import java.util.Scanner;
	class Node
	{
	    int data;
	    Node left, right;
	    
	    Node(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	public class BinaryTree
	{
	    public static void main (String[] args) 
	    {
	         Scanner sc=new Scanner(System.in);
	          int t=sc.nextInt();
	          
	           while(t-->0){
	            int n=sc.nextInt();
	            if(n==0){
	                System.out.println(0);
	                continue;
	            }
	            Node root = null;
	            for(int i=0;i<n;i++){
	                int a=sc.nextInt();
	                int a1=sc.nextInt();
	                char lr=sc.next().charAt(0);
	                if(i==0){
	                    root=new Node(a);
	                    switch(lr){
	                        case 'L':root.left=new Node(a1);
	                        break;
	                        case 'R':root.right=new Node(a1);
	                        break;
	                    }
	                }
	                else{
	                    insert(root,a,a1,lr);
	                }
	            }
	            
	            GfG g=new GfG();
	            System.out.println(g.maxDiff(root));
	            
	        }
	    }
	    public static void insert(Node root,int a,int a1,char lr){
	        if(root==null){
	            return;
	        }
	        if(root.data==a){
	            switch(lr){
	                case 'L':root.left=new Node(a1);
	                break;
	                case 'R':root.right=new Node(a1);
	                break;
	            }
	            return;
	        }
	        insert(root.left,a,a1,lr);
	        insert(root.right,a,a1,lr);
	    }
	    
	    
	}


	/*Please note that it's Function problem i.e.
	you need to write your solution in the form of Function(s) only.
	Driver Code to call/invoke your function is mentioned above.*/

	//User function Template for Java
	//Back-end complete function Template for Java
	class GfG
	{   
		boolean max_dif_init=false;
		int mDiff=0;
	    boolean mx_init=false;
		int findMin1(Node root){
			
			if(root.left==null&&root.right==null){
				
	    		return root.data;
	    	}
	    	if(root.left!=null&&root.right==null){
	    		int l_node_value=findMin1(root.left);
	    		if(!mx_init){
		    		mDiff=root.data-l_node_value;
		    		mx_init=true;
		    	}
		    	else if(mDiff<root.data-l_node_value)
	    			mDiff=root.data-l_node_value;
	    		
	    		int smallest=l_node_value;
	    		if(smallest>root.data)
	    			smallest=root.data;
	    		return smallest;
	    	}
	    	if(root.right!=null&&root.left==null){
	    		int r_node_value=findMin1(root.right);
	    		if(!mx_init){
		    		mDiff=root.data-r_node_value;
		    		mx_init=true;
		    	}
		    	else if(mDiff<root.data-r_node_value)
	    			mDiff=root.data-r_node_value;
	    		int smallest=r_node_value;
	    		if(smallest>root.data)
	    			smallest=root.data;
	    		return smallest;
	    	}
	    	int l_node_value=findMin1(root.left);
	    	int r_node_value=findMin1(root.right);
	    	int smallest=l_node_value;
	    	if(r_node_value<smallest)
	    		smallest=r_node_value;
	    	if(!mx_init){
	    		mDiff=root.data-smallest;
	    		mx_init=true;
	    	}
	    	else if(mDiff<root.data-smallest)
    			mDiff=root.data-smallest;
	    	if(smallest>root.data)
	    		smallest=root.data;
	    	
	    	return smallest;
			
		}
	    int maxDiff(Node root)
	    {
	    	 
	    	 findMin1(root);
	    	return mDiff;
	    	
	    }
	}