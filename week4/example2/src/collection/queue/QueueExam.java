package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();

		messageQueue.offer(new Message("sendMail", "보라돌이"));
		messageQueue.offer(new Message("sendSMS", "뚜비"));
		messageQueue.offer(new Message("sendLine", "나나"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			System.out.println(message.to + "에게 " + message.command + " 보내기");
		}
	}
}

class Message {
	public String command;
	public String to;

	Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}