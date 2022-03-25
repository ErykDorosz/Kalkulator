package com.example.kalkulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.mariuszgromada.math.mxparser.*;

import java.util.Objects;

public class AdvancedCalculatorActivity extends AppCompatActivity
{

    private EditText display;
    private final SimpleCalculatorActivity simpleCalculator = new SimpleCalculatorActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_advanced_calculator);
        Objects.requireNonNull(getSupportActionBar()).hide();

        display = findViewById(R.id.textView);
        display.setShowSoftInputOnFocus(false);
        simpleCalculator.setDisplay(display);

    }

    public void buttonClicked(View view)
    {

        if (view.getId() == R.id.number9)
        {
            simpleCalculator.number9(view);
        }
        else if (view.getId() == R.id.number8)
        {
            simpleCalculator.number8(view);
        }
        else if (view.getId() == R.id.number7)
        {
            simpleCalculator.number7(view);
        }
        else if (view.getId() == R.id.number6)
        {
            simpleCalculator.number6(view);
        }
        else if (view.getId() == R.id.number5)
        {
            simpleCalculator.number5(view);
        }
        else if (view.getId() == R.id.number4)
        {
            simpleCalculator.number4(view);
        }
        else if (view.getId() == R.id.number3)
        {
            simpleCalculator.number3(view);
        }
        else if (view.getId() == R.id.number2)
        {
            simpleCalculator.number2(view);
        }
        else if (view.getId() == R.id.number1)
        {
            simpleCalculator.number1(view);
        }
        else if (view.getId() == R.id.number0)
        {
            simpleCalculator.number0(view);
        }
        else if (view.getId() == R.id.backspaceButton)
        {
            simpleCalculator.backspaceButton(view);
        }
        else if (view.getId() == R.id.clearButton)
        {
            simpleCalculator.clearButton(view);
        }
        else if (view.getId() == R.id.dotButton)
        {
            simpleCalculator.dotButton(view);
        }
        else if (view.getId() == R.id.equalsButton)
        {
            simpleCalculator.equalsButton(view);
        }
        else if (view.getId() == R.id.changeSignButton)
        {
            simpleCalculator.changeSignButton(view);
        }
        else if (view.getId() == R.id.divisionButton)
        {
            simpleCalculator.divisionButton(view);
        }
        else if (view.getId() == R.id.multiplicationButton)
        {
            simpleCalculator.multiplicationButton(view);
        }
        else if (view.getId() == R.id.subtractionButton)
        {
            simpleCalculator.subtractionButton(view);
        }
        else if (view.getId() == R.id.additionButton)
        {
            simpleCalculator.additionButton(view);
        }

    }

    public void sinButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "sin(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void cosButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "cos(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void tanButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "tan(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void logNormButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "ln(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void sqrtButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "sqrt(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void squareButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "(" + input + ")^2";

            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void powerButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String result = "(" + input + ")^";
            display.setText(result);
            display.setSelection(result.length());
        }
    }

    public void logButton(View view)
    {
        if (simpleCalculator.checkLastCharacter())
        {
            String input = display.getText().toString();
            String userExp = "log10(" + input + ")";
            Expression exp = new Expression(userExp);
            String result = String.valueOf(exp.calculate());
            display.setText(result);
            display.setSelection(result.length());
        }
    }

}