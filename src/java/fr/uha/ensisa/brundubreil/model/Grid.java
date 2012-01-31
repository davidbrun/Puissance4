package fr.uha.ensisa.brundubreil.model;

public class Grid
{
    private Cell[][] cells;
    private boolean[] columnFull;
    private boolean gridFull;

    public Grid()
    {
        this.cells = new Cell[6][7];
        
        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 7; j++)
                this.cells[i][j] = new Cell();
        
        this.columnFull = new boolean[7];
        for (int i = 0; i < 7; i++)
            this.columnFull[i] = false;
        
        this.gridFull = false;
    }
    
    public Cell getCell(int row, int column)
    {
        return this.cells[row][column];
    }

    public void setCellState(int row, int column, CellState state)
    {
        this.cells[row][column].setState(state);
    }
    
    public Cell getFirstNonEmptyCellFromColumn(int column)
    {
        for (int i = 5; i >= 0; i--)
            if (this.cells[i][column].getState() == CellState.EMPTY)
                return this.cells[i][column];
        
        this.columnFull[column] = true;
        updateGridFlag();
        return null;
    }
    
    private void updateGridFlag()
    {
        boolean tmp = true;
        for (int i = 0; i < 7; i++)
            tmp &= this.columnFull[i];
        
        this.gridFull = tmp;
    }

    public boolean isGridFull()
    {
        return gridFull;
    }

    public boolean isHumanPlayerWinner()
    {
        return detectWinner(CellState.HUMAN_PLAYER);
    }

    public boolean isComputerWinner()
    {
        return detectWinner(CellState.COMPUTER);
    }
    
    private boolean detectWinner(CellState stateToDetect)
    {
        int consecutive = 0;
        
        // Vertical
        for (int i = 0; i < 7; i++)
        {
            consecutive = 0;
            for (int j = 0; j < 6; j++)
            {
                if (this.cells[j][i].getState() == stateToDetect)
                    consecutive++;
                else
                    consecutive = 0;
                
                if (consecutive >= 4)
                    return true;
            }
        }
        
        // Horizontal
        for (int i = 0; i < 6; i++)
        {
            consecutive = 0;
            for (int j = 0; j < 7; j++)
            {
                if (this.cells[i][j].getState() == stateToDetect)
                    consecutive++;
                else
                    consecutive = 0;
                
                if (consecutive >= 4)
                    return true;
            }
        }
        
        // Right diagonal
        
        if (consecutive >= 4)
            return true;
        
        // Left diagonal
        
        if (consecutive >= 4)
            return true;
        
        return false;
    }
}