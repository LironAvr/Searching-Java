package com.company;

import java.util.List;

public interface ISearchable {

    AState getInitialState();
    AState getGoalState();
    List<AState> getSuccessors(AState state);
    void print();
}
