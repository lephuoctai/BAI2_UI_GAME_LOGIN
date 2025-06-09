package com.todo.bai2_ui_game_login;

import android.app.ActionBar;
import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.button.MaterialButton;

public class ButtonG extends MaterialButton {
    public ButtonG(@NonNull Context context) {
        super(context);
        init();
    }

    public ButtonG(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonG(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }
    private void init() {
        int width = 256;
        int height = 64;

        setLayoutParams(new ActionBar.LayoutParams(width, height));
        setPadding(24, 0, 24, 0);
        setCornerRadius(6);
        setBackground(getContext().getDrawable(R.drawable.gradient));

    }

}
