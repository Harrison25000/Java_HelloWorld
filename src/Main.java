
import java.io.IOException;
class Thrower{
    public static void main(String[] args){
        Thrower t = new Thrower();
        try{
            t.throw1();
        }
        catch(IOException ex){
            System.out.println("Caught an IO exception!");
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("BOB");
        }
    }
    public void throw1() throws IOException {
        System.out.println("1");
        throw2();

    }
    public void throw2() throws IOException {
        System.out.println("2");
        throw3();
    }
    public void throw3() throws IOException {
        System.out.println("3");
        throw4();
    }
    public void throw4() throws IOException {
        System.out.println("4");
        throw new IOException();

    }
}

