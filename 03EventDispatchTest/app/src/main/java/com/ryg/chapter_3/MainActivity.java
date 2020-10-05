package com.ryg.chapter_3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/*
* 涉及到的知识点
* 1 View 的坐标
* 2 View 的滑动  TestActivity
* 3 事件分发 DemoActivity_1 和 DemoActivity_2
 */

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v) {
        if (v.getId() == R.id.button1) {
            // 测试 view 的弹性滑动
            Intent intent = new Intent(this, TestActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button2) {
            // 外部拦截法 HorizontalScrollViewEx + ListView
            Intent intent = new Intent(this, DemoActivity_1.class);
            startActivity(intent);
        } else if (v.getId() == R.id.button3) {
            // 内部拦截法 HorizontalScrollViewEx2 + ListViewEx
            Intent intent = new Intent(this, DemoActivity_2.class);
            startActivity(intent);
        }
    }
}
