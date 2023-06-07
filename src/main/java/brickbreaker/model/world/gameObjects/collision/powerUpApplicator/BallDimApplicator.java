package brickbreaker.model.world.gameObjects.collision.powerUpApplicator;

import brickbreaker.model.world.World;

/**
 * Class to apply ball dimension powerUp to Ball.
 * Implements the {@link PowerUpApplicator} interface.
 */
public class BallDimApplicator implements PowerUpApplicator {
    
    private final Double DELTA = 0.13;
    private boolean bonus;

    /**
     * Ball Dimension constructor.
     * @param bonusToSet if increase or decrease the Ball dimension
     */
    public BallDimApplicator(final boolean bonusToSet) {
        this.bonus = bonusToSet;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void applyPowerUp(final World world) {
        Double d = bonus ? DELTA : -DELTA;
        world.getBalls().stream().forEach(b -> b.setRadius(b.getRadius() + d));
    }
}
