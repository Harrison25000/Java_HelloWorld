class TrueFalse {

    public static void main(String[] args) {
        boolean b;

        boolean bValue = (b = true);

        if (bValue) System.out.println("TRUE");
        else System.out.println("FALSE");

        if (bValue = false) System.out.println("TRUE");
        else System.out.println("FALSE");

        if (bValue == false) System.out.println("TRUE");
        else System.out.println("FALSE");  //So I think, because bValue is a boolean variable & 'false' is a statement, they are two different objects, thereby returning a value of 'false' which makes the 'if' part of the if/else statement correct, returning "TRUE".
    }

}