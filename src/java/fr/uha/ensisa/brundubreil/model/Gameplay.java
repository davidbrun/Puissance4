package fr.uha.ensisa.brundubreil.model;

import java.util.Random;

public class Gameplay
{
    private Gameplay() {}
    
    public static boolean doComputerPlay(Grid grid)
    {
        boolean result = false;
        
        Cell cell = grid.getFirstNonEmptyCellFromColumn(new Random(System.nanoTime()).nextInt(7));
        if (cell != null)
        {
            cell.setState(CellState.COMPUTER);
            result = true;
        }
        else
            if (!grid.isGridFull())
                result |= doComputerPlay(grid);
        
        return result;
    }
    
    public static boolean doHumanPlayerPlay(Grid grid, int column)
    {
        Cell cell = grid.getFirstNonEmptyCellFromColumn(column);
        if (cell != null)
        {
            cell.setState(CellState.HUMAN_PLAYER);
            return true;
        }
        else
            return false;
    }
}