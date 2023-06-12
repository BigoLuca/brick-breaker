package brickbreaker.common;

import javafx.scene.image.Image;

/**
 * Game Images enum with name files.
 */
public enum GameImages {

    /** Forest landscape. */
    FOREST_LANDSCAPE("forest.png"),

    /** Space landscape. */
    SPACE_LANDSCAPE("background.jpg"),

    /** Night sky. */
    NIGHT_SKY("night-sky.jpg"),

    /** Sea landscape. */
    SEA_LANDSCAPE("nickname.png"),

    /** City landscape. */
    CITY_LANDSCAPE("City.png"),

    /** Game icon. */
    GAME_ICON("nickname.png"),

    /** Easy difficulty. */
    EASY_DIFFICULTY("easy.png"),

    /** Medium difficulty. */
    MEDIUM_DIFFICULTY("medium.png"),

    /** Hard difficulty. */
    HARD_DIFFICULTY("hard.png"),

    /** Mix difficulty. */
    MIX_DIFFICULTY("mix.png"),

    /** Nickname label. */
    NICKNAME_LABEL("nickname.png"),

    /** Type your name label */
    TYPE_YOUR_NAME_LABEL("typeYourName.png"),

    /** Pick a level. */
    PICK_A_LEVEL("pickALevel.png"),

    /** Next. */
    NEXT("next.png"),

    /** Previous. */
    PREVIOUS("previous.png"),

    /** Not loaded item. */
    NOT_LOADED_ITEM("nickname.png"),

    /** Title. */
    TITLE("Title.png"),

    /** Endless mode choice. */
    ENDLESS_MODE_CHOICE("endless.png"),

    /** Leevls label. */
    LEVELS_LABEL("levels.png"),

    /** Levels mode choice. */
    LEVELS_MODE_CHOICE("start.png"),

    /** Leaderboard choice. */
    LEADERBOARD_CHOICE("leaderboards.png"),

    /** Up arrow. */
    UP_ARROW("upArrow.png"),

    /** Down arrow. */
    DOWN_ARROW("downArrow.png"),

    /** Right arrow. */
    RIGHT_ARROW("rightArrow.png"),

    /** Left arrow. */
    LEFT_ARROW("leftArrow.png"),

    /** Player lost. */
    PLAYER_LOST("youLost.png"),

    /** Player win. */
    PLAYER_WIN("youWin.png");

    private final String RES_PATH = "images/";
    private String fileName;
    private Image image;

    GameImages(final String fileName) {
        this.fileName = fileName;
    }

    /**
     * Mathod to set the file Image.
     * @param image
     */
    public void setImage(final Image image) {
        this.image = image;
    }

    /**
     * Method to get the Image.
     * @return
     */
    public Image getImage() {
        return this.image;
    }

    /**
     * Method to get the absolute path.
     */
    public String getFilePath() {
        return RES_PATH + this.fileName;
    }
}
