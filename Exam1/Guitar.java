package Exam1;

public class Guitar extends stringInstruments {
    boolean isElectric;

    public boolean isIsElectric() {
        return this.isElectric;
    }

    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public Guitar(){
        name="";
        price=0;
        numStrings=0;
        isElectric=true;
    }

    public Guitar(String name, double price, int numStrings, boolean isElectric){
        this.name=name;
        this.price=price;
        this.numStrings=numStrings;
        this.isElectric=isElectric;
    }
    @Override
    public void print(){
        System.out.println("Name: "+name);
        System.out.println("Price: "+"$"+price);
        System.out.println("Number of strings:"+numStrings);
        System.out.println("Electric guitar: "+isElectric);
    }

}
