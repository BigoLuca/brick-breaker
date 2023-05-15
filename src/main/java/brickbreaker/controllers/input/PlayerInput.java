package brickbreaker.controllers.input;

import brickbreaker.model.gameObjects.Bar;

/**
 * Class to elaborate the player input and update the position of the respective object.
 * 
 * @author Bighini Luca
 * @author Tellarini Pietro
 */
public class PlayerInput implements InputComponent {

    private final Integer move = 1;

    /**
     * {@inheritDoc}
     */
    @Override
    public void update(final Bar bar, final Double rb, final InputController c) {
        if (c.isMoveLeft()) {
            if (bar.getBBox().getULCorner().getX() >= move) {
                bar.move(-move);
            }
            c.noMoveLeft();
        } else if (c.isMoveRight()) {
            if (bar.getBBox().getBRCorner().getX() <= (rb - move)) {
                bar.move(move);
            }
            c.noMoveRight();
        }
    }

}