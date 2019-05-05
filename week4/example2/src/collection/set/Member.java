package collection.set;

public class Member {
	public String name;

	Member(String name) {
		this.name = name;
	}

//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof Member) {
//			Member member = (Member) o;
//			return member.name.equals(this.name);
//		}
//		return false;
//	}
//
//	@Override
//	public int hashCode() {
//		return name.hashCode();
//	}
}
