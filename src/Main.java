class Number
{
    int number;
public Number(int number){
    this.number = number;
}
int getNumber(){
    return this.number;
}

void setNumber(int number){
    this.number = number;
}

void addThree(Number value){
    System.out.println("Parameter: Value = " + value.getNumber());
    value.setNumber(value.getNumber() + 3);
    System.out.println("Leaving method : value = " + value.getNumber());
}

public static void main(String[] args) {
   Number value = new Number(1);
   System.out.println("Argument: value =   " + value.getNumber());
   value.addThree(value);
   System.out.println("After method call = " + value.getNumber());
}

}

