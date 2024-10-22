package br.ulbra.appfolhapaga;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText etNome, etSalarioBruto, etNumeroFilhos;
    private RadioGroup rgSexo;
    private TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNome = findViewById(R.id.etNome);
        etSalarioBruto = findViewById(R.id.etSalarioBruto);
        etNumeroFilhos = findViewById(R.id.etNumeroFilhos);
        rgSexo = findViewById(R.id.rgSexo);
        tvResultado = findViewById(R.id.tvResultado);
        Button btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calcularSalarioLiquido();
            }
        });
    }

    private void calcularSalarioLiquido() {
        try {
            String nome = etNome.getText().toString();
            double salarioBruto = Double.parseDouble(etSalarioBruto.getText().toString());
            int numeroFilhos = Integer.parseInt(etNumeroFilhos.getText().toString());

            if (salarioBruto < 0 || numeroFilhos < 0) {
                Toast.makeText(this, "Por favor, insira valores válidos.", Toast.LENGTH_SHORT).show();
                return;
            }

            double descontoINSS = calcularINSS(salarioBruto);
            double descontoIR = calcularIR(salarioBruto);
            double salarioFamilia = (salarioBruto <= 1212.00) ? (56.47 * numeroFilhos) : 0;

            double salarioLiquido = salarioBruto - (descontoINSS + descontoIR) + salarioFamilia;

            String tratamento = rgSexo.getCheckedRadioButtonId() == R.id.rbMasculino ? "Sr. " : "Sra. ";
            tvResultado.setText(String.format("%s%s\nINSS: R$ %.2f\nIR: R$ %.2f\nSalário Líquido: R$ %.2f",
                    tratamento, nome, descontoINSS, descontoIR, salarioLiquido));

        } catch (NumberFormatException e) {
            Toast.makeText(this, "Por favor, preencha todos os campos corretamente.", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            Toast.makeText(this, "Ocorreu um erro: " + e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    private double calcularINSS(double salarioBruto) {
        if (salarioBruto <= 1212.00) return salarioBruto * 0.075;
        if (salarioBruto <= 2427.35) return salarioBruto * 0.09;
        if (salarioBruto <= 3641.03) return salarioBruto * 0.12;
        if (salarioBruto <= 7087.22) return salarioBruto * 0.14;
        return 0;
    }

    private double calcularIR(double salarioBruto) {
        if (salarioBruto <= 1903.98) return 0;
        if (salarioBruto <= 2826.65) return salarioBruto * 0.075;
        if (salarioBruto <= 3751.05) return salarioBruto * 0.15;
        if (salarioBruto <= 4664.68) return salarioBruto * 0.225;
        return 0;
    }
}