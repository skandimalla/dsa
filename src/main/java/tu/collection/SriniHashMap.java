package tu.collection;

public class SriniHashMap {
	
	private int bucket_size=16;
	private Object[] buckets_array= new Object[bucket_size];
	
	public void put(Object key,Object value){
		
		Key keyObj=new Key((String)key);
		int index = keyObj.hashCode()&(bucket_size-1);
		Node root=(Node) buckets_array[index];
		if(root==null){
			
			buckets_array[index]=new Node(keyObj,null,value);
			
		}
		else{
			Node node=root;
			while(node.next!=null){
				node=node.next;
			}
			node.next=new Node(keyObj,null,value);
		}
		
	}
	public Object get(Object key){
		
		Key keyObj=new Key((String)key);
		int index = keyObj.hashCode()&(bucket_size-1);
		Node root=(Node) buckets_array[index];
        if(root==null){
			return null;
		}
        else{
        	Node node=root;
        	while(node!=null){
        		if(node.getKey().getKey().equals((String)key)){
        			return node.value;
        			
        		}
        		node=node.next;
        	}
        }
        return null;
		
	}
	public String toString(){
		
		for(int i=0;i<bucket_size;i++){
			System.out.print(String.format("[%s]->",i));
			Node root=(Node)buckets_array[i];
			while(root!=null){
				System.out.print(String.format("%s->",root.key.getKey()));
				root=root.next;
			}
			System.out.println("\n");
			
		}
		return null;
		
	}
	public static void main(String[] args){
		
		SriniHashMap srini=new SriniHashMap();
		srini.put("one", "who is this1");
		srini.put("two", "who is this2");
		srini.put("three", "who is this3");
		srini.put("onetwo", "who is this12");
		srini.toString();
		System.out.println(srini.get("one"));
		System.out.println(srini.get("onetwo"));
		
	}

	
	
	

}
class Key{
	
	
	
	private String key;
	
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Key(String key){
		this.key=key;
	}
    public boolean equal(Object obj){
		return key.equals((String)obj);
	}
	public int hashCode(){
		return (int)key.charAt(0);
	}
	
}
class Node{
	Key key;
	Object value;
	public Key getKey() {
		return key;
	}

	public void setKey(Key key) {
		this.key = key;
	}

	Node next=null;
	
	public Node(Key key,Node next,Object value){
		this.key=key;
		this.next=next;
		this.value=value;
		
	}
	
}
