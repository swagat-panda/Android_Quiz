package com.example.quiz;

/**
 * Created by USER on 1/12/2018.
 */

public class QuestionLibrary {


    private String mQuestions [] = {
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and hummingbirds.",
            "The _______ holds the plant upright.",
            "who is the father of computer?",
            "Android is owned by which company",
            "what is the official language of android",
            "current president of india",
            "current chief minister of odisha",
            "what is the official language of india"

    };


    private String mChoices [][] = {
            {"Roots", "Stem", "Flower"},
            {"Fruit", "Leaves", "Seeds"},
            {"Bark", "Flower", "Roots"},
            {"Flower", "Leaves", "Stem"},
            {"Charles Babbage","Bill Gates","Steve Jobs"},
            {"Google","Facebook","Microsoft Corporation"},
            {"kotlin","java","c#"},
            {"Narendra Modi","Ram Nath Kovind","Rahul Gandhi"},
            {"Naveen Patnaik","Pyarimohan Mohapatra","Dr. Damodara Rout "},
            {"Odia","Hindi","NONE"}
    };



    private String mCorrectAnswers[] = {"Roots", "Leaves", "Flower", "Stem","Charles Babbage","Google","kotlin","Ram Nath Kovind","Naveen Patnaik","NONE"};




    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }


    public String getChoice1(int a) {
        String choice0 = mChoices[a][0];
        return choice0;
    }


    public String getChoice2(int a) {
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a) {
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
