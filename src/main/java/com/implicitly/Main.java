package com.implicitly;

import org.rapidoid.setup.App;
import org.rapidoid.setup.On;

/**
 * Класс
 * =====
 *
 * @author EMurzakaev@it.ru.
 */
public class Main {

    public static void main(String[] args) {
        App.bootstrap(args);
        On.get("/size").json((String msg) -> msg.length());
    }

}
