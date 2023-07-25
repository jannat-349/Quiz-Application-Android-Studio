package com.example.quizapplication;

public class QuestionLibrary {
    private String questions[] = {
            "Which part of the plants is in the soil?",
            "This part of the plants absorbs energy from the sun.",
            "Which part of the plants attracts bees, butterflies and hummingbirds?",
            "The ___ holds the plant upright.",
            "The leaves have ___"
    };

    private String choices[][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruits", "Leaves", "Flowers"},
            {"Bark", "Roots", "Flowers"},
            {"Stem", "Root", "Leaves"},
            {"Salt", "Chlorophyll","Seeds"}
    };

    private String correctAnswers[] = {"Roots", "Leaves", "Flowers", "Stem", "Chlorophyll"};

    public String getChoice1(int a){
        String choice0 = choices[a][0];
        return choice0;
    }
    public String getChoice2(int a){
        String choice1 = choices[a][1];
        return choice1;
    }
    public String getChoice3(int a){
        String choice2 = choices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = correctAnswers[a];
        return answer;
    }

    public String getQuestion(int a) {
        String question = questions[a];
        return question;
    }

}
