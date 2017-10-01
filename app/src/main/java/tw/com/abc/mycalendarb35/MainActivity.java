package tw.com.abc.mycalendarb35;

import android.app.DatePickerDialog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    private TextView mTxtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDatePickerDlg=(Button)findViewById(R.id.btndatepick);
        Button btnTimePickerDlg=(Button)findViewById(R.id.btntimepick);

        mTxtResult=(TextView) findViewById(R.id.txtResult);
        btnDatePickerDlg.setOnClickListener(btnDatePickerDlgOnClick);

    }
    private Button.OnClickListener btnDatePickerDlgOnClick=new Button.OnClickListener() {
        @Override
        public void onClick(View v) {
            mTxtResult.setText("");
            // Calendar 是用Java
            Calendar now = Calendar.getInstance();
            DatePickerDialog datePickerDlg = new DatePickerDialog(MainActivity.this,
                    aa,
                    now.get(Calendar.YEAR),
                    now.get(Calendar.MONTH),
                    now.get(Calendar.DAY_OF_MONTH)
                    );

        }
    };
    private DatePickerDialog.OnDateSetListener aa =new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

        }
    }

}
