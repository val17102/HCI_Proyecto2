package val17102.edu.gt.smart_house;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class Control extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control);
        Switch switch1 = (Switch) findViewById(R.id.switch1);

        Boolean switch1State = switch1.isChecked();
    }
}
