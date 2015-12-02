package p2;
import java.util.ArrayList;
class Fib {

	public static void main(String[] args) {

		ArrayList<Integer> fib=new ArrayList<Integer>();
		fib.add(1);// 初期値
		fib.add(2);
		int sum=0;
		int n=2;
		while(fib.get(n-2)<4000000){// 数列を作る
			fib.add(fib.get(n-1)+fib.get(n-2));
			n++;
		}
		for(int i=1;i<fib.size();i++){
			if(fib.get(i)%2==0) sum+=fib.get(i);
		}
		System.out.println(sum);
	}

}
