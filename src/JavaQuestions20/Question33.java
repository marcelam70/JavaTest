package JavaQuestions20;

		class Alpha{
			int ns; // m1.ns = 50---m2.ns = 125 ---m3.ns = 0
			static int s;//0-->125--> 125
			Alpha (int ns){
				if (s<ns) {
					s=ns;
				this.ns=ns;
				}
			}
		void doPrint() {
				System.out.println("ns = " + ns +"s = "+ s);
			}
	}
		public class Question33 {

			public static void main(String[] args) {

				Alpha m1=new Alpha(50);
				Alpha m2=new Alpha(125);
				Alpha m3=new Alpha(100);
				m1.doPrint();
				m2.doPrint();
				m3.doPrint();
			}
       //answer = ns = 50s = 125
			   // ns = 125s = 125
				//ns = 0s = 125

		{

	}
		}
