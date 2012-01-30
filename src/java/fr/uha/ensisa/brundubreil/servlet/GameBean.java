package fr.uha.ensisa.brundubreil.servlet;

import fr.uha.ensisa.brundubreil.model.CellState;
import fr.uha.ensisa.brundubreil.model.Grid;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

@Stateless
@LocalBean
public class GameBean
{
    private Grid grid;
    private String playerName;
    private boolean humanPlayerBegin;

    public GameBean()
    {
        this.grid = new Grid();
        this.playerName = "";
        this.humanPlayerBegin = true;
        
    }
    
    public Grid getGrid()
    {
        return this.grid;
    }
    
    public String getImageForCell(int row, int column)
    {
        if (grid.getCell(row, column).getState() == CellState.HUMAN_PLAYER)
            return "human.png";
        else if (grid.getCell(row, column).getState() == CellState.COMPUTER)
            return "computer.png";
        else
            return "empty.png";
    }

    public void setCellState(int row, int column, CellState state)
    {
        this.grid.setCellState(row, column, state);
    }
    
    public void setPlayerName(String name)
    {
        this.playerName = name;
    }

    public String getPlayerName()
    {
        return playerName;
    }
    
    public boolean isHumanPlayerBegin()
    {
        return humanPlayerBegin;
    }

    public void setHumanPlayerBegin(boolean humanPlayerBegin)
    {
        this.humanPlayerBegin = humanPlayerBegin;
    }
}