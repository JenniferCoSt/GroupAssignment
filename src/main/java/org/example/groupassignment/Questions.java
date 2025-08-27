package org.example.groupassignment;

import java.util.ArrayList;
import java.util.List;

@Allargs
public class Questions {

    private int id;
    private String question;
    private boolean correct;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

    public Questions(int id, String question, boolean correct) {
        this.id = id;
        this.question = question;
        this.correct = correct;
    }

    public List<Questions> get10Questions() {
        List<Questions> questions10 = new ArrayList<Questions>();
        questions10.add(new Questions(1, "Är Pippi stark?", true));
        questions10.add(new Questions(2, "Är Bamse stark?", false));
        questions10.add(new Questions(3, "Är Bamse stark när han druckit dunderhonung?", true));
        questions10.add(new Questions(4, "Är Bamse snäll??", true));
        questions10.add(new Questions(5, "Är talet 9,11 större än 9,9?", false));
        questions10.add(new Questions(6, "Finns det 2 \"r\" i engelskans ord för Jordgubb?", false));
        questions10.add(new Questions(7, "Säger chatgpt att det finns 2 \"r\" i engelskans ord för jordgubb?", true));
        questions10.add(new Questions(8, "Är talet 9,11 större än 9,9 enligt chatgpt? ", true));
        questions10.add(new Questions(9, "Gof är en ny stil likt Goth", false));
        questions10.add(new Questions(10, "1+1", true));
        questions10.add(new Questions(11, "", true));
        questions10.add(new Questions(12, "", true));


        return questions10;

    }


}
