package com.JavaTests.services.tutorService;

import com.JavaTests.entity.Test;

import java.util.List;

public interface TestService{

    void addTest(Test test);

    List<Test> getTests();

    Test editTest(Test test);

    void deleteTest(Test test);

    List<Test> findByTopicId(Integer topicId);
}
