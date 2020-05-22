package com.techjd.pickingimage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {
    private WebView wv1;
    private EditText search;
    private Button look;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);



        Intent intent = getIntent();
        String str = intent.getStringExtra("TEXT");


        wv1 = findViewById(R.id.webview);

        search = findViewById(R.id.edt_srch);

        search.setText(str);

        look = findViewById(R.id.search);
        wv1.setWebViewClient(new WebViewClient());
        look.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searchable = search.getText().toString().trim();
                String text_to_search = "https://www.google.com/search?q="+searchable;
                wv1.loadUrl(text_to_search);
            }
        });


    }
}
