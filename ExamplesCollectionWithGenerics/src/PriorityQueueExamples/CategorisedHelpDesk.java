package PriorityQueueExamples;

import static PriorityQueueExamples.Category.*;

import java.util.ArrayDeque;
import java.util.Queue;

public class CategorisedHelpDesk {
	private Queue<Enquiry> enquiries = new ArrayDeque<Enquiry>();

	public boolean enquire(final Customer customer, final Category type) {
		return enquiries.offer(new Enquiry(customer, type));
	}

	public void proccessPrinterEnquiry() {
		final Enquiry enquiry = enquiries.peek();
		String message = "Is it out of paper?";
		evaluateProblem(enquiry, message);
	}

	public void evaluateProblem(final Enquiry enquiry, String Message) {
		if (enquiry != null && enquiry.getCategory() == PRINTER) {
			enquiries.remove();
			enquiry.getCustomer().reply(Message);
		} else if (enquiry != null && enquiry.getCategory() == PHONE) {
			enquiries.remove();
			enquiry.getCustomer().reply(Message);
		} else {
			System.out.println("New things to learn in the meanwhile!");
		}
	}

	public void proccessGeneralEnquiry() {
		final Enquiry enquiry = enquiries.peek();
		String Message = "Have you tried turning it off and on again?";
		evaluateProblem(enquiry, Message);
	}

	public static void main(String[] args) {
		CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();

		helpDesk.enquire(Customer.JACK, PriorityQueueExamples.Category.PHONE);
		helpDesk.enquire(Customer.JILL, PriorityQueueExamples.Category.PRINTER);

		helpDesk.proccessPrinterEnquiry();
		helpDesk.proccessGeneralEnquiry();
		helpDesk.proccessPrinterEnquiry();
	}

}