package com.example.yu_hsienchou.mvvmtuto1;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.example.yu_hsienchou.mvvmtuto1.command.UserLogin;
import com.example.yu_hsienchou.mvvmtuto1.databinding.ActivityMainBinding;
import com.example.yu_hsienchou.mvvmtuto1.model.User;
import com.example.yu_hsienchou.mvvmtuto1.viewmodel.UserModel;

/**
 * @see https://blog.csdn.net/qiang_xi/article/details/73849556
 */

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding activityMainBinding;
    private UserModel userModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        userModel = new UserModel(new User("username","password"));

        activityMainBinding.setLogin(userModel);

        activityMainBinding.setUserloginEvent(new UserLogin() {
            @Override
            public void onClickLogin() {
                Toast.makeText(MainActivity.this,"username:\t"+userModel.getEmail()+"\tpassword:\t"+userModel.getPassword(),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onClickClear() {
                userModel.setEmail("");
                userModel.setPassword("");
                activityMainBinding.setLogin(userModelfas);
            }
        });

    }
}
