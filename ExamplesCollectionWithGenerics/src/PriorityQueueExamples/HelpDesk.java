package PriorityQueueExamples;

import java.util.ArrayDeque;
import java.util.Queue;

public class HelpDesk {

	private final Queue<Enquiry> enquiries = new ArrayDeque<Enquiry>();

	public void enquire(final Customer customer, final PriorityQueueExamples.Category category) {
		enquiries.offer(new Enquiry(customer, category));
	}

	public void processALLEnquiries() {
		
		Enquiry enquiry;
		
		while ((enquiry = enquiries.poll())  !=null) {
			enquiry.getCustomer().reply("Have you tried turning it off and on again?");
		}
	}

	public static void main(String[] args) {
		HelpDesk helpDesk = new HelpDesk();
		helpDesk.enquire(Customer.JACK, PriorityQueueExamples.Category.PHONE);
		helpDesk.enquire(Customer.JILL, PriorityQueueExamples.Category.PRINTER);

		helpDesk.processALLEnquiries();

	}
}
