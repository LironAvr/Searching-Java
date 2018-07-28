package com.company;

public interface ISearchingAlgorithm {

    void Solve(ISearchable searchable);
    int getGeneratedNodes();
    int getMaxNodesStored();
    long getRuntime();

}
