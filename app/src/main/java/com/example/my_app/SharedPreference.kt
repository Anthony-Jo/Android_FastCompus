package com.example.my_app

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_shared_preference.*

class SharedPreference : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        /*  Mode
        *       MODE_PRIVATE : 생성한 App에서만 사용가능
        *       MODE_WORLD_READABLE: 다른 App에서 읽기만 가능
        *       MODE_WORLD_WRITEABLE: 다른 App에서 읽기/쓰기 가능
        *       MODE_MULTI_PROCESS: 이미 호출되어 사용중인지 확인
        *       MODE_APPEND: 기존 preference에 신규 추가                                       */
/*        val editor :SharedPreferences.Editor = sharedPrefernce.edit()
        editor.putString("hello1", "안녕하세요")
        //editor.commit()
*/
        /*  sp1 -> Sharedpreference
        *           (Key, Value) -> ("Hello", "안녕하세요")                                    */

        save_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor: SharedPreferences.Editor = sharedPreference.edit()
            editor.putString("hello", "안녕하세요")
            editor.putString("goodbye", "안녕히가세요")
            editor.commit()
        }

        load_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val value1 = sharedPreference.getString("hello", "데이터 없음")
            val value2 = sharedPreference.getString("goodbye", "데이터 없음")
            Log.d("key-value", "Value: $value1")
            Log.d("key-value", "Value: $value2")
        }

        delete_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.remove("hello")
            editor.commit()
        }

        delete_all_btn.setOnClickListener {
            val sharedPreference = getSharedPreferences("sp1", Context.MODE_PRIVATE)
            val editor = sharedPreference.edit()
            editor.clear()
            editor.commit()
        }
    }
}