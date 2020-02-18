package merhaba006nestedclass;

public class merhaba0061 {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("merhaba0061.this.x = " + merhaba0061.this.x);
        }
    }


	public static void main(String[] args) {
		merhaba0061 st = new merhaba0061();
		merhaba0061.FirstLevel fl = st.new FirstLevel();
	    fl.methodInFirstLevel(23);

	}

}
