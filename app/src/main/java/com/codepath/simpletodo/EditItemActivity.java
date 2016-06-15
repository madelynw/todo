package com.codepath.simpletodo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class EditItemActivity extends AppCompatActivity {

    EditText etEnterItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        etEnterItem = (EditText) findViewById(R.id.etEnterItem);
        etEnterItem.setText(getIntent().getStringExtra("Task"));
    }

    public void onSave(View v) {
        Intent data = new Intent(EditItemActivity.this, MainActivity.class);
        data.putExtra("NewPosition", getIntent().getExtras().getInt("Position"));
        data.putExtra("NewTask", etEnterItem.getText().toString());
        setResult(RESULT_OK, data);
        finish();
    }
}
