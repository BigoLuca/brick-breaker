package brickbreaker.model.gameObjects;

import brickbreaker.common.TypeObj;
import brickbreaker.common.Vector2D;
import brickbreaker.model.gameObjects.bounding.RectBoundingBox;
import brickbreaker.model.gameObjects.power.TypePower;

/**
 * Class to model the game object Brick.
 * Extends {@link GameObjectImpl}.
 * 
 * @author Bighini Luca
 */
public class Brick extends GameObjectImpl<RectBoundingBox> {

    private static final Double BRICK_WIDTH = 2.0;
    private static final Double BRICK_HEIGHT = 1.0;
    private TypePower powerUp;

    /**
     * Brick constructor.
     * @param pos
     * @param lifeToSet
     */
    public Brick(final Vector2D pos, final int lifeToSet) {
        super(lifeToSet, new Vector2D(0, 0), TypeObj.BRICK, new RectBoundingBox(pos, BRICK_WIDTH, BRICK_HEIGHT));
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
