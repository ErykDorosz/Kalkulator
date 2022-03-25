package com.example.kalkulator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.mariuszgromada.math.mxparser.*;

import java.util.Objects;

public class SimpleCalculatorActivity extends AppCompatActivity
{

    private EditText display;

    public void setDisplay(EditText display)
    {
        this.display = display;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_simple_calculator);
        Objects.requireNonNull(getSupportActionBar()).hide();

        display = findViewById(R.id.textView);
        display.setShowSoftInputOnFocus(false);
    }

    private void updateText(String strToAdd)
    {
        String oldStr = display.getText().toString();
        int cursorPos = display.getSelectionStart();
        String leftString = oldStr.substring(0, cursorPos);
        String rightStr = oldStr.substring(cursorPos);
        if (display.getText().equals(""))
        {
            display.setText(strToAdd);
        } else
        {
            display.setText(String.format("%s%s%s", leftString, strToAdd, rightStr));
            display.setSelection(cursorPos + 1);
        }

    }

    boolean checkLastCharacter()
    {
        String stringToCheck = display.getText().toString();

        return !stringToCheck.endsWith("/") && !stringToCheck.endsWith("*")
                && !stringToCheck.endsWith("-") && !stringToCheck.endsWith(".") && !stringToCheck.equals("");
    }

    private boolean lookForSpecialCharacters()
    {
        String stringToCheck = display.getText().toString();

        return stringToCheck.contains("/") || stringToCheck.contains("*") || stringToCheck.equals("");
    }

    private boolean checkForDots()
    {
        String stringToCheck = display.getText().toString();

        return stringToCheck.contains(".");
    }

    public void number0(View view)
    {
        updateText("0");
    }

    public void number1(View view)
    {
        updateText("1");
    }

    public void number2(View view)
    {
        updateText("2");
    }

    public void number3(View view)
    {
        updateText("3");
    }

    public void number4(View view)
    {
        updateText("4");
    }

    public void number5(View view)
    {
        updateText("5");
    }

    public void number6(View view)
    {
        updateText("6");
    }

    public void number7(View view)
    {
        updateText("7");
    }

    public void number8(View view)
    {
        updateText("8");
    }

    public void number9(View view)
    {
        updateText("9");
    }

    public void backspaceButton(View view)
    {
        int cursorPos = display.getSelectionStart();
        int textLen = display.getText().length();

        if (cursorPos != 0 && textLen != 0)
        {
            SpannableStringBuilder selection = (SpannableStringBuilder) display.getText();
            selection.replace(cursorPos - 1, cursorPos, "");
            display.setText(selection);
            display.setSelection(cursorPos - 1);
        }
    }

    public void clearButton(View view)
    {
        display.setText("");
    }

    public void dotButton(View view)
    {
        if (checkLastCharacter() && !checkForDots())
        {
            updateText(".");
        }
    }

    public void equalsButton(View view)
    {
        if (checkLastCharacter())
        {
            String userExp = display.getText().toString();

            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());

            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void changeSignButton(View view)
    {
        if (checkLastCharacter() && !lookForSpecialCharacters())
        {
            String input = display.getText().toString();
            if (!input.startsWith("-"))
            {
                String result = "-" + input;
                display.setText(result);
                display.setSelection(result.length());
            } else
            {
                String result = input.substring(1);
                display.setText(result);
                display.setSelection(result.length());
            }

        }

    }

    public void divisionButton(View view)
    {
        if (checkLastCharacter())
        {
            updateText("/");
        }
    }

    public void multiplicationButton(View view)
    {
        if (checkLastCharacter())
        {
            updateText("*");
        }

    }

    public void subtractionButton(View view)
    {
        if (checkLastCharacter())
        {
            updateText("-");
        }
        if (display.getText().toString().equals(""))
        {
            updateText("-");
        }
    }

    public void additionButton(View view)
    {
        if (checkLastCharacter())
        {
            updateText("+");
        }
    }

}