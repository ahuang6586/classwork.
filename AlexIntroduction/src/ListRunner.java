import java.util.ArrayList;

public class ListRunner {
	static ArrayList<Item> shoppingList;
	public ListRunner() {
		String[] justDescriptions = getDescriptions();
		initList(justDescriptions);
		doSomeShopping();
		printPurchasedItems();
	}
	private void printPurchasedItems() {
		for(int i = 0; i < shoppingList.size(); i++)
			if(shoppingList.get(i).isPurchased()){
				System.out.println("Bought "+shoppingList.get(i).getDescription());
				shoppingList.remove(i);
				i--;
			}
		
	}
	private void doSomeShopping() {
		shoppingList.get(0).setPurchased(true);
		shoppingList.get(3).setPurchased(true);
		
	}
	private void initList(String[] justDescriptions) {
		shoppingList = new ArrayList<Item>();
		for(String s: justDescriptions){
			shoppingList.add(new Item(s));
		}
		//another way
//		for(int i = 0; i < justDescriptions.length; i++){
//			shoppingList.addAll(new Item(justDescription[i]));
//		}
		
	}
	private String[] getDescriptions() {
		String[] test = {"Clothes","Dryer","Shampoo","Pokeballs"};
		return test;
	}

}
