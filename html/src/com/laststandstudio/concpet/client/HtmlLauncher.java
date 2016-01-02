package com.laststandstudio.concpet.client;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.gwt.GwtApplication;
import com.badlogic.gdx.backends.gwt.GwtApplicationConfiguration;
import com.google.gwt.user.client.Window;
import com.laststandstudio.concpet.Game;

public class HtmlLauncher extends GwtApplication {

        @Override
        public GwtApplicationConfiguration getConfig () {
                return new GwtApplicationConfiguration(Window.getClientWidth(), Window.getClientHeight());
        }

        @Override
        public ApplicationListener getApplicationListener () {
                return new Game();
        }
}