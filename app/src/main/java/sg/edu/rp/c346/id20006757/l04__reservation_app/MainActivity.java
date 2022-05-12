package sg.edu.rp.c346.id20006757.l04__reservation_app;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TimePicker;
import android.widget.Toast;
import android.os.Bundle;

import java.time.format.DateTimeFormatter;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);








        DatePicker dp;
        TimePicker tp;
        Button btnconfirm;
        Button btnreset;
        RadioButton smoking;
        RadioButton nosmoking;
        EditText name;
        EditText phone;
        EditText size;

        btnconfirm =findViewById(R.id.confirm);
        btnreset = findViewById(R.id.reset);
        smoking = findViewById(R.id.smoking);
        nosmoking = findViewById(R.id.nosmoking);
        dp =findViewById(R.id.datePicker);
        tp= findViewById(R.id.timePicker);
        name = findViewById(R.id.EditTextName);
        phone = findViewById(R.id.EditTextNo);
        size = findViewById(R.id.EditTextGroup);



        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action
                String booker = name.getText().toString();
                String number = phone.getText().toString();
                String group = size.getText().toString();
                int bookingdate = dp.getDayOfMonth();
                int bookingdatemonth = dp.getMonth();
                int bookingyear = dp.getYear();
                int bookinghour = tp.getCurrentHour();
                int minute = tp.getCurrentMinute();



                if (smoking.isChecked() && name.getText().toString().trim().length()>0 && phone.getText().toString().trim().length()>0 && size.getText().toString().trim().length()>0 ) {
                        Toast.makeText(MainActivity.this, "Name: " + booker + "\n Phone no:"
                                        + number + "\n Group Size:" + group + "\n Date " + bookingdate + "/"
                                        + bookingdatemonth + "/" + bookingyear + "\n Time " + bookinghour + ":" + minute +
                                        "\n Area: Smoking Area"
                                , Toast.LENGTH_SHORT).show();


                    } else  if (nosmoking.isChecked() && name.getText().toString().trim().length()>0 && phone.getText().toString().trim().length()>0 && size.getText().toString().trim().length()>0 ) {
                        Toast.makeText(MainActivity.this, "Name: " + booker + "\n Phone no:"
                                        + number + "\n Group Size:" + group + "\n Date " + bookingdate + "/"
                                        + bookingdatemonth + "/" + bookingyear + "\n Time " + bookinghour + ":" + minute +
                                        "\n Area: Non-Smoking Area"
                                , Toast.LENGTH_SHORT).show();
                }
                    else{

                        Toast.makeText(MainActivity.this, "Please input all values "
                                    , Toast.LENGTH_LONG).show();

            }
            }});

        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Code for the action

                name.setText(null);
                phone.setText(null);
                size.setText(null);
                dp.updateDate(2020, 05, 01);
                tp.setCurrentHour(19);
                tp.setCurrentMinute(30);


            }
        });
        }
    }

