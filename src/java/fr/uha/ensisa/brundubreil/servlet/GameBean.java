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

    public GameBean()
    {
        this.grid = new Grid();
    }
    
    public Grid getGrid()
    {
        return this.grid;
    }
    
    public String getImageForCell(int row, int column) {
        if (grid.getCell(row, column).getState() == CellState.PLAYER)
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
    
    public void setPlayerName(String name){
        this.playerName = name;
    }

    public String getPlayerName()
    {
        if (playerName != null)
            return playerName;
        else
            return "";
    }
}