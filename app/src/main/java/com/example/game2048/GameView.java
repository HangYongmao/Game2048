package com.example.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.GridLayout;


public class GameView extends GridLayout {

    public GameView(Context context, AttributeSet attr, int defStyle) {
        super(context, attr, defStyle);

        initGameView();
    }

    public GameView(Context context, AttributeSet attr) {
        super(context, attr);

        initGameView();
    }

    public GameView(Context context) {
        super(context);

        initGameView();
    }

    private void initGameView() {

    }

}
