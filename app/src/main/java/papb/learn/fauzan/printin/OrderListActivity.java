package papb.learn.fauzan.printin;

import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OrderListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_list);

        getOrderFragment();
    }

    private void getOrderFragment(){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContainer, new OrderFragment()).commit();
    }
}
