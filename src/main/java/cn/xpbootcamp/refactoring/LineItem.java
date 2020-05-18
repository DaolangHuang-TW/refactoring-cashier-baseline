package cn.xpbootcamp.refactoring;

public class LineItem {
	private String description;
	private double price;
	private int quantity;

	public LineItem(String description, double price, int quantity) {
		super();
		this.description = description;
		this.price = price;
		this.quantity = quantity;
	}

	public String getDescription() {
		return description;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

    double totalAmount() {
        return price * quantity;
    }

    String lineItemReceipt() {
		char splitChar = '\t';
		char endChar = '\n';
		String decription = "";
		decription += getDescription();
		decription += splitChar;
		decription += getPrice();
		decription += splitChar;
		decription += getQuantity();
		decription += splitChar;
		decription += totalAmount();
		decription += endChar;

		return decription;
	}
}