package com.example.rosanne.mrpotatohead;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selectItem(View view) {
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkBox_hat:
                ImageView hat = (ImageView) findViewById(R.id.imageView_hat);
                if(checked){
                    hat.setVisibility(View.VISIBLE);
                }
                else {
                    hat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_eyes:
                ImageView eyes = (ImageView) findViewById(R.id.imageView_eyes);
                if(checked){
                    eyes.setVisibility(View.VISIBLE);
                }
                else{
                    eyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_ears:
                ImageView ears = (ImageView) findViewById(R.id.imageView_ears);
                if(checked){
                    ears.setVisibility(View.VISIBLE);
                }
                else{
                    ears.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_arms:
                ImageView arms = (ImageView) findViewById(R.id.imageView_arms);
                if(checked){
                    arms.setVisibility(View.VISIBLE);
                }
                else{
                    arms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_shoes:
                ImageView shoes = (ImageView) findViewById(R.id.imageView_shoes);
                if(checked){
                    shoes.setVisibility(View.VISIBLE);
                }
                else {
                    shoes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_eyebrows:
                ImageView eyebrows = (ImageView) findViewById(R.id.imageView_eyebrows);
                if(checked){
                    eyebrows.setVisibility(View.VISIBLE);
                }
                else {
                    eyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_glasses:
                ImageView glasses = (ImageView) findViewById(R.id.imageView_glasses);
                if(checked){
                    glasses.setVisibility(View.VISIBLE);
                }
                else {
                    glasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_mustache:
                ImageView mustache = (ImageView) findViewById(R.id.imageView_mustache);
                if(checked){
                    mustache.setVisibility(View.VISIBLE);
                }
                else {
                    mustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_mouth:
                ImageView mouth = (ImageView) findViewById(R.id.imageView_mouth);
                if(checked){
                    mouth.setVisibility(View.VISIBLE);
                }
                else {
                    mouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBox_nose:
                ImageView nose = (ImageView) findViewById(R.id.imageView_nose);
                if(checked){
                    nose.setVisibility(View.VISIBLE);
                }
                else {
                    nose.setVisibility(View.INVISIBLE);
                }
                break;
        }
     }
}