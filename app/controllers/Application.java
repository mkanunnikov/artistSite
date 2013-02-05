package controllers;

import model.Picture;
import play.*;
import play.mvc.*;

import views.html.*;

import java.util.ArrayList;
import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result about() {
        return ok(about.render());
    }

    public static Result gallery(Integer pageSize) {
        List<Picture> pictures = new ArrayList<Picture>();
        Picture picture = TempFactory.createPicture();
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        pictures.add(TempFactory.createPicture());
        return ok(gallery.render(pageSize, pictures));
    }

    public static Result order() {
        return ok(order.render());
    }

}