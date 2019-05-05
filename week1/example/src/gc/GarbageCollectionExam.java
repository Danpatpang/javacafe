package gc;

public class GarbageCollectionExam {
	/**
	 * 자바의 모든 클래스는 최상위 클래스인 Object 클래스의 메소드를 포함.
	 * finalize는 가비지 컬렉션이 수행될 때 더 이상 사용하지 않는 자원에 대한 정리를 위해 호출되는 종료자 메소드.
	 */
	@Override
	public void finalize() {
		System.out.println("Object is garbage collected!");
	}

	public static void main(String[] args) {
		GarbageCollectionExam test1 = new GarbageCollectionExam();
		GarbageCollectionExam test2 = new GarbageCollectionExam();
		GarbageCollectionExam test3 = new GarbageCollectionExam();

		test1 = null;
		test2 = null;
		System.out.println("Garbage collection start");
		System.gc();
		System.out.println("Garbage collection finish");
	}
}
