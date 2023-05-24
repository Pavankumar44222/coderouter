class rt extends Thread{
	void run()
	{
		System.out.println("Java is object oriented");
	}
}
class multithread{
	public static void main(String ss[])
	{
           rt t=new rt();
           t.start();
	}
}