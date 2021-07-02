package KTVTKPM.Bridge;

public class main {
	public static void main(String[] args) {
       Category bookCategory = new BookCategory();
       Category clothesCategory = new ElectronicCategory();
       ItemAbstract book = new Book();
       ItemAbstract clothe = new Electronic();
       book.setCategory(bookCategory);
       clothe.setCategory(clothesCategory);
    }
}
