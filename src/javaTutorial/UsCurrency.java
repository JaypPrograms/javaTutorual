package javaTutorial;

public enum UsCurrency {

    number(10), number2(11);

    int value, pay;

    UsCurrency(int number){
        this.value=number;
    }

    public int getValue(){
        return this.value;
    }

    public int getPay(){
        return this.pay;
    }
}
