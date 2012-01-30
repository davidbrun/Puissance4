/*
 * File:   GameBean.java
 * Author: David Brun <brundavid@gmail.com>
 *
 * Created on 20 janv. 2012, 11:01:55
 */

package fr.uha.ensisa.brundubreil.servlet;

import fr.uha.ensisa.brundubreil.model.CellState;
import fr.uha.ensisa.brundubreil.model.Grid;
import java.rmi.RemoteException;
import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

/**
 *
 * @author David Brun <brundavid@gmail.com>
 */
public class GameBean implements SessionBean
{
    private Grid grid;
    private String player;

    public GameBean()
    {
        this.grid = new Grid();
    }
    
    @Override
    public void setSessionContext(SessionContext ctx) throws EJBException, RemoteException
    {
        
    }

    @Override
    public void ejbRemove() throws EJBException, RemoteException
    {
        
    }

    @Override
    public void ejbActivate() throws EJBException, RemoteException
    {
        
    }

    @Override
    public void ejbPassivate() throws EJBException, RemoteException
    {
        
    }

    public Grid getGrid()
    {
        return this.grid;
    }
    
    public String getImage(int row, int column) {
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
    
    public void setPlayer(String name){
        this.player = name;
    }

    public String getPlayer()
    {
        return player;
    }
}
