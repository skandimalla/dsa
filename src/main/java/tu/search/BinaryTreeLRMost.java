package tu.search;
	import java.io.StreamTokenizer;
import java.util.Arrays;
//Initial Template for Java
import java.util.Scanner;
import java.util.StringTokenizer;
	class Node2
	{
	    int data;
	    Node2 left, right;
	    
	    Node2(int item)
	    {
	        data = item;
	        left = right = null;
	    }
	}
	public class BinaryTreeLRMost
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
	            Node2 root = null;
	            for(int i=0;i<n;i++){
	                int a=sc.nextInt();
	                int a1=sc.nextInt();
	                char lr=sc.next().charAt(0);
	                if(i==0){
	                    root=new Node2(a);
	                    switch(lr){
	                        case 'L':root.left=new Node2(a1);
	                        break;
	                        case 'R':root.right=new Node2(a1);
	                        break;
	                    }
	                }
	                else{
	                    insert(root,a,a1,lr);
	                }
	            }
	            
	            GfG2 g=new GfG2();
	            g.printLR(root);
	            
	        }
	    }
	    public static void insert(Node2 root,int a,int a1,char lr){
	        if(root==null){
	            return;
	        }
	        if(root.data==a){
	            switch(lr){
	                case 'L':root.left=new Node2(a1);
	                break;
	                case 'R':root.right=new Node2(a1);
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
	class GfG2
	{   int lH,rH;
	    int h;
	    StringBuilder sb=new StringBuilder("");
		void printLR(Node2 root)
		{
			getMinMax(root,0);
			h=(lH>rH)?lH:rH;
        for(int i=0;i<=h;i++){
        	
        	pData(root,i);
        	sb.append("-");
				
		}
		//System.out.println(sb.toString());
		StringTokenizer tkn=new StringTokenizer(sb.toString(),"-");
		while(tkn.hasMoreTokens()){
			//System.out.println(tkn.nextToken());
			String [] ele_array=tkn.nextToken().split(" ");
			//System.out.println(Arrays.toString(ele_array));
			if(ele_array.length==1){
				System.out.print(ele_array[0]+" ");
			}
			else if(ele_array.length>1){
				System.out.print(ele_array[0]+" "+ele_array[ele_array.length-1]+" ");
			}
			
		}
		}
		void  getMinMax(Node2 root,int hd){
			
			if(root==null)
				return;
			if(lH>hd)
				lH=hd;
			if(rH<hd)
				rH=hd;
			
			getMinMax(root.left,hd+1);
			getMinMax(root.right,hd+1);
		}
		void pData(Node2 root,int level){
			
			if(root==null){
				return;
			}
			if(level==0){
				sb.append(root.data+" ");
			}
				
			if(level>0){
				pData(root.left,level-1);
				pData(root.right,level-1);
				
			}
			

			
			
			
			
		}
        
	}