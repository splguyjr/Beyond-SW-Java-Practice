package com.splguyjr.chap99.comprehensive.persistence.problem.answer;

public interface AnswerStorage {
    void save(int problemNum, String testCase);
    String load(int problemNum);
}
