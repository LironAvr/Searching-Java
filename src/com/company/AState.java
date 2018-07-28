package com.company;

public abstract class AState {

    public String state;
    public AState parent_state;
    public int cost;

    public AState(AState parent){
        parent_state = parent;
        cost = parent.cost + 1;
    }

    public void updateCost(int cost){
        if (this.cost > cost)
            this.cost = cost;
    }

    public boolean isEqual(AState other){
        return state == other.state;
    }

    public void printState(){
        System.out.println(state);
    }
}
