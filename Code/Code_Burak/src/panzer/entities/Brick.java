/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panzer.entities;

import java.util.ArrayList;
import javafx.scene.image.Image;

public class Brick extends GameObject{

    private int life;
    private int type;
    public Brick(boolean _isAlive, double _coordinateX, double _coordinateY, int width, int height, int _speed, ArrayList<Image> _icon) {
        super(_isAlive, _coordinateX, _coordinateY, width, height, _speed, _icon);
        //this.life=life;
    }
    public int getLife()
    {
        return life;
    }
    public void setLife(int life)
    {
        this.life=life;
    }
      
}
