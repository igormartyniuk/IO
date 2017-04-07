package DB2;

public class Shop {
	
	private String id;
	private String item;
	private String price;
	private String number;
	public Shop(String id, String item, String price, String number) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.number = number;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", item=" + item + ", price=" + price + ", number=" + number + "]\n";
	}

}