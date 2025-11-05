package correctWordCounds;

public class Word {
    private String word;

    public Word (String word){
        this.word = word;
    }

    public String getWord() {
        return word;
    }

    public boolean isCorrectSpelled(String userInput){
        if (userInput.equalsIgnoreCase(word)) {
            return true;
        } else {
            return false;
        }
    }

}
