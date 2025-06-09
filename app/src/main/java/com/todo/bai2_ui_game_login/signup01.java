package com.todo.bai2_ui_game_login;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class signup01 extends AppCompatActivity {
    private void linkText(View viewText, String src, ArrayList<String> spans, int idColor, View.OnClickListener listener) {
        MaterialTextView terms = (MaterialTextView) viewText;
        SpannableString spannableString = new SpannableString(src);
        int color = ContextCompat.getColor(this, idColor);

        for(String span : spans) {
            int start = src.indexOf(span);
            int end = start + span.length();

            spannableString.setSpan(
                    new ForegroundColorSpan(color),
                    start,
                    end,
                    spannableString.SPAN_EXCLUSIVE_EXCLUSIVE
            );
        };

        terms.setOnClickListener(listener);
        terms.setText(spannableString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup01);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView viewText = findViewById(R.id.signup_terms);
        String src = viewText.getText().toString();
        ArrayList<String> spans = new ArrayList<>();
        spans.add("Terms of Service");
        spans.add("Privacy Policy");
        int idColor = R.color.orange800;

        linkText((View)viewText,src, spans, idColor, (View v) -> {} );
    }
}