package callbyref;

public class passbyReference {
	public static void main(String[] args) {
		PartyDo client = new PartyDo(1);
		System.out.println("before "+client.getPartySeq());
		operation o = new operation();
		o.increment(client);
		System.out.println("after "+client.getPartySeq());
		o.decrement(client.getPartySeq());
		System.out.println("After decrement"+client.getPartySeq());
		
	}
}

class operation{
	
	void increment(PartyDo obj){
		obj.setPartySeq(obj.getPartySeq() + 1);
	}
	
	void decrement(int partySeq){
		partySeq--;
		System.out.println("imside decrment method "+partySeq);
	}
	
}