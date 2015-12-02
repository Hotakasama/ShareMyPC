
class P14 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a=ans(1,1000000);
//		int b=col(837799);
//		int a=col(910107);
//		System.out.println(b);
		System.out.println(a);
	}

	static int col(long f){
		int count=0;

		while(f>1){
			count++;
			if(f%2==0) f=f/2;
			else f=3*f+1;
		}
		return count;
	}

	static int ans(int min,int m){
		int num=1;
		int count=1;
		int max=1;
		int iter=min;

		while(iter<m){
			count=col(iter);
			if(count>max){
				max=count;
				num=iter;
			}
			iter++;
		}
		return num;
	}
}
