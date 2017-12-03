import java.util.ArrayList;

public class Player {
	private String name;
	private int chips;
	private int bet;
	private ArrayList<Card> oneRoundCard= new ArrayList<Card>();
	private int sum = 0;
	
	

	public Player(String name, int chips){
		this.name = name;
		this.chips = chips;
	}
	
	public String getName(){
		return(name);
	}
	
	public int makeBet(){
		return(bet);
	}
	
	public void setOneRoundCard(ArrayList<Card> cards){
		oneRoundCard = cards;
	}
	
	public boolean hitMe(){
		for (int i = 0; i < oneRoundCard.size(); i++){
		sum += oneRoundCard.get(i).getRank();	
		}
		if (sum>=16)
			return false;
		else
			return true;
			
	}
	
	public int getTotalValue(){
		return sum;
	}
	
	public int getCurrentChips(){
		return chips;
	}
	
	public void increaseChips (int diff){
		chips += diff;
	}
	
	public void sayHello(){
		System.out.println("Hello, I am " + name + ".");
	    System.out.println("I have " + chips + " chips.");
	}
	
}

