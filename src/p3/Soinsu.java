package p3;
//import java.util.ArrayList;
class Soinsu {

	public static void main(String[] args) {


//		Long value=x(600851475143l);
		long a=x(13195);
		System.out.println(a);
//		System.out.println(value);

		//		ArrayList <Long> vs=new ArrayList<>	();
		//		for(Long i=1l;i<value/2;i=i+2){
		//			if(value%i==0){
		//				vs.add(i);// 割り切れるもの,2は除く
		//			}
		//		}
		//		Long kore=0l;
		//		for(int i=0;i<vs.size();i++){
		//			for(int j=2;j<vs.get(i);j++){
		//				if(vs.get(i)%j!=0){
		//					kore=vs.get(i);
		//				}
		//			}
		////		}
		////		System.out.println(kore);
		////		for(Long i:vs){
		////			System.out.println(i);
		////		}
		//
		//	for(Long i=2l;i<Math.sqrt(value);i++){
		//		for(int j=2;j<i;j++){
		//		if(i/j==0){
		//			vs.add(i);
		//		}
		//	}
		//	}
		//	Long kore=0l;
		//	for(int i=0;i<vs.size();i++){
		//		if(value/vs.get(i)==0){
		//			kore=vs.get(i);
		//		}
		//	}
		//
		//	System.out.println(kore);
		//	}
	}
	static long x(long a){
		for(long i=(long)Math.sqrt(a);i>2;i--){
			if(a%i==0){
				return Math.max(x(i), x(a/i));
			}
		}
		return a;
	}

	}


