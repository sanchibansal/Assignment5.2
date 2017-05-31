public class InterfaceStackExample{
	public static void main(String args[]){
		FixedStack f= new FixedStack();    //creating object of FixedStack
		VariableStack v= new VariableStack();    //creating object of VariableStack
		int val;
		
		System.out.println("Fixed stack operations");
		System.out.println("***********************");
		
		
		//push elements in fixedstack
		System.out.println("Push Operations");
		System.out.println("****************");
		f.init();
		f.push(10);
		f.push(20);
		f.push(30);
		f.push(40);
		
		
		//pop elements from fixedstack
		System.out.println("Pop Operations");
		System.out.println("****************");
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		val=f.pop();
		System.out.println("popped element = "+val);
		
		
		System.out.println("Variable stack operations");
		System.out.println("***********************");
		
		
		//push elements in variablestack
		System.out.println("Push Operations");
		System.out.println("****************");
		v.init();
		v.push(10);
		v.push(20);
		v.push(30);
		v.push(40);
				
		
		//pop elements from variablestack
		System.out.println("\nPop Operations");
		System.out.println("****************");
		val=v.pop();
		System.out.println("popped element = "+val);
		val=v.pop();
		System.out.println("popped element = "+val);
		val=v.pop();
		System.out.println("popped element = "+val);
		val=v.pop();
		System.out.println("popped element = "+val);
		
		
	}
}

interface Stack{
	final int MAX=5;
	void init();
	void push(int item);
	int pop();
	int peek();
	void traverse();
}
class FixedStack implements Stack{
	private int[] arr;
	private int top;
	public void init(){
		//create array of max size
		arr = new int[MAX];
		//set top to empty pos
		top = -1;
	}
	public void push(int item) {
		//check for overflow
		//check for full stack
		if(top == MAX-1){
			System.out.println("Overflow!");
		}
		
		top = top + 1;
		arr[top] = item;
	}
	public int pop(){
		int itempopped = 0;
		//check for underflow
		if(top == -1) {
			System.out.println("Underflow!");
		}
		
		itempopped = arr[top];
		arr[top] = 0;
		top = top -1;
		return itempopped;
	}
	public int peek(){
		//check for empty stack
		if(top == -1) {
			System.out.println("Empty Stack!");
		}
		return arr[top];
	}
	public void traverse() {
		//check for empty stack
		if(top == -1) {
			System.out.println("Empty Stack!");
		}
				
		for(int i=0 ; i<=top ; i++) {
			System.out.println(arr[i]);
		}
	}
}
/*class VariableStack implements Stack
*/ 
class VariableStack implements Stack{
	int size;
	private int top;
	private int[] s;

	public void init() {
		// TODO Auto-generated method stub
		s=new int[20];	// declaring an array for stack
		top=-1;				
	}
	VariableStack(){
		size =3;		//initializing size of the stack 
	}
	//	method to push elements in stack
	public void push(int i){
		//if size exceeds the initialized size add extra memory to stack
		if(top==size-1){
			System.out.println("\nAdding extra memory!!!");
			size++;
			top++;
			s[top]=i;
			System.out.println("value of stack---->");
			System.out.println();
			for(int j=1;j<=top;j++){
				System.out.print("   "+s[j]+"   ");
			}
		}
		else{
			top++;
			s[top]=i;
			System.out.println();
			System.out.println("value of stack---->");
			System.out.println();
			for(int j=1;j<=top;j++){
				System.out.print("   "+s[j]+"   ");
			}
		}
	}
	//method to pop elements from stack
	public int pop(){
		int itempopped = 0;
		//check for underflow
		if(top == -1) {
			System.out.println("Underflow!");
		}
		itempopped = s[top];
		s[top] = 0;
		top = top -1;
		return itempopped;
	}
	@Override
	public int peek() {
		//check for empty stack
		if(top == -1) {
			System.out.println("Empty Stack!");
		}
		return s[top];
	}

		@Override
	public void traverse() {
		//check for empty stack
		if(top == -1) {
			System.out.println("Empty Stack!");
		}
			
		for(int i=0 ; i<=top ; i++) {
			System.out.println(s[i]);
		}	
	}
}
	