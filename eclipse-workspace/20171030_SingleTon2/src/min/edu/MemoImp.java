package min.edu;

public abstract class MemoImp implements I_Memo {

	@Override
	public void command() {
		System.out.println("겨울이 되면 추워요");

	}

	@Override
	public abstract void output();

	

}
