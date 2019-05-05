package collection.queue;

import java.util.PriorityQueue;

public class PriorityQueueExam {
	public static void main(String[] args) {
		PriorityQueue<Student> priorityQueue = new PriorityQueue<Student>();

		priorityQueue.add(new Student("뽀", 3));
		priorityQueue.add(new Student("뚜비", 7));
		priorityQueue.add(new Student("나나", 5));
		priorityQueue.add(new Student("보라돌이", 9));

		while (!priorityQueue.isEmpty()) {
			Student student = priorityQueue.poll();
			System.out.println(student.toString());
		}
	}
}

class Student implements Comparable<Student> {
	public String name;
	public int age;

	Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}


	@Override
	public int compareTo(Student o) {
		if (this.age >= o.age) {
			return 1;
		} else {
			return -1;
		}
	}
}

