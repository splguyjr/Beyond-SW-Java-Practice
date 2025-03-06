package com.splguyjr.chap99.comprehensive.persistence.problem.testcase;

public interface TestCaseStorage {
    void save(int problemNum, String testCase);
    String load(int problemNum);
}
