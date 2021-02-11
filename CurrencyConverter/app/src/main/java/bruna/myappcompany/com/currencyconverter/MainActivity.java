package bruna.myappcompany.com.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertFunction(View view) {
        Log.i("Info", "Button pressed");
        EditText editText = (EditText) findViewById(R.id.valueEditText);

        String amountInReal = editText.getText().toString();
        double amountInRealDouble = Double.parseDouble(amountInReal);
        double amountInDollarsDouble = amountInRealDouble * 5.53;
        String amountInDollarsString = String.format("%.2f",amountInDollarsDouble);

        Toast.makeText(this, "O valor de R$"+ amountInReal + " é $" + amountInDollarsString + " na moeda americana.", Toast.LENGTH_LONG).show();

        Log.i("Amount in dollars", amountInDollarsString);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}