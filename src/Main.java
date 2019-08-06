class Main{
    private static void bob(){
        System.out.println("bob");
    }
    public static void runbobrun(){
        System.out.println("lets run ");
        Main.bob();
    }
}

class Jumanji{
    public static void main(String[] args){
        Main.runbobrun();
    }
    public void ok(){
        Main.runbobrun();
    }

}

