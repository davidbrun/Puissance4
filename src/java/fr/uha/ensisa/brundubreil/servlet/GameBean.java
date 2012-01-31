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
    private boolean humanPlayerWinner;
    private boolean computerWinner;
    private boolean draw;

    public GameBean()
    {
        this.grid = new Grid();
        this.playerName = "";
        this.humanPlayerBegin = true;
        this.computerWinner = false;
        this.draw = false;
        this.humanPlayerWinner = false;
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

    public boolean isComputerWinner()
    {
        return computerWinner;
    }

    public void setIsComputerWinner(boolean computerWinner)
    {
        this.computerWinner = computerWinner;
    }

    public boolean isDraw()
    {
        return draw;
    }

    public void setIsDraw(boolean draw)
    {
        this.draw = draw;
    }

    public boolean isHumanPlayerWinner()
    {
        return humanPlayerWinner;
    }

    public void setIsHumanPlayerWinner(boolean humanPlayerWinner)
    {
        this.humanPlayerWinner = humanPlayerWinner;
    }
    
    public boolean gameIsEnded()
    {
        return humanPlayerWinner || computerWinner || draw;
    }
    
    public String getGridHTML()
    {
        StringBuilder result = new StringBuilder();
        
        if (computerWinner || humanPlayerWinner || draw)
        {
            result.append("<h4 style=\"margin-top: -1px;\">Partie terminée. Vainqueur : ");

            if (computerWinner)
                result.append("Ordinateur");
            else if (humanPlayerWinner)
                result.append(this.playerName);
            else if (draw)
                result.append("Match nul !");

            result.append("</h4>");
        }

        result.append("<table>").append("\n");
        if (!computerWinner && !humanPlayerWinner && !draw)
        {
            result.append("<tr>").append("\n");
            for (int i = 0; i < Grid.WIDTH; i++)
            result.append("<td><a href='Game?column=").append(i).append("'><img src='images/fleche.PNG' style='border: none;'/></a></td>").append("\n");
            result.append("</tr>").append("\n");
        }

        for (int i = 0; i < Grid.HEIGHT; i++) {
            result.append("<tr>").append("\n");
            for (int j = 0; j < Grid.WIDTH; j++)
                result.append("<td><img src='images/").append(this.getImageForCell(i, j)).append("' style='position: relative;display:block;padding:0px:margin:0px;'/></td>").append("\n");

            result.append("</tr>").append("\n");
        }

        result.append("</table>").append("\n");
        
        return result.toString();
    }
}