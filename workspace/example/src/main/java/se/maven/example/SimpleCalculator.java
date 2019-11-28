package se.maven.example;

public class SimpleCalculator {
	private int res = 0;
	
	public void add(int x, int y) {res=x+y;}
	public void sub(int x, int y) {res=x-y;}
	public void inc(int d) {res +=d;}
	public void decc(int d) {res -=d;}
	public int getResult() {return res;}
	
	public void addWithPositiveArgs(int x, int y) throws InvaludArgumentException{
		if(x<0 || y<0) throw new InvaludArgumentException();
		res= x+y;
	}
	public void weiredAdd(int x, int y) {
		if(x==5&& y==7) res =100;
		else res = x+y;
	}

}
