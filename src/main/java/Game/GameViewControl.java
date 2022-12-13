package Game;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;


import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Arrays;
import java.util.Objects;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


import java.util.ResourceBundle;

public class GameViewControl implements Initializable {

    // Variables
    private Database data;
    private int remainingGuesses;
    private char[] hiddenWord;
    private int mistakes;

    private boolean isAnswerCorrect;

    // FXML variables
    @FXML
    private Label currentPlayer;
    @FXML
    private TextField userInput;
    @FXML
    private Label wordGuess;
    @FXML
    private Label mistakePlate;
    @FXML
    private ImageView imageViewCake;

    public GameViewControl() throws FileNotFoundException {
        data = Database.getInstance();
        remainingGuesses = 11;
        hiddenWord = generateHiddenWord();
        mistakes = 0;
        isAnswerCorrect = false;
    }

    // Start method
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        wordGuess.setAlignment(Pos.CENTER);
        wordGuess.setText(displayHiddenWord());
        imageViewCake.setImage(imageCake12);
    }
    public char[] generateHiddenWord(){
        String theWord = data.getListOfWords().get(2);
        char[] hiddenWord = new char[theWord.length()];
        Arrays.fill(hiddenWord, '_');
        return hiddenWord;
    }

    public String displayHiddenWord() {
        char[] hiddenWord = generateHiddenWord();
        String newWord = String.valueOf(hiddenWord);
        return newWord.replace(""," ").trim();
    }



    public boolean checkIfLetterExist(char letter,String guessWord) {
        for (int i = 0; i < hiddenWord.length ; i++) {
            if (guessWord.charAt(i) == letter){
                hiddenWord[i] = letter;
                isAnswerCorrect = true;
            }
        }

        String newHiddenWord = String.valueOf(hiddenWord);
        wordGuess.setText(newHiddenWord.replace(""," ").trim());
        return isAnswerCorrect;
    }
    public void makeAMistake(){
        if (!isAnswerCorrect){
            System.out.println("Incorrect Guess");
            mistakePlate.setText("Mistake: " + mistakes +"/12");
        }
    }


    @FXML
    public void pressEnter() {
        String word = data.getListOfWords().get(2);
        if (userInput.getText().toUpperCase().equals(word)) {
            System.out.println("Funkade :D");
        } else {
       /*int count = 0;
         count++;
         mistake.setText(count); */
            System.out.println("Fel");
        }
        userInput.setText("");
    }

    // Cake animation
    @FXML
    public void displayCakeImage() {
        if (remainingGuesses == 11)
            imageViewCake.setImage(imageCake11);
        else if (remainingGuesses == 10)
            imageViewCake.setImage(imageCake10);
        else if (remainingGuesses == 9)
            imageViewCake.setImage(imageCake9);
        else if (remainingGuesses == 8)
            imageViewCake.setImage(imageCake8);
        else if (remainingGuesses == 7)
            imageViewCake.setImage(imageCake7);
        else if (remainingGuesses == 6)
            imageViewCake.setImage(imageCake6);
        else if (remainingGuesses == 5)
            imageViewCake.setImage(imageCake5);
        else if (remainingGuesses == 4)
            imageViewCake.setImage(imageCake4);
        else if (remainingGuesses == 3)
            imageViewCake.setImage(imageCake3);
        else if (remainingGuesses == 2)
            imageViewCake.setImage(imageCake2);
        else if (remainingGuesses == 1)
            imageViewCake.setImage(imageCake1);
        else if (remainingGuesses == 0)
            imageViewCake.setImage(imageCake0);
        remainingGuesses--;
    }
    // End of Cake Animation


    // Letter buttons
    @FXML
    public void buttonQ() {
        checkIfLetterExist('Q',data.getListOfWords().get(2));
        userInput.appendText("Q");
    }

    @FXML
    public void buttonW() {
        checkIfLetterExist('R',data.getListOfWords().get(2));
        userInput.appendText("W");
    }

    @FXML
    public void buttonE() {
        checkIfLetterExist('E',data.getListOfWords().get(2));
        userInput.appendText("E");
    }

    @FXML
    public void buttonR() {
        checkIfLetterExist('R',data.getListOfWords().get(2));
        userInput.appendText("R");
    }

    @FXML
    public void buttonT() {
        checkIfLetterExist('T',data.getListOfWords().get(2));
        userInput.appendText("T");
    }

    @FXML
    public void buttonY() {
        checkIfLetterExist('Y',data.getListOfWords().get(2));
        userInput.appendText("Y");
    }

    @FXML
    public void buttonU() {
        checkIfLetterExist('U',data.getListOfWords().get(2));
        userInput.appendText("U");
    }

    @FXML
    public void buttonI() {
        checkIfLetterExist('I',data.getListOfWords().get(2));
        userInput.appendText("I");
    }

    @FXML
    public void buttonO() {
        checkIfLetterExist('O',data.getListOfWords().get(2));
        userInput.appendText("O");
    }

    @FXML
    public void buttonP() {
        checkIfLetterExist('P',data.getListOfWords().get(2));
        userInput.appendText("P");
    }

    @FXML
    public void buttonÅ() {
        checkIfLetterExist('Å',data.getListOfWords().get(2));
        userInput.appendText("Å");
    }

    @FXML
    public void buttonA() {
        checkIfLetterExist('A',data.getListOfWords().get(2));
        userInput.appendText("A");
    }

    @FXML
    public void buttonS() {
        checkIfLetterExist('S',data.getListOfWords().get(2));
        userInput.appendText("S");
    }

    @FXML
    public void buttonD() {
        checkIfLetterExist('D',data.getListOfWords().get(2));
        userInput.appendText("D");
    }

    @FXML
    public void buttonF() {
        checkIfLetterExist('F',data.getListOfWords().get(2));
        userInput.appendText("F");
    }

    @FXML
    public void buttonG() {
        checkIfLetterExist('G',data.getListOfWords().get(2));
        userInput.appendText("G");
    }

    @FXML
    public void buttonH() {
        checkIfLetterExist('H',data.getListOfWords().get(2));
        userInput.appendText("H");
    }

    @FXML
    public void buttonJ() {
        checkIfLetterExist('J',data.getListOfWords().get(2));
        userInput.appendText("J");
    }

    @FXML
    public void buttonK() {
        checkIfLetterExist('K',data.getListOfWords().get(2));
        userInput.appendText("K");
    }

    @FXML
    public void buttonL() {
        checkIfLetterExist('L',data.getListOfWords().get(2));
        userInput.appendText("L");
    }

    @FXML
    public void buttonÖ() {
        checkIfLetterExist('Ö',data.getListOfWords().get(2));
        userInput.appendText("Ö");
    }

    @FXML
    public void buttonÄ() {
        checkIfLetterExist('Ä',data.getListOfWords().get(2));
        userInput.appendText("Ä");
    }

    @FXML
    public void buttonZ() {
        checkIfLetterExist('Z',data.getListOfWords().get(2));
        userInput.appendText("Z");
    }

    @FXML
    public void buttonX() {
        checkIfLetterExist('X',data.getListOfWords().get(2));
        userInput.appendText("X");
    }

    @FXML
    public void buttonC() {
        checkIfLetterExist('C',data.getListOfWords().get(2));
        userInput.appendText("C");
    }

    @FXML
    public void buttonV() {
        checkIfLetterExist('V',data.getListOfWords().get(2));
        userInput.appendText("V");
    }

    @FXML
    public void buttonB() {
        checkIfLetterExist('B',data.getListOfWords().get(2));
        userInput.appendText("B");
    }

    @FXML
    public void buttonN() {
        checkIfLetterExist('N',data.getListOfWords().get(2));
        userInput.appendText("N");
    }

    @FXML
    public void buttonM() {
        checkIfLetterExist('M',data.getListOfWords().get(2));
        userInput.appendText("M");
    }

    // end of Letter buttons

    // Images
    Image imageCake12 = new Image(new FileInputStream("src/main/resources/IMG/Cake12.png"));
    Image imageCake11 = new Image(new FileInputStream("src/main/resources/IMG/Cake11.png"));

    Image imageCake10 = new Image(new FileInputStream("src/main/resources/IMG/Cake10.png"));

    Image imageCake9 = new Image(new FileInputStream("src/main/resources/IMG/Cake9.png"));

    Image imageCake8 = new Image(new FileInputStream("src/main/resources/IMG/Cake8.png"));

    Image imageCake7 = new Image(new FileInputStream("src/main/resources/IMG/Cake7.png"));

    Image imageCake6 = new Image(new FileInputStream("src/main/resources/IMG/Cake6.png"));

    Image imageCake5 = new Image(new FileInputStream("src/main/resources/IMG/Cake5.png"));

    Image imageCake4 = new Image(new FileInputStream("src/main/resources/IMG/Cake4.png"));

    Image imageCake3 = new Image(new FileInputStream("src/main/resources/IMG/Cake3.png"));

    Image imageCake2 = new Image(new FileInputStream("src/main/resources/IMG/Cake2.png"));

    Image imageCake1 = new Image(new FileInputStream("src/main/resources/IMG/Cake1.png"));

    Image imageCake0 = new Image(new FileInputStream("src/main/resources/IMG/Cake0.png"));
    // end of Images
}

