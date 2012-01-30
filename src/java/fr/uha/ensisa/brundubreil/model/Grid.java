package fr.uha.ensisa.brundubreil.model;

public class Grid
{
    private Cell[][] cells;

    public Grid()
    {
        this.cells = new Cell[6][7];
        
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                this.cells[i][j] = new Cell();
    }
    
    public Cell getCell(int row, int column) {
        return this.cells[row][column];
    }

    public void setCellState(int row, int column, CellState state)
    {
        this.cells[row][column].setState(state);
    }
}