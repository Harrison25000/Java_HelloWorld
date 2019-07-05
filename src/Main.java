import java.io.*;

class battleship {
    int[] location;
    int numOfHits = 0;

    public static void main(String[] args){
        int userGuesses = 0;
        GameHelper helper = new GameHelper();
        battleship dotCom = new battleship();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        dotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = dotCom.checkYourself(guess);
            userGuesses += 1;
            if(result.equals("killed")){
                isAlive = false;
                System.out.println("You took "+userGuesses+" guesses");
            }
        }

    }

    public void setLocationCells (int[] args) {
        location = args;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for(int cell : location){
            if(guess == cell){
                numOfHits += 1;
                result = "hit";
                break;
            }
        }

        if(numOfHits == location.length){
            result = "killed";
        }

        System.out.println(result);
        return result;
    }

}

class GameHelper {
    public String getUserInput(String prompt) {
        String inputLine = null;
        System.out.println(prompt + " ");
        try {
            BufferedReader is = new BufferedReader(
                    new InputStreamReader(System.in));
            inputLine = is.readLine();
            if(inputLine.length()==0) return null;}
        catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
