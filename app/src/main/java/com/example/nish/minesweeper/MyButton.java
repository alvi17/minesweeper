package com.example.nish.minesweeper;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;

/**
 * Created by Nishant on 1/30/2017.
 */

public class MyButton extends android.support.v7.widget.AppCompatButton{
    private int row;
    private int col;
    private int cellValue;
    private boolean isRevealed=false;
    public MyButton(Context context) {
        super(context);
    }

    public int getRow() {
        return row;
    }

    public void setRevealed() {
        isRevealed=true;
        if (isRevealed) {
            int mineValue =this.getCellValue();
            if (mineValue == 0){
                setText("");
                int greenColorValue = Color.parseColor("#4da959");
                setBackgroundResource(R.drawable.button_green_back);
            } else if (mineValue == MainActivity.MINE) {

                setBackgroundResource(R.drawable.button_mine_back);
            } else {
                setBackgroundResource(R.drawable.button_selector);
                setText(""+mineValue);
            }
        }
    }

    public int getCol() {
        return col;

    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getCellValue() {
        return cellValue;
    }

    public void setCellValue(int cellValue) {
        this.cellValue = cellValue;
    }

    public void setRow(int row) {
        this.row = row;
    }
    public boolean isRevealed() {
        return isRevealed;
    }
}
