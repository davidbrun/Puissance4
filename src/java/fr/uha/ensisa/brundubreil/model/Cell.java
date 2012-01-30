package fr.uha.ensisa.brundubreil.model;

public class Cell
{
    private CellState state;

    public Cell()
    {
        this.state = CellState.EMPTY;
    }

    public CellState getState()
    {
        return state;
    }

    void setState(CellState state)
    {
        this.state = state;
    }
}