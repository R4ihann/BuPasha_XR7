package Exam1;

public class stringInstruments extends Instruments{
    int numStrings;

    public int getNumStrings() {
        return this.numStrings;
    }

    public void setNumStrings(int numStrings) {
        this.numStrings = numStrings;
    }
    
    public stringInstruments(){
        numStrings=0;
        price=0;
        name="";
    }
    
    public stringInstruments(int numStrings, double price, String name){
        super(price, name);
        this.numStrings=numStrings;
    }

    @Override
    public void print(){
        System.out.println("Number of String: "+numStrings);
        System.out.println("Price: "+price+"Rp");
        System.out.println("Name: "+name);
    }
}
