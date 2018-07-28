package com.company;

public abstract class ASearchingAlgorithm implements ISearchingAlgorithm {

    int generated_nodes;
    int max_nodes_stored;
    long runtime;

    public abstract void Solve(ISearchable searchable);

    public int getGeneratedNodes(){
        return generated_nodes;
    }

    public int getMaxNodesStored(){
        return max_nodes_stored;
    }

    public long getRuntime(){
        return runtime;
    }
}
