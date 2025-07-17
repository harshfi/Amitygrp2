package Lec14;

public class PathFind {

	public static void main(String[] args) {
		int n=4;
		int m=3;
		int cc=0;//current col
		int cr=0;//current row
		int dc=m-1;// des col
		int dr=n-1;// des row
		
		int total=path("",cc,cr,dc,dr);
		System.out.println(total);
		
		
	}
	public static int path
	(String ans, int cc, int cr, int dc, int dr) {
		
		if(cc==dc && cr==dr) {
			System.out.println(ans);
			return 1;
		}
		if(cc>dc || cr>dr) return 0;
		
		//hor
		int h=path(ans+"H",cc+1,cr,dc,dr);
		//vertical
		int v=path(ans+"V",cc,cr+1,dc,dr);
		
		return h+v;
		
		
		
	}
	

}
