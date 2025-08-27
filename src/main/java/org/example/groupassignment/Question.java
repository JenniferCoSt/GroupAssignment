package org.example.groupassignment;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Question {

    private int id;
    private String question;
    private boolean correct;

    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }

    @Override
    public String toString() {
        return "Questions {id=" + id + ", question=" + question + "}";
    }
}
