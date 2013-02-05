package controllers;

import model.Picture;

/**
 * Created with IntelliJ IDEA.
 * User: MKanunnikov
 * Date: 29.01.13
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */
public class TempFactory {

    static final String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    static final String[] separator = {" ", ". ", ", "};


    public static void main(String[] args) {
        System.out.println("String <");
        System.out.println(getRandomString(5));
        System.out.println(">" +
                "");
        System.out.println("Text <");
        System.out.println(getRandomText(5, 7));
        System.out.println(">" +
                "");
    }

    static public Picture createPicture() {

        Picture picture = new Picture(getRandomString(5) + "Pic", 1);
        picture.setDescription(getRandomText(10, 7));
        picture.setYear(1990+getRandomInt(20));
        return picture;
    }

    static private String getRandomString(int length) {

        StringBuilder result = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            result.append(letters[getRandomInt(letters.length - 1)]);
        }
        return result.toString();
    }

    static private String getRandomText(int words, int wordLength) {

        StringBuilder result = new StringBuilder(words);
        for (int i = 0; i < words; i++) {
            result.append(getRandomString(getRandomInt(wordLength)));
            result.append(separator[getRandomInt(separator.length - 1)]);
        }
        result.append(".");
        return result.toString();
    }

    static private int getRandomInt(int until) {
        return (int) Math.round(Math.random() * (until));
    }

}
