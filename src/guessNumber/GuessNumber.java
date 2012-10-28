package guessNumber;

public class GuessNumber {

    private String randomNumber;

    public GuessNumber(String randomNumber) {
        this.randomNumber = randomNumber;
    }

    public String validate(String userInput) {
        int couta = 0;
        int coutb = 0;
        if(userInput.equals(randomNumber)){
            return "4a0b";
        }
        else{
            for(int i = 0;i < randomNumber.length();i++) {
                if(userInput.charAt(i)==randomNumber.charAt(i))
                    couta++;
                for(int j = 0; j < randomNumber.length();j++) {
                    if(userInput.charAt(i)==randomNumber.charAt(j))
                        coutb++;
                }
            }
            coutb -=couta;
        }
        return couta+"a"+coutb+"b";
    }
}
