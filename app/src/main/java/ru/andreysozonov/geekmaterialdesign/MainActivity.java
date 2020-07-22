package ru.andreysozonov.geekmaterialdesign;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextInputLayout passwordLayout = findViewById(R.id.inputLayoutPassword);
        final TextInputEditText passwordEditText = findViewById(R.id.editTextPassword);
        final TextInputEditText loginEditText = findViewById(R.id.editTextLogin);
        final TextInputEditText emailEditText = findViewById(R.id.editTextEmail);

        Button buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pass = passwordEditText.getText().toString();
                if (pass.length() <8 ) {
                    passwordLayout.setError(getString(R.string.passError));
                } else if (!loginEditText.getText().toString().isEmpty() && !emailEditText.getText().toString().isEmpty()) {
                    final Snackbar snackbar = Snackbar.make(view, "Submit successful", Snackbar.LENGTH_INDEFINITE);
                    snackbar.show();
                    snackbar.setAction("Ok", new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            snackbar.dismiss();
                        }
                    });


                }
            }
        });
        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                passwordLayout.setError(null);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }
}
