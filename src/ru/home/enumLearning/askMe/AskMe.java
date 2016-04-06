package ru.home.enumLearning.askMe;

/**
 * Created by Ãîñòü on 25.03.2016.
 */
/***
 * /**
 * Created by Ãîñòü on 06.03.2016.
 */
/*
import java.util.Random;
import askmeSharedConstants.SharedConstants;

class Question implements SharedConstants {
    public static Random rand = new Random();
    int ask() {
        int prob = (int)(100 * rand.nextDouble());
        if(prob < 30) {
            return NO;
        }
        else if(prob < 60) {
            return YES;
        }
        else if (prob < 75) {
            return LATER;
        }
        else if(prob < 98) {
            return SOON;
        }
        else
            return NEVER;
    }
}

public class AskMe implements SharedConstants {

    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Heò");
                break;
            case YES:
                System.out.println("Äa");
                break;
            case MAYBE:
                System.out.println("Boçìoæío");
                break;
            case LATER:
                System.out.println("Ïoçäíee");
                break;
            case SOON:
                System.out.println("Bcêope");
                break;
            case NEVER:
                System.out.println("Hèêoãäa");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(100 * Question.rand.nextDouble()));
        }
    }
}
*/

import java.util.Random;

enum Answers {
    NO,YES,MAYBE,LATER,SOON,NEVER
}

class Question {
    private Random rand = new Random();
    Answers ask() {
        int prob = (int)(100 * rand.nextDouble());
        if(prob < 30) {
            return Answers.NO;
        }
        else if(prob < 60) {
            return Answers.YES;
        }
        else if (prob < 75) {
            return Answers.LATER;
        }
        else if(prob < 98) {
            return Answers.SOON;
        }
        else
            return Answers.NEVER;
    }
}

public class AskMe {
    static void answer(Answers result) {
        switch (result) {
            case NO:
                System.out.println("Heò");
                break;
            case YES:
                System.out.println("Äa");
                break;
            case MAYBE:
                System.out.println("Boçìoæío");
                break;
            case LATER:
                System.out.println("Ïoçäíee");
                break;
            case SOON:
                System.out.println("Bcêope");
                break;
            case NEVER:
                System.out.println("Hèêoãäa");
                break;
        }
    }
    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
