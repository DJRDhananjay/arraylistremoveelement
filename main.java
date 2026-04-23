import java.util.*;
public class Main
{
	public static void main(String[] args) {
	List<Integer>list=new ArrayList(Arrays.asList(2,6,7,9,10));
	int target=7;
	for(int i=0;i<list.size()-1;i++){
	    int num=list.get(i);
	    if(target==num){
	        list.remove(i);
	        break;
	    }
	    }
	    System.out.print(list);
	}
	}
