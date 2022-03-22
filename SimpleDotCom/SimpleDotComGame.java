public class SimpleDotComGame {
public static void main (String[] args) {  

    int randomNum = (int) (Math.random() * 5);
    int[] locations = {randomNum, randomNum+1, randomNum+2};

    int y = 0;
    int[] guessesUsed = new int[10];

    String result1 = "miss";

    SimpleDotCom theDotCom = new SimpleDotCom();

    theDotCom.setLocationCells(locations);
    
    int numOfGuesses = 0;
    boolean isAlive = true;

    GameHelper helper = new GameHelper();

    while(isAlive == true) {
        String guess = helper.getUserInput("enter a number");
        int check = Integer.parseInt(guess);
        theDotCom.setguessesUsed(guessesUsed);
        String cCheck = theDotCom.checkGuesses(guess);

        if (cCheck.equals("Number chosen alredy")) {

            System.out.println(cCheck);

        } else {

            guessesUsed[y] = check;
            String result = theDotCom.checkYourself(guess);
            result1 = result;
            numOfGuesses++;
            y++;

        }
        

        if (result1.equals("kill")) {
            isAlive = false;
            System.out.println("You took " + numOfGuesses + " guesses");
        }
    }
    
}

}
