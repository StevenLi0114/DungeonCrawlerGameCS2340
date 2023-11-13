package com.example.cs2340a_team11.View;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

import com.example.cs2340a_team11.View.Characters.BanditSprite;

public class BanditView extends View {
    private float x;
    private float y;

    private int move = 0;
    private BanditSprite banditSprite;


    public BanditView(Context context, float x, float y) {
        super(context);
        this.x = x;
        this.y = y;
        banditSprite = new BanditSprite(getResources());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(banditSprite.getSprite(), x, y, null);
    }

    public void updatePosition(float newX, float newY) {
        x = newX;
        y = newY;
        invalidate();
    }

    public void updatePosition() {
        if (move >= 16) {
            move = 0;
        }
        if (move < 4) {
            x += 160;
        } else if (move < 8) {
            y += 160;
        } else if (move < 12) {
            x -= 160;
        } else if (move < 16) {
            y -= 160;
        }
        move++;
        invalidate();
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

}