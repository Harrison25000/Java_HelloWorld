import java.util.Random;

class SwitchConditionals{

    public static void main(String[] args){
         SwitchConditionals.generateRandomFish();
    }

    public static String generateRandomFish() {
        String randomFish;
        Random randomObject = new Random();
        int randomNumber = randomObject.nextInt(4);
        switch(randomNumber) {
            case 0:
                randomFish = "Blue Fish";
                break;
            case 1:
                randomFish = "Red Drum";
                break;
            case 2:
                randomFish = "Striped Bass";
                break;
            default:
                randomFish = "Unknown Fish Type";
                break;
        }
        System.out.println(randomFish);
        return randomFish;
        }
    }