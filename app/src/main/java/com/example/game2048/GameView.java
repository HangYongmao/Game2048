package com.example.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
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
        setOnTouchListener(new OnTouchListener() {

            private float startX, startY, offsetX, offsetY;

            @Override
            public boolean onTouch(View v, MotionEvent event) {

                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startX = event.getX();
                        startY = event.getY();
                        break;

                    case MotionEvent.ACTION_UP:
                        offsetX = event.getX() - startX;
                        offsetY = event.getY() - startY;

                        if (Math.abs(offsetX) > Math.abs(offsetY)) {
                            if (offsetX < -5) {
                                Log.d("GameView", "left");
                            } else if (offsetX > 5) {
                                Log.d("GameView", "right");
                            }
                        } else {
                            if (offsetY < -5) {
                                Log.d("GameView", "up");
                            } else if (offsetY > 5) {
                                Log.d("GameView", "down");
                            }
                        }
                        break;

                    default:
                        break;
                }

                return true;
            }
        });
    }

}
