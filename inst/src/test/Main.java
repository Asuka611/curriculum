package test;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 Person sample = new Person();
//		public static void main(String[] args) メソッド内で
//		 Person クラスのインスタンスを作成し、そのプロパティを設定し、表示。
		 
		    System.out.println("インスタンス化直後");
		    System.out.println("名前: " + sample.getName());
		    System.out.println("年齢: " + sample.getAge());
		 
		    sample.setName("山田");
		    sample.setAge(30);
		 
		    System.out.println("セットメソッド使用後");
		    System.out.println("名前: " + sample.getName());
		    System.out.println("年齢: " + sample.getAge());
		  }
		}
		 
		class Person {
			String name;
			int age;
//			Person クラスは、名前 (name) と
//			年齢 (age) の2つのフィールドを持ち

			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
//			それぞれのフィールドにアクセスするためのゲッター（getName()）など
//			セッター （ setName() など) メソッドを提供する。
			
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
	}

}
