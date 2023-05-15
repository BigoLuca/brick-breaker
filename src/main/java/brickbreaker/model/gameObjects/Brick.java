package brickbreaker.model.gameObjects;

import brickbreaker.common.Dimension;
import brickbreaker.common.P2d;
import brickbreaker.common.TypeObj;
import brickbreaker.common.V2d;
import brickbreaker.model.gameObjects.bounding.RectBoundingBox;
import brickbreaker.model.gameObjects.power.TypePower;

/**
 * Class to model the game object Brick.
 * Extends {@link GameObjectImpl}.
 * 
 * @author Bighini Luca
 */
public class Brick extends GameObjectImpl<RectBoundingBox> {

    private TypePower powerUp;

    /**
     * Brick constructor.
     * @param pos
     * @param lifeToSet
     */
    public Brick(final P2d pos, final int lifeToSet) {
        super(lifeToSet, new V2d(0, 0), TypeObj.BRICK, new RectBoundingBox(pos, Dimension.BRICK_WIDTH, Dimension.BRICK_HEIGHT));
        this.powerUp = TypePower.NULL;
    }

    /**
     * @return the type of powerUp
     */
    public TypePower getPowerUp() {
        return this.powerUp;
    }

    /**
     * @param powerUpToSet
     */
    public void setPowerUp(final TypePower powerUpToSet) {
        this.powerUp = powerUpToSet;
    }

}