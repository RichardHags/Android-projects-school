package java17.totoro.calculatorv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    private Button btnAdd, btnSubtract, btnMult, btnDivide, btnEqual, btnClear,
            btnDecimal, btnBack, btnBracket, btnPercentage;
    private TextView tvInput, tvResult, tvWarning;

    private double val1, val2;
    private final char ADDITION = '+';
    private final char SUBTRACTION = '-';
    private final char MULTIPLICATION = '*';
    private final char DIVISION = '/';
    private final char PERCENTAGE = '%';
    private char FUNCTION;
    private String savedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupUi();
        clearScreen();

        /******************************************************
         * Number Buttons 0-9
         ******************************************************/

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "9");
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(tvInput.getText().toString() + "0");
            }
        });

        /******************************************************
         * Functional Buttons + - * / %
         ******************************************************/

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvInput.getText().toString());
                FUNCTION = ADDITION;
                tvInput.setText(tvInput.getText().toString() + "+");
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvInput.getText().toString());
                FUNCTION = SUBTRACTION;
                tvInput.setText(tvInput.getText().toString() + "-");
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvInput.getText().toString());
                FUNCTION = MULTIPLICATION;
                tvInput.setText(tvInput.getText().toString() + "*");
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvInput.getText().toString());
                FUNCTION = DIVISION;
                tvInput.setText(tvInput.getText().toString() + "/");
            }
        });

        btnPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                val1 = Double.parseDouble(tvInput.getText().toString());
                FUNCTION = PERCENTAGE;
                tvInput.setText(tvInput.getText().toString() + "%");
            }
        });

        /******************************************************
         * Other Functional Buttons
         ******************************************************/

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
                if (FUNCTION == DIVISION) {
                    if (val2 == 0) {
                        tvResult.setText("");
                    } else {
                        tvResult.setText(String.valueOf(val1));
                    }
                } else {
                    tvResult.setText(String.valueOf(val1));
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearScreen();
            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                if (savedValue.length() > 0) {
                    savedValue = savedValue.substring(0, savedValue.length() - 1);
                    tvInput.setText(savedValue);
                } else {
                    tvResult.setText("");
                }
            }
        });

        btnDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedValue = tvInput.getText().toString();
                tvInput.setText(savedValue + ".");
            }
        });

    }

    private void clearScreen() {
        tvInput.setText("");
        tvResult.setText("");
        tvWarning.setText("");
    }

    private void setupUi() {

        btn1 = (Button) findViewById(R.id.btn_one);
        btn2 = (Button) findViewById(R.id.btn_two);
        btn3 = (Button) findViewById(R.id.btn_three);
        btn4 = (Button) findViewById(R.id.btn_four);
        btn5 = (Button) findViewById(R.id.btn_five);
        btn6 = (Button) findViewById(R.id.btn_six);
        btn7 = (Button) findViewById(R.id.btn_seven);
        btn8 = (Button) findViewById(R.id.btn_eight);
        btn9 = (Button) findViewById(R.id.btn_nine);
        btn0 = (Button) findViewById(R.id.btn_zero);

        btnAdd = (Button) findViewById(R.id.btn_add);
        btnSubtract = (Button) findViewById(R.id.btn_subtract);
        btnMult = (Button) findViewById(R.id.btn_mult);
        btnDivide = (Button) findViewById(R.id.btn_divide);
        btnDecimal = (Button) findViewById(R.id.btn_decimal);
        btnPercentage = (Button) findViewById(R.id.btn_percentage);
        btnBracket = (Button) findViewById(R.id.btn_brackets);

        btnBack = (Button) findViewById(R.id.btn_back);
        btnEqual = (Button) findViewById(R.id.btn_equal);
        btnClear = (Button) findViewById(R.id.btn_clear);

        tvInput = (TextView) findViewById(R.id.tv_input);
        tvResult = (TextView) findViewById(R.id.tv_result);
        tvWarning = (TextView) findViewById(R.id.tv_warning);
    }

    private void getValueTwo(Character x) {
        val2 = Double.parseDouble(tvInput.getText().toString().substring(savedValue.lastIndexOf(x) + 1));
    }

    private void calculate() {

        switch (FUNCTION) {
            case ADDITION:
                getValueTwo(ADDITION);
                val1 += val2;
                break;
            case SUBTRACTION:
                getValueTwo(SUBTRACTION);
                val1 -= val2;
                break;
            case MULTIPLICATION:
                getValueTwo(MULTIPLICATION);
                val1 *= val2;
                break;
            case DIVISION:
                getValueTwo(DIVISION);
                if (val2 == 0) {
                    // val1 /= val2;
                    // Double.isInfinite(val1);
                    // Double.isNaN(val1);
                    tvWarning.setText("You cant divide by zero");
                    break;
                } else
                    val1 /= val2;
                break;
            case PERCENTAGE:
                getValueTwo(PERCENTAGE);
                val1 = val1 / 100;
                break;

        }
    }


}
